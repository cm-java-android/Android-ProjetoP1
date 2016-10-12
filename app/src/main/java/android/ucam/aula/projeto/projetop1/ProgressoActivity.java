package android.ucam.aula.projeto.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.Random;

public class ProgressoActivity extends AppCompatActivity {

    private ImageButton voltar;
    private ProgressBar progAulas;
    private ProgressBar progExecs;
    private ProgressBar progLabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso);

        voltar = (ImageButton) findViewById(R.id.ImagemButtonVoltar);
        progAulas = (ProgressBar) findViewById(R.id.ProgressBarProgAulas);
        progExecs = (ProgressBar) findViewById(R.id.ProgressBarProgExecs);
        progLabs = (ProgressBar) findViewById(R.id.ProgressBarProgLabs);

        PreencheBarra();

        voltar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent trocadorTela = new Intent(ProgressoActivity.this, TarefaActivity.class);
                startActivity(trocadorTela);
            }
        });
    }

    private void PreencheBarra(){
        Random gerador = new Random();

        for (int i = 0; i < 1; i++){
            progAulas.setProgress(gerador.nextInt(101));
            progExecs.setProgress(gerador.nextInt(101));
            progLabs.setProgress(gerador.nextInt(101));
        }
    }
}
