package com.example.guest.madderlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind (R.id.submitButton) Button mSubmitButton;
    @Bind (R.id.Noun) EditText mNoun;
    @Bind (R.id.NounPlural1) EditText mNounPlural1;
    @Bind (R.id.Adjective) EditText mAdjective;
    @Bind (R.id.Verb) EditText mVerb;
    @Bind (R.id.NounPlural2) EditText mNounPlural2;
    @Bind (R.id.Color) EditText mColor;
    @Bind(R.id.BodyPart) EditText mBodyPart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNoun.getText().toString();
                String nounPlural1 = mNounPlural1.getText().toString();
                String adjective = mAdjective.getText().toString();
                String verb = mVerb.getText().toString();
                String nounPlural2 = mNounPlural2.getText().toString();
                String color = mColor.getText().toString();
                String bodyPart = mBodyPart.getText().toString();

                Intent intent = new Intent(MainActivity.this, FunnyActivity.class);
                String[] inputs = new String[] {noun, nounPlural1, adjective, verb, nounPlural2, color, bodyPart};
                intent.putExtra("inputs", inputs);
                startActivity(intent);
            }
        });
    }
}
