package br.com.androidpro.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = (TextView) findViewById(R.id.output);
        out.setText("");
    }

    public void sum(View view) {
        //Componentes GUI x Objetos
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        if(num1.length() != 0 && num2.length() != 0) {
            //Captura o número digitado e converte para inteiro
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            //Soma e escreve na interface o resultado
            out.setText(String.valueOf(n1+n2));
        } else {
            Toast msg = Toast.makeText(this, "Não deixe os campos de entradas vazios.", Toast.LENGTH_SHORT);
            msg.show();
        }
    }
}
