package com.example.android.willywonka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int totalRight = 0;
    CheckBox scrumpdiddlyumtious;
    CheckBox skrunch;
    CheckBox wonkaBar;
    CheckBox oompas;
    Button submit;
    int score1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void checkAnswers (View view){
    boolean answer0 = scrumpdiddlyumtious.isChecked();
    boolean answer1 = wonkaBar.isChecked();

    if (answer1 && answer0) {
        score1 = 1;
    } else {
        score1 = 0;
    }

}
    public void submitQuiz (View view) {
Toast.makeText(getApplicationContext(),"Congratulations! \nYou got " + totalRight + " out of 6 answers right!", Toast.LENGTH_LONG).show();

    }
}
