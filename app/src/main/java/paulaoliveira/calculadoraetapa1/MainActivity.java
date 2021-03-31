package paulaoliveira.calculadoraetapa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView input, signBox;
    private String sinal, valor1, valor2;
    boolean temVirgula;
    Double num1, num2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sinal);

        temVirgula = false;
    }

    public void addBtn0 (View view){
        input.setText(input.getText() + "0");
    }

    public void addBtn1 (View view){
        input.setText(input.getText() + "1");
    }

    public void addBtn2 (View view){
        input.setText(input.getText() + "2");
    }

    public void addBtn3 (View view){
        input.setText(input.getText() + "3");
    }

    public void addBtn4 (View view){
        input.setText(input.getText() + "4");
    }

    public void addBtn5 (View view){
        input.setText(input.getText() + "5");
    }

    public void addBtn6 (View view){
        input.setText(input.getText() + "6");
    }

    public void addBtn7 (View view){
        input.setText(input.getText() + "7");
    }

    public void addBtn8 (View view){
        input.setText(input.getText() + "8");
    }

    public void addBtn9 (View view){
        input.setText(input.getText() + "9");
    }

    public void btnVirgula(View view) {
        if (!temVirgula) {
            if (input.getText().equals("")) {
                input.setText("0.");
            } else {
                input.setText(input.getText() + ".");
            }
            temVirgula = true;
        }
    }

    public void adicao (View view) {
        sinal = "+";
        valor1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        temVirgula = false;
    }

    public void subtracao (View view) {
        sinal = "-";
        valor1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        temVirgula = false;
    }

    public void multiplicacao (View view) {
        sinal = "*";
        valor1 = input.getText().toString();
        input.setText(null);
        signBox.setText("*");
        temVirgula = false;
    }

    public void divisao (View view) {
        sinal = "/";
        valor1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        temVirgula = false;
    }

    public void igual (View view){
        if (sinal == null) {
            signBox.setText("Error!");
        } else if (input.getText().equals("")) {
            signBox.setText("Error!");
        } else if ((sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/")) && sinal.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sinal) {
                default:
                    break;
                case "+":
                    valor2 = input.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 + num2;
                    input.setText(resultado + "");
                    sinal = null;
                    signBox.setText(null);
                    break;
                case "-":
                    valor2 = input.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 - num2;
                    input.setText(resultado + "");
                    sinal = null;
                    signBox.setText(null);
                    break;
                case "*":
                    valor2 = input.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 * num2;
                    input.setText(resultado + "");
                    sinal = null;
                    signBox.setText(null);
                    break;
                case "/":
                    valor2 = input.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 / num2;
                    input.setText(resultado + "");
                    sinal = null;
                    signBox.setText(null);
                    break;
            }
        }
    }

    public void btnLimpa(View view) {
        input.setText(null);
        signBox.setText(null);
        valor1 = null;
        valor2 = null;
        sinal = null;
        temVirgula = false;
    }
}
