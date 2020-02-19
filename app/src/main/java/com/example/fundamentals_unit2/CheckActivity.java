package com.example.fundamentals_unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener
{

    CheckBox chocolate = (CheckBox) findViewById (R.id.chocolate);
    CheckBox sprinkle = (CheckBox) findViewById (R.id.sprinkle);
    CheckBox nuts = (CheckBox) findViewById (R.id.nuts);
    CheckBox cherry = (CheckBox) findViewById (R.id.cherry);
    CheckBox oreo = (CheckBox) findViewById (R.id.oreos);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Button toaster = (Button) findViewById (R.id.toast);
    }

    @Override
    public void onClick(View view)
    {
        String m = "Toppings:\n";

        if (chocolate.isChecked ())
        {
            m += "Chocolate Syrup" + "\n";
        }
        else if (sprinkle.isChecked ())
        {
            m += "Rainbow Sprinkles" + "\n";
        }
        else if (nuts.isChecked ())
        {
            m += "Crushed Nuts" + "\n";
        }
        else if (cherry.isChecked ())
        {
            m += "Cherries" + "\n";
        }
        else if (oreo.isChecked ())
        {
            m += "Crushed Oreos" + "\n";
        }

        displayToast (m);
    }

    public void displayToast (String m)
    {
        Toast.makeText (getApplicationContext(), m, Toast.LENGTH_SHORT).show ();
    }
} // END OF PROJECTS
