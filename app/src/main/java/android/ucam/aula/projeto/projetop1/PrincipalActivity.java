package android.ucam.aula.projeto.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrincipalActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;
    private Button acessar;
    private Button limpar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        email = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenha);
        acessar = (Button) findViewById(R.id.buttonAcessar);
        limpar = (Button) findViewById(R.id.buttonLimpar);
        resultado = (TextView) findViewById(R.id.textViewResultado);

        acessar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(email.getText().toString().equalsIgnoreCase("admin@admin.com") && senha.getText().toString().equalsIgnoreCase("12345"))
                {
                    Intent trocadorTela = new Intent(PrincipalActivity.this, CadastroActivity.class);
                    startActivity(trocadorTela);
                }else{
                    resultado.setText("Usuário ou senha inválidos.");
                }
            }
        });

        limpar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                email.setText("");
                senha.setText("");
                resultado.setText("");
            }
        });
    }
}
