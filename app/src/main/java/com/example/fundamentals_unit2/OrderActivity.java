package com.example.fundamentals_unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent i = getIntent ();
        String mess = "Order: " + i.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView intro = findViewById(R.id.intro);
        intro.setText(mess);

        Spinner spinner = findViewById(R.id.spinner);
        if (spinner != null)
        {
            spinner.setOnItemSelectedListener(this);
        }
    }

    public void onRadioButtonClicked (View v)
    {
        boolean clicked = ( (RadioButton) v).isChecked();

        switch (v.getId ())
        {
            case R.id.sameDay:
                if (clicked)
                    // Same day service
                    displayToast ("You selected Same Day Delivery");
                break;
            case R.id.nextDay:
                if (clicked)
                    // Same day service
                    displayToast ("You selected Next Day Delivery");
                break;
            case R.id.pickUp:
                if (clicked)
                    // Same day service
                    displayToast ("You selected Pick Up");
                break;
        }
    }

    public void displayToast (String m)
    {
        Toast.makeText (getApplicationContext(), m, Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }
} // END OF PROJECT
