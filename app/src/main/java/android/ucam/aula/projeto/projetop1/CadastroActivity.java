package android.ucam.aula.projeto.projetop1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText matricula;
    private EditText email;
    private EditText contaGit;
    private Button cadastrar;
    private Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.editTextCadNome);
        matricula = (EditText) findViewById(R.id.editTextCadMatricula);
        email = (EditText) findViewById(R.id.editTextCadEmail);
        contaGit = (EditText) findViewById(R.id.editTextCadConta);
        cadastrar = (Button) findViewById(R.id.buttonCadCadastrar);
        limpar = (Button) findViewById(R.id.buttonCadLimpar);

        cadastrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

        limpar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                nome.setText("");
                matricula.setText("");
                email.setText("");
                contaGit.setText("");
            }
        });
    }
}

