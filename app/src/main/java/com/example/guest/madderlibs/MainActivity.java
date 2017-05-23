package com.example.guest.madderlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Bind (R.id.submitButton) Button mSubmitButton;
    @Bind (R.id.Noun) EditText mNoun;
    @Bind (R.id.NounPlural1) EditText mNounPlural1;
    @Bind (R.id.Adjective) EditText mAdjective;
    @Bind (R.id.Verb) EditText mVerb;
    @Bind (R.id.NounPlural2) EditText mNounPlural2;
    @Bind (R.id.Color) EditText mColor;
    @Bind (R.id.BodyPart) EditText mBodyPart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
