package sg.edu.rp.c346.id22024044.demosimpleclickl03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    //Write code when male selected
                    stringResponse = "He says " + stringResponse;
                } else {
                    //Write code when female selected
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toggle Enable/Disable
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                    etInput.setFocusableInTouchMode(true);

                } else {
                    etInput.setEnabled(false);
                    etInput.setFocusable(false);
                }

            }
        });

    }
}