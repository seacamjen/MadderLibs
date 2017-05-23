package com.example.guest.madderlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FunnyActivity extends AppCompatActivity {
    @Bind(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String[] inputs = intent.getStringArrayExtra("inputs");
        String formattedResult = String.format("Be my %s \n %s make the world go %s \n Nemo says 'I  %s you' \n I love %s, %s does too \n You make my %s flutter", inputs[0], inputs[1], inputs[2], inputs[3], inputs[4], inputs[5], inputs[6]);
        mResultTextView.setText(formattedResult);
    }
}
