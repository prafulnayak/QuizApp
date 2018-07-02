package org.sairaa.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CheckBox q1Option1,q1Option2,q1Option3,q1Option4;
    private RadioGroup radioGroup2, radioGroup3;
    private EditText q4Answer, q5Answer;
    private Button submit;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1Option1 = findViewById(R.id.checkBox1);
        q1Option2 = findViewById(R.id.checkBox2);
        q1Option3 = findViewById(R.id.checkBox3);
        q1Option4 = findViewById(R.id.checkBox4);

        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        q4Answer = findViewById(R.id.editTextAnswer4);
        q5Answer = findViewById(R.id.editTextAnswer5);
        submit = findViewById(R.id.submitAnswer);
        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
//        Toast.makeText(MainActivity.this,"ass",Toast.LENGTH_SHORT).show();
    }

    private void checkQuestion5() {
        
    }

    private void checkQuestion4() {

    }

    private void checkQuestion3() {

    }

    private void checkQuestion2() {
        int answer2 = 0;
        int selectedID2 = radioGroup2.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        Toast.makeText(MainActivity.this,""+selectedID2,Toast.LENGTH_SHORT).show();
        if(selectedID2 != -1){
            radioButton = findViewById(selectedID2);
            switch (selectedID2){
                case R.id.radioGroup2Option1:
                    Toast.makeText(MainActivity.this,"opt 1",Toast.LENGTH_SHORT).show();
                    radioButton.setTextColor(getResources().getColor(R.color.colorPrimary));
                    break;
                case R.id.radioGroup2Option2:
                    Toast.makeText(MainActivity.this,"opt 2",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup2Option3:
                    Toast.makeText(MainActivity.this,"opt 3",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup2Option4:
                    Toast.makeText(MainActivity.this,"opt 4",Toast.LENGTH_SHORT).show();
                    break;
                default:

            }
        }

    }

    private void checkQuestion1() {
        Boolean option1 = q1Option1.isChecked();
        Boolean option2 = q1Option2.isChecked();
        Boolean option3 = q1Option3.isChecked();
        Boolean option4 = q1Option4.isChecked();
    }
}
