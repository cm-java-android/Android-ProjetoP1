package android.ucam.aula.projeto.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

public class TarefaActivity extends AppCompatActivity {

    private Spinner listaCursos;
    private Spinner listaAulas;
    private TextView aula;
    private CheckBox exec;
    private CheckBox lab;
    private ProgressBar progressoBar;
    private Button progresso;
    private Button cadastro;
    private Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa);

        listaCursos = (Spinner) findViewById(R.id.spinnerCurso);
        listaAulas = (Spinner) findViewById(R.id.spinnerAula);
        aula = (TextView) findViewById(R.id.textViewAula);
        exec = (CheckBox) findViewById(R.id.checkBoxExec);
        lab = (CheckBox) findViewById(R.id.checkBoxLab);
        progressoBar = (ProgressBar) findViewById(R.id.progressBarTarefas);
        progresso = (Button) findViewById(R.id.buttonProgresso);
        cadastro = (Button) findViewById(R.id.buttonCadastro);
        sair = (Button) findViewById(R.id.buttonSair);

        listaCursos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                progressoBar.setProgress(0);
                exec.setChecked(false);
                lab.setChecked(false);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        listaAulas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String aulaSelecionada = (String) parent.getItemAtPosition(position);
                aula.setText(aulaSelecionada.toString());
                progressoBar.setProgress(0);
                exec.setChecked(false);
                lab.setChecked(false);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PreencheBarra();
            }
        });

        lab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PreencheBarra();
            }
        });

        progresso.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent trocadorTela = new Intent(TarefaActivity.this, ProgressoActivity.class);
                startActivity(trocadorTela);
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent trocadorTela = new Intent(TarefaActivity.this, CadastroActivity.class);
                startActivity(trocadorTela);
            }
        });

        sair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent trocadorTela = new Intent(TarefaActivity.this, PrincipalActivity.class);
                startActivity(trocadorTela);
            }
        });

    }
        private void PreencheBarra(){
            if(exec.isChecked() && lab.isChecked()){
                progressoBar.setProgress(100);
            }else if(exec.isChecked()){
                progressoBar.setProgress(50);
            }else if(lab.isChecked()){
                progressoBar.setProgress(50);
            }else{
                progressoBar.setProgress(0);
            }
        }
}