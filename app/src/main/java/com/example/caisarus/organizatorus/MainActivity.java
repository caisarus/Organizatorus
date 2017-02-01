package com.example.caisarus.organizatorus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        calculateMPG();
        calculateMiles();
        calculateFeet();
        calculatePounds();
        calculateOz();
        calculateStones();
        calculateTemperature();


    }

    private void calculateMPG(){
        EditText mpgEditText = (EditText) findViewById(R.id.mpg_edit_text);
        EditText mpg = (EditText) findViewById(R.id.mpg_edit_text);
        String mpgValue = mpg.getText().toString();

        if(mpgEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch mpgSwitch = (Switch) findViewById(R.id.mpg_switch);
            if (!mpgSwitch.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float milesPerGalon = Float.parseFloat(mpgValue);
                float lp100;
                lp100 = 282.48f / milesPerGalon;
                result = Float.toString(lp100) + " l/100km";
            } else {
                float milesPerGalon;
                float lp100 = Float.parseFloat(mpgValue);
                milesPerGalon = 282.48f / lp100;
                result = Float.toString(milesPerGalon) + " mpg";
            }

            TextView mpgResult = (TextView) findViewById(R.id.mpg_text_view);
            mpgResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculateMiles(){
        EditText milesEditText = (EditText) findViewById(R.id.miles_edit_text);
        String mpgValue = milesEditText.getText().toString();
        if(milesEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch miles = (Switch) findViewById(R.id.miles_switch);
            if (!miles.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float numberOfMiles = Float.parseFloat(mpgValue);
                float numberOfKm = 1.6f * numberOfMiles;
                result = Float.toString(numberOfKm) + " km";
            } else {
                float numberOfMiles;
                float numberOfKm = Float.parseFloat(mpgValue);
                numberOfMiles = numberOfKm / 1.6f;
                result = Float.toString(numberOfMiles) + " miles";
            }

            TextView milesResult = (TextView) findViewById(R.id.miles_text_view);
            milesResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculateFeet(){
        EditText feetEditText = (EditText) findViewById(R.id.feet_edit_text);
        String feetValue = feetEditText.getText().toString();
        if(feetEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch feet = (Switch) findViewById(R.id.feet_switch);
            if (!feet.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float numberOfFeet = Float.parseFloat(feetValue);
                float numberOfMeters = 0.3048f * numberOfFeet;
                result = Float.toString(numberOfMeters) + " meters";
            } else {
                float numberOfFeet;
                float numberOfMeters = Float.parseFloat(feetValue);
                numberOfFeet = numberOfMeters / 0.3048f;
                result = Float.toString(numberOfFeet) + " feet";
            }

            TextView feetResult = (TextView) findViewById(R.id.feet_text_view);
            feetResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculatePounds(){
        EditText poundsEditText = (EditText) findViewById(R.id.pounds_edit_text);
        String poundsValue = poundsEditText.getText().toString();
        if(poundsEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch pounds = (Switch) findViewById(R.id.pounds_switch);
            if (!pounds.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float numberOfPounds = Float.parseFloat(poundsValue);
                float numberOfKg = 0.453f * numberOfPounds;
                result = Float.toString(numberOfKg) + " Kg";
            } else {
                float numberOfPounds;
                float numberOfKg = Float.parseFloat(poundsValue);
                numberOfPounds = numberOfKg / 0.453f;
                result = Float.toString(numberOfPounds) + " Pounds";
            }

            TextView poundsResult = (TextView) findViewById(R.id.pounds_text_view);
            poundsResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculateOz(){
        EditText ozEditText = (EditText) findViewById(R.id.oz_edit_text);
        String ozValue = ozEditText.getText().toString();
        if(ozEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch oz = (Switch) findViewById(R.id.oz_switch);
            if (!oz.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float numberOfOz = Float.parseFloat(ozValue);
                float numberOfKg = 0.0283f * numberOfOz;
                result = Float.toString(numberOfKg) + " Kg";
            } else {
                float numberOfOz;
                float numberOfKg = Float.parseFloat(ozValue);
                numberOfOz = numberOfKg / 0.0283f;
                result = Float.toString(numberOfOz) + " Oz";
            }

            TextView ozResult = (TextView) findViewById(R.id.oz_text_view);
            ozResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculateStones(){
        EditText stonesEditText = (EditText) findViewById(R.id.stones_edit_text);
        String ozValue = stonesEditText.getText().toString();
        if(stonesEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch stones = (Switch) findViewById(R.id.stones_switch);
            if (!stones.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float numberOfStones = Float.parseFloat(ozValue);
                float numberOfKg = 6.3502f * numberOfStones;
                result = Float.toString(numberOfKg) + " Kg";
            } else {
                float numberOfStones;
                float numberOfKg = Float.parseFloat(ozValue);
                numberOfStones = numberOfKg / 6.3502f;
                result = Float.toString(numberOfStones) + " Stones";
            }

            TextView stonesResult = (TextView) findViewById(R.id.stones_text_view);
            stonesResult.setText(result);                  //Modify the text accordingly
        }
    }

    private void calculateTemperature(){
        EditText temperatureEditText = (EditText) findViewById(R.id.temperature_edit_text);
        String temperatureValue = temperatureEditText.getText().toString();
        if(temperatureEditText.getText().toString().matches(""))//Check to see if there is input
        {} else {
            String result;
            Switch temperature = (Switch) findViewById(R.id.temperature_switch);
            if (!temperature.isChecked()) {                     //Check to see if we want the conversion from MPG or to MPG
                float degreesF = Float.parseFloat(temperatureValue);
                float degreesC = (degreesF - 32f) * (5f/9f);
                result = Float.toString(degreesC) + " C°";
            } else {
                float degreesF;
                float degreesC = Float.parseFloat(temperatureValue);
                degreesF = (degreesC * (9f/5f)) + 32f;
                result = Float.toString(degreesF) + " F°";
            }

            TextView temperatureResult = (TextView) findViewById(R.id.temperature_text_view);
            temperatureResult.setText(result);                  //Modify the text accordingly
        }
    }
}
