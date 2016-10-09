package android.ucam.aula.projeto.projetop1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;
    private Button acessar;
    private Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        email = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenha);
        acessar = (Button) findViewById(R.id.buttonAcessar);
        limpar = (Button) findViewById(R.id.buttonLimpar);

        limpar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                email.setText("");
                senha.setText("");
            }
        });
    }
}
