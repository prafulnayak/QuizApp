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
    private int score = 0;

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
        String answer = q5Answer.getText().toString().trim().toLowerCase();
        if(!answer.equals("")){
            if(getString(R.string.q5Answer).trim().toLowerCase().equals(answer)){
                q5Answer.setTextColor(getResources().getColor(R.color.green));
                score++;
            }else {
                q5Answer.setTextColor(getResources().getColor(R.color.red));
            }
        }

    }

    private void checkQuestion4() {
        String answer = q4Answer.getText().toString().trim().toLowerCase();
        if(!answer.equals("")){
            if(getString(R.string.q4Answer).trim().toLowerCase().equals(answer)){
                q4Answer.setTextColor(getResources().getColor(R.color.green));
                score++;
            }else {
                q4Answer.setTextColor(getResources().getColor(R.color.red));
            }
        }


    }

    private void checkQuestion3() {
        int selectedID2 = radioGroup3.getCheckedRadioButtonId();
        int rightAnswer = Integer.parseInt(getString(R.string.q3Answer));
        RadioButton r1,r2,r3,r4;
        r1 = findViewById(R.id.radioGroup3Option1);
        r2 = findViewById(R.id.radioGroup3Option2);
        r3 = findViewById(R.id.radioGroup3Option3);
        r4 = findViewById(R.id.radioGroup3Option4);
        //set color for right answer
        switch (rightAnswer){
            case 1:
                r1.setTextColor(getResources().getColor(R.color.green));
                break;
            case 2:
                r2.setTextColor(getResources().getColor(R.color.green));
                break;
            case 3:
                r3.setTextColor(getResources().getColor(R.color.green));
                break;
            case 4:
                r4.setTextColor(getResources().getColor(R.color.green));
                break;
            default:

        }
        // find the radiobutton by returned id
        Toast.makeText(MainActivity.this,""+selectedID2,Toast.LENGTH_SHORT).show();
        if(selectedID2 != -1){
            radioButton = findViewById(selectedID2);
            switch (selectedID2){
                case R.id.radioGroup3Option1:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option1))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 1",Toast.LENGTH_SHORT).show();

                    break;
                case R.id.radioGroup3Option2:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option2))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 2",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup3Option3:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option3))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 3",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup3Option4:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option4))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 4",Toast.LENGTH_SHORT).show();
                    break;
                default:

            }
        }


    }

    private void checkQuestion2() {
//        int answer2 = 0;
        int selectedID2 = radioGroup2.getCheckedRadioButtonId();
        int rightAnswer = Integer.parseInt(getString(R.string.q2Answer));
        RadioButton r1,r2,r3,r4;
        r1 = findViewById(R.id.radioGroup2Option1);
        r2 = findViewById(R.id.radioGroup2Option2);
        r3 = findViewById(R.id.radioGroup2Option3);
        r4 = findViewById(R.id.radioGroup2Option4);
        //set color for right answer
        switch (rightAnswer){
            case 1:
                r1.setTextColor(getResources().getColor(R.color.green));
                break;
            case 2:
                r2.setTextColor(getResources().getColor(R.color.green));
                break;
            case 3:
                r3.setTextColor(getResources().getColor(R.color.green));
                break;
            case 4:
                r4.setTextColor(getResources().getColor(R.color.green));
                break;
            default:

        }
        // find the radiobutton by returned id
        Toast.makeText(MainActivity.this,""+selectedID2,Toast.LENGTH_SHORT).show();
        if(selectedID2 != -1){
            radioButton = findViewById(selectedID2);
            switch (selectedID2){
                case R.id.radioGroup2Option1:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option1))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 1",Toast.LENGTH_SHORT).show();

                    break;
                case R.id.radioGroup2Option2:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option2))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 2",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup2Option3:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option3))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 3",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioGroup2Option4:
                    if(rightAnswer == Integer.parseInt(getString(R.string.option4))){
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.green));
                    }else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
//                    Toast.makeText(MainActivity.this,"opt 4",Toast.LENGTH_SHORT).show();
                    break;
                default:

            }
        }

    }

    private void checkQuestion1() {
        int rightAnswer = Integer.parseInt(getString(R.string.q1Answer));

        switch (rightAnswer){
            case 1:
                q1Option1.setTextColor(getResources().getColor(R.color.green));
                if(q1Option1.isChecked() && !q1Option2.isChecked() && !q1Option3.isChecked() && !q1Option4.isChecked()){
                    score++;
//                    q1Option1.setTextColor(getResources().getColor(R.color.green));
                }
                if(q1Option2.isChecked()){
                    q1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option3.isChecked()){
                    q1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option4.isChecked()){
                    q1Option4.setTextColor(getResources().getColor(R.color.red));
                }

                break;
            case 2:
                q1Option2.setTextColor(getResources().getColor(R.color.green));
                if(!q1Option1.isChecked() && q1Option2.isChecked() && !q1Option3.isChecked() && !q1Option4.isChecked()){
                    score++;

                }
                if(q1Option1.isChecked()){
                    q1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option3.isChecked()){
                    q1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option4.isChecked()){
                    q1Option4.setTextColor(getResources().getColor(R.color.red));
                }

                break;
            case 3:
                q1Option3.setTextColor(getResources().getColor(R.color.green));
                if(!q1Option1.isChecked() && !q1Option2.isChecked() && q1Option3.isChecked() && !q1Option4.isChecked()){
                    score++;

                }
                if(q1Option1.isChecked()){
                    q1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option2.isChecked()){
                    q1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option4.isChecked()){
                    q1Option4.setTextColor(getResources().getColor(R.color.red));
                }
                break;
            case 4:
                q1Option4.setTextColor(getResources().getColor(R.color.green));
                if(!q1Option1.isChecked() && !q1Option2.isChecked() && !q1Option3.isChecked() && q1Option4.isChecked()){
                    score++;

                }
                if(q1Option1.isChecked()){
                    q1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option2.isChecked()){
                    q1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if(q1Option3.isChecked()){
                    q1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                break;
            default:

        }

    }
}
