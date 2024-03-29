package com.college.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
    TODOs:
    In groups of 4, complete the following tasks, 1 for each team member:
    1. Extract all the strings into the strings.xml file and use them in the layout and the activity
    2. Change the theme of the app to a NoActionBar theme and modify the primary colors
    3. Add Log messages at the entry/exit of onCreate() and convertCurrency methods. Level should be Info
    4. Add ViewBinding to the project

    ** Each task must be done in a separate branch and merged to the main branch
    after completion using a Pull Request.
    ** Each task must be done by a different team member.

*/
/*
Rustom: Add **Log** messages at the entry/exit of **onCreate()** and
**convertCurrency()** methods. Level should be **Info** //Rustom
 */
public class MainActivity extends AppCompatActivity {
    static private final Float CONVERSION_RATE = 0.80F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log entry message for onCreate()
        Log.i("MainActivity","onCreate() method started");
        Button buttonConvert = findViewById(R.id.convertButton);

        Log.i("MainActivity","onCreate() method finished");
        buttonConvert.setOnClickListener( view ->  {
            convertCurrency(view);
        } );
    }

    public void convertCurrency(View view) {

        Log.i("MainActivity","convertCurrency() method started");
        EditText inputView = findViewById(R.id.entryId);
        String inputAmount = inputView.getText().toString();
        TextView resultView = findViewById(R.id.resultId);


        if (!inputAmount.isEmpty()) {
            Float inputAmountDecimal = Float.valueOf(inputAmount);

            Float resultFloat = inputAmountDecimal * CONVERSION_RATE;

            resultView.setText( resultFloat + " Euros" );
            Log.i("MainActivity","convertCurrency() method finished");
        }
    }
}

