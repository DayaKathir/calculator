package lk.ac.kln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numberOne = 0;
    int numberTwo = 0;

    EditText firstnumber;
    EditText secondnumber;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = findViewById(R.id.editText);
        secondnumber = findViewById(R.id.editText2);
        resultView = findViewById(R.id.textView);

    }

    /*
    This method add two numbers and show the result
     */

    protected void addNumbers(View view) {
        numberOne = Integer.parseInt(firstnumber.getText().toString());
        numberTwo = Integer.parseInt(secondnumber.getText().toString());

        //final TextView resultView = findViewById(R.id.textView);
        int sum = numberOne + numberTwo;
        resultView.setText(Integer.toString(sum));
        //calculator
    }
}
