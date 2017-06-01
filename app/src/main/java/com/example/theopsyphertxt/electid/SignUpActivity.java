package com.example.theopsyphertxt.electid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

/**
 * Created by TheoPsyphertxt on 31/05/2017.
 */

public class SignUpActivity extends Activity {

    CheckBox checkBoxInformed;
    Spinner spinnerRegions;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //below too append highlighted text
        checkBoxInformed = (CheckBox) findViewById(R.id.checkBoxBeInformed);
        checkBoxInformed.setText(Html.fromHtml(getResources().getString(R.string.txt_updated)+
                "<font color='#02cbd2'>"+ getResources().getString(R.string.action_learn_more)+"</font>"));

        //populating spinner
        spinnerRegions = (Spinner) findViewById(R.id.spinnerRegion);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.regions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRegions.setAdapter(adapter);

    }
    //on signup button click
    public void signUp(View view) {
        Intent intent = new Intent(this, Page1Activity.class);
        startActivity(intent);
    }
}
