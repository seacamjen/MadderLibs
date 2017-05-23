package com.example.guest.madderlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.submitButton)
    Button mSubmitButton;
    @Bind(R.id.Noun)
    EditText mNoun;
    @Bind(R.id.NounPlural1)
    EditText mNounPlural1;
    @Bind(R.id.Adjective)
    EditText mAdjective;

    @Bind(R.id.NounPlural2)
    EditText mNounPlural2;
    @Bind(R.id.Color)
    EditText mColor;
    @Bind(R.id.BodyPart)
    EditText mBodyPart;
    String verb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.verbOption1:
                if(checked)
                    verb = "smash";
                break;
            case R.id.verbOption2:
                if(checked)
                    verb = "brush";
                break;
        }
    }
    @Override
    public void onClick(View v) {
        if(v == mSubmitButton) {
            String noun = mNoun.getText().toString();
            String nounPlural1 = mNounPlural1.getText().toString();
            String adjective = mAdjective.getText().toString();

            String nounPlural2 = mNounPlural2.getText().toString();
            String color = mColor.getText().toString();
            String bodyPart = mBodyPart.getText().toString();

            Intent intent = new Intent(MainActivity.this, FunnyActivity.class);
            String[] inputs = new String[]{noun, nounPlural1, adjective, verb, nounPlural2, color, bodyPart};
            intent.putExtra("inputs", inputs);
            startActivity(intent);
        }
    }
}