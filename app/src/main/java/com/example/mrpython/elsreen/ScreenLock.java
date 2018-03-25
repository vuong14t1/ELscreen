package com.example.mrpython.elsreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mrpython.elsreen.module.game.Data.GameBase;
import com.example.mrpython.elsreen.module.game.Data.Player;
import com.example.mrpython.elsreen.module.game.Data.Question;

public class ScreenLock extends AppCompatActivity {
    // GUI
    private TextView txtName, txtLevel, txtQuestion;
    private RadioButton rdAnswerA, rdAnswerB, rdAnswerC, rdAnswerD;
    private Button btnUnLock;

    // Logic
    GameBase gameBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_lock);
        this.addControls();
        this.addEvents();
    }
    public void addControls(){
        this.txtName = findViewById(R.id.txtName);
        this.txtLevel = findViewById(R.id.txtLevel);
        this.txtQuestion = findViewById(R.id.txtQuestion);

        this.rdAnswerA = findViewById(R.id.rdAnswerA);
        this.rdAnswerB = findViewById(R.id.rdAnswerB);
        this.rdAnswerC = findViewById(R.id.rdAnswerC);
        this.rdAnswerD = findViewById(R.id.rdAnswerD);

        this.btnUnLock = findViewById(R.id.btnUnLock);
        //
        this.gameBase = new GameBase();
        this.gameBase.setData();
        this.updateGUI();
    }
    public void updateGUI(){
        this.updateInfo();
        this.updateQuestion();
    }
    public void updateQuestion(){
        Question qs = this.gameBase.getQuestion();
        qs.suffletAnswer();
        this.txtQuestion.setText(String.valueOf(qs.getQuestion()));
        this.rdAnswerA.setText(String.valueOf(qs.getListAnswer().get(0)));
        this.rdAnswerB.setText(String.valueOf(qs.getListAnswer().get(1)));
        this.rdAnswerC.setText(String.valueOf(qs.getListAnswer().get(2)));
        this.rdAnswerD.setText(String.valueOf(qs.getListAnswer().get(3)));
    }
    public void updateInfo(){
        Player pl = this.gameBase.getPlayer();
        this.txtName.setText(String.valueOf(pl.getName()));
        this.txtLevel.setText(String.valueOf("Level : " + pl.getLevel()));
    }
    public void addEvents(){
        this.btnUnLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "unlock", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
