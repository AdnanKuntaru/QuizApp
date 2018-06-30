package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/** this is a Quiz app that tick the answer or enter a text of the answer in the provided column
 *
 */        public class MainActivity extends AppCompatActivity {
            private static final String LOG_TAG = MainActivity.class.getSimpleName();
            //* this for question 1 to 3 is handle the "Radio Button"
             RadioButton question1_opt1;
             RadioButton question2_opt1;
             RadioButton question3_opt2;
             //* this handle 4 to 6 of "Edit Text"
             EditText question4_answer;
             EditText question5_answer;
             EditText question6_answer;
             //* this handle 7 to 8 question which is "Check box"
           CheckBox question7_opt1;
           CheckBox question7_opt2;
           CheckBox question7_opt3;

           CheckBox question8_opt1;
           CheckBox question8_opt2;
           CheckBox question8_opt3;





            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                /** this will handle the keyboard when you enter application, the keyboard will not pop up
                 */
                this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                setContentView(R.layout.activity_main);
            }
            //* this handle the integer that will hold quiz result and total it to overall result.
            public void submitAnswers(View view) {
                CharSequence overallResult;
                Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_opt3));
                int b1_score;
                int b2_score;
                int b3_score;
                int b4_score;
                int b5_score;
                int b6_score;
                int b7_score;
                int b8_score;
                int overall;

                /** this for question one answer correct  is: "Muhammadu Buhari" which is choice one
                 *
                 */
                Boolean b1;
                question1_opt1 = (RadioButton) findViewById(R.id.question1_opt1);
                b1 = question1_opt1.isChecked();
                if (b1) {
                    b1_score = 1;
                } else {
                    b1_score = 0;
                }
                /** this for question two answer correct,  is: "Prof Yemi O" which is choice one
                 *
                 */
                Boolean b2;
                question2_opt1 = (RadioButton) findViewById(R.id.question2_opt1);
                b2 = question2_opt1.isChecked();
                if (b2) {
                    b2_score = 1;
                } else {
                    b2_score = 0;
                }
                /** this for question three answer correct one,  is: "Prof Yemi Osinbajo" which is choice two
                 *
                 */
                Boolean b3;
                question3_opt2 = (RadioButton) findViewById(R.id.question3_opt2);
                b3 = question3_opt2.isChecked();
                if (b3) {
                    b3_score = 1;
                } else {
                    b3_score = 0;
                }
                String b4;
                question4_answer = (EditText) this.findViewById(R.id.question4_answer);
                b4 = question4_answer.getText().toString().toLowerCase();
                if (b4.equals("1960")) {
                    b4_score = 1;
                } else {
                    b4_score = 0;
                }
                String b5;
                question5_answer = (EditText) this.findViewById(R.id.question5_answer);
                b5 = question5_answer.getText().toString().toLowerCase();
                if (b5.equals("1963")) {
                    b5_score = 1;
                } else {
                    b5_score = 0;
                }
                String b6;
                question6_answer = (EditText) this.findViewById(R.id.question6_answer);
                b6 = question6_answer.getText().toString().toLowerCase();
                if (b6.equals("2015")) {
                    b6_score = 1;
                } else {
                    b6_score = 0;
                }
                //* this is for check box question


                Boolean b7opt_1;
                Boolean b7opt_2;
                Boolean b7opt3;
                question7_opt1 = (CheckBox) findViewById(R.id.question7_opt1);
                question7_opt2 = (CheckBox) findViewById(R.id.question7_opt2);
                question7_opt3 = (CheckBox) findViewById(R.id.question7_opt3);
                b7opt_1 = question7_opt1.isChecked();
                b7opt_2 = question7_opt3.isChecked();
                b7opt3 = question7_opt2.isChecked();

                if (b7opt_1 ||b7opt_2 ){
                    b7_score =1;
                }else if (b7opt3){
                    b7_score = 0;
                }else {
                    b7_score =0;
                }
                Boolean b8opt_1;
                Boolean b8opt_2;
                Boolean b8opt3;
                question8_opt1 = (CheckBox) findViewById(R.id.question8_opt1);
                question8_opt2 = (CheckBox) findViewById(R.id.question8_opt2);
                question8_opt3 = (CheckBox) findViewById(R.id.question8_opt3);
                b8opt_1 = question8_opt1.isChecked();
                b8opt_2 = question8_opt3.isChecked();
                b8opt3 = question8_opt2.isChecked();

                if (b8opt_1 ||b8opt_2 ){
                    b8_score =1;
                }else if (b8opt3){
                    b8_score = 0;
                }else {
                    b8_score =0;
                }
                overall =
                        b1_score +
                 b2_score +
                 b3_score +
                 b4_score +
                 b5_score +
                 b6_score +
                b7_score  +
                        b8_score;

        if (overall == 8) {
            overallResult = "Awesome! You got 8 out of 8";
        } else {
            overallResult = "Please do it again. You scored " + overall + " out of 8";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, overallResult, duration);
        toast.show();



    }
}

