package com.example.fuelconsumptioncalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EdgeEffect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText burnedFuel = findViewById(R.id.fuelUsed);
        EditText runKilometres = findViewById(R.id.runKilometres);
        EditText fuelPrice = findViewById(R.id.price);
        Button button = findViewById(R.id.countButton);

        button.setOnClickListener(view -> {
            String fuel = burnedFuel.getText().toString().trim();
            String kilometres = runKilometres.getText().toString().trim();
            String price = fuelPrice.getText().toString().trim();
            String outcome;

            if (fuel.isEmpty() || kilometres.isEmpty() || price.isEmpty() || fuel == "0" || kilometres == "0" || price == "0"){
                outcome = "Proszę wprowadzić poprawne informacje lub uzupełnić wszytskie pola!";
            } else {
                float burnedFuel2 = Float.parseFloat(burnedFuel.getText().toString().trim());
                float runKilometres2 = Float.parseFloat(runKilometres.getText().toString().trim());
                float fuelPrice2 = Float.parseFloat(fuelPrice.getText().toString().trim());
                float usedFuel = (burnedFuel2 / runKilometres2) * 100;
                float wholePrice = fuelPrice2 * usedFuel;

                outcome = "Średnie spalanie wynosi: " + usedFuel + " L/100km. Koszt przejechania 100 km to: " + wholePrice + "zł";
            }

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage(outcome)
                    .setTitle("Wyniki obliczeń")
                    .setPositiveButton("OK", (dialog, id) -> {

                    });

            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }
}