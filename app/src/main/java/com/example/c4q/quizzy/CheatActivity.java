package com.example.c4q.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends QuizActivity  {

    private static final int CHEATED_STATUS = 222;
    private Question currentQuestion;
    private Question [] copyOfQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_cheat);
        copyOfQuestions = super.questionBank;
        setResult(CHEATED_STATUS);

        Button button = (Button) findViewById(R.id.cheat_button);
        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);

        Intent intent;
        intent = getIntent();
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
        currentQuestion= copyOfQuestions[myIndex];
        boolean myAnswer = currentQuestion.isAnswerTrue();
        questionTV.setText(currentQuestion.getTextResId());
        questionTV.append(" "+ myAnswer);


        /*String myQuestion = intent.getExtras().getString("CURRENT QUESTION");

        boolean myAnswer = intent.getExtras().getBoolean("CURRENT ANSWER");


        questionTV.setText(myQuestion + ": "+ myAnswer);
*/
    }
}
