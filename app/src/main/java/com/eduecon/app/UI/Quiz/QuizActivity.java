package com.eduecon.app.UI.Quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.eduecon.app.DataBase.QuizDbHelper;
import com.eduecon.app.Constract.Question;
import com.eduecon.app.R;
import com.eduecon.app.UI.ui.MainActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class QuizActivity extends AppCompatActivity {

    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private Button buttonConfirmNext;

    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewCountDown;

    private ArrayList<Question> questionList;
    private int questionCounter;
    private int questionTotalCount;
    private Question currentQuestions;
    private boolean answerd;
    private final Handler handler = new Handler();
    private int correctAns = 0, wrongAns = 0;
    private TimerDialog timerDialog;
    private CorrectDialog correctDialog;
    private WrongDialog wrongDialog;

    int FLAG = 0;

    int score =0;

    private int totalSizeofQuiz=0;

    private static final long COUNTDOWN_IN_MILLIS = 60000;
    private CountDownTimer countDownTimer;
    private long timeleftinMillis;

    private long backPressedTime;

    private String categoryValue;
    private String correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        setupUI();

        Intent intentCategory = getIntent();
        categoryValue = intentCategory.getStringExtra("Category");

        fetchDB();
        Log.i("BUGBUG","onCreate() in QuizActivity");

        timerDialog = new TimerDialog(this);
        correctDialog = new CorrectDialog(this);
        wrongDialog = new WrongDialog(this);
    }



    private void setupUI(){
        textViewQuestion = findViewById(R.id.txtQuestionContainer);

        textViewScore = findViewById(R.id.txtScore);
        textViewQuestionCount = findViewById(R.id.txtTotalQuestion);
        textViewCountDown = findViewById(R.id.txtViewTimer);



        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        rb5 = findViewById(R.id.radio_button5);
        buttonConfirmNext = findViewById(R.id.button);
    }

    public void fetchDB() {
        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestionsWithCategory(categoryValue);  // calling the method with category
        startQuiz();

    }

    public void startQuiz() {

        questionTotalCount = questionList.size();
        Collections.shuffle(questionList);

        showQuestions();   // calling showQuestion() method

        rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){

                    case R.id.radio_button1:

                        rb1.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);
                        rb5.setTextColor(Color.BLACK);

                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rounded));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

                        break;
                    case R.id.radio_button2:
                        rb2.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb1.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);
                        rb5.setTextColor(Color.BLACK);

                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rounded));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

                        break;

                    case R.id.radio_button3:
                        rb3.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb1.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);
                        rb5.setTextColor(Color.BLACK);

                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rounded));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

                        break;

                    case R.id.radio_button4:
                        rb4.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb1.setTextColor(Color.BLACK);
                        rb5.setTextColor(Color.BLACK);

                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rounded));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

                        break;
                    case R.id.radio_button5:
                        rb5.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb1.setTextColor(Color.BLACK);
                        rb5.setTextColor(Color.BLACK);

                        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.rounded));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

                        break;
                }

            }
        });

        buttonConfirmNext.setOnClickListener(v -> {

            if (!answerd) {
                if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()|| rb5.isChecked()) {

                    quizOperation();
                } else {

                    Toast.makeText(QuizActivity.this, "Jawaban tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void showQuestions() {


        rbGroup.clearCheck();

        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));
        rb5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.answerbg));

        rb1.setTextColor(Color.BLACK);
        rb2.setTextColor(Color.BLACK);
        rb3.setTextColor(Color.BLACK);
        rb4.setTextColor(Color.BLACK);
        rb5.setTextColor(Color.BLACK);

        if (questionCounter < questionTotalCount) {
            currentQuestions = questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestions.getQuestion());
            rb1.setText(currentQuestions.getOption1());
            rb2.setText(currentQuestions.getOption2());
            rb3.setText(currentQuestions.getOption3());
            rb4.setText(currentQuestions.getOption4());
            rb5.setText(currentQuestions.getOption5());

            questionCounter++;
            answerd = false;
            buttonConfirmNext.setText("Confirm");

            textViewQuestionCount.setText("Questions: " + questionCounter + "/" + questionTotalCount);

            timeleftinMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();


        } else {

            // If Number of Questions Finishes then we need to finish the Quiz and Shows the User Quiz Performance
            Toast.makeText(this, "Quiz Selesai", Toast.LENGTH_SHORT).show();

            rb1.setClickable(false);
            rb2.setClickable(false);
            rb3.setClickable(false);
            rb4.setClickable(false);
            rb5.setClickable(false);
            buttonConfirmNext.setClickable(false);

            handler.postDelayed(() -> finalResult(), 1000);
        }
    }

    private void quizOperation() {
        answerd = true;

        countDownTimer.cancel();

        RadioButton rbselected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbselected) + 1;

        checkSolution(answerNr, rbselected);

    }


    private void checkSolution(int answerNr, RadioButton rbselected) {

        switch (currentQuestions.getAnswerNr()) {
            case 1:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb1.setBackground(ContextCompat.getDrawable(
                            this, R.drawable.correctbg));
                    rb1.setTextColor(Color.BLACK);

                    correctAns++;


                    score += 10;
                    textViewScore.setText("Score: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    Toast.makeText(getApplicationContext(), "Benar",Toast.LENGTH_SHORT).show();

                    FLAG = 1;
                } else {
                    changetoIncorrectColor(rbselected);

                    wrongAns++;

                    String correctAnswer = (String) rb1.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);
                    Toast.makeText(getApplicationContext(), "Salah",Toast.LENGTH_SHORT).show();
                    FLAG = 2;
                }
                break;
            case 2:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb2.setBackground(ContextCompat.getDrawable(this, R.drawable.correctbg));
                    rb2.setTextColor(Color.BLACK);
                    correctAns++;
                    score += 10;
                    textViewScore.setText("Score: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);
                    Toast.makeText(getApplicationContext(), "Betul",Toast.LENGTH_SHORT).show();
                    FLAG = 1;
                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;

                    final String correctAnswer = (String) rb2.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);
                    Toast.makeText(getApplicationContext(), "Salah",Toast.LENGTH_SHORT).show();

                    FLAG = 2;
                }
                break;
            case 3:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb3.setBackground(ContextCompat.getDrawable(this, R.drawable.correctbg));
                    rb3.setTextColor(Color.BLACK);

                    correctAns++;

                    score += 10;
                    textViewScore.setText("Score: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    Toast.makeText(getApplicationContext(), "Betul",Toast.LENGTH_SHORT).show();

                    FLAG = 1;

                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;

                    String correctAnswer = (String) rb3.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);
                    Toast.makeText(getApplicationContext(), "Salah",Toast.LENGTH_SHORT).show();
                    FLAG = 2;
                }
                break;
            case 4:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb4.setBackground(ContextCompat.getDrawable(this, R.drawable.correctbg));
                    rb4.setTextColor(Color.BLACK);
                    correctAns++;

                    score += 10;
                    textViewScore.setText("Score: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    Toast.makeText(getApplicationContext(), "Betul",Toast.LENGTH_SHORT).show();

                    FLAG = 1;

                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;

                    String correctAnswer = (String) rb4.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);
                    Toast.makeText(getApplicationContext(), "Salah",Toast.LENGTH_SHORT).show();
                    FLAG = 2;
                }
                break;
            case 5:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb5.setBackground(ContextCompat.getDrawable(this, R.drawable.correctbg));
                    rb5.setTextColor(Color.BLACK);

                    correctAns++;

                    score += 10;
                    textViewScore.setText("Score: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    Toast.makeText(getApplicationContext(), "Betul",Toast.LENGTH_SHORT).show();

                    FLAG = 1;

                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;

                    String correctAnswer = (String) rb4.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);
                    Toast.makeText(getApplicationContext(), "Salah",Toast.LENGTH_SHORT).show();
                    FLAG = 2;
                }
                break;
        }
        if (questionCounter == questionTotalCount) {
            buttonConfirmNext.setText("Confirm and Finish");
        }
    }

    void changetoIncorrectColor(RadioButton rbselected) {
        rbselected.setBackground(ContextCompat.getDrawable(this, R.drawable.wrongbg));
        rbselected.setTextColor(Color.BLACK);
    }

    //  the timer code
    private void startCountDown(){

        countDownTimer = new CountDownTimer(timeleftinMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeleftinMillis = millisUntilFinished;

                updateCountDownText();
            }
            @Override
            public void onFinish() {

                timeleftinMillis = 0;
                updateCountDownText();

            }
        }.start();

    }

    private void updateCountDownText(){

        int minutes = (int) (timeleftinMillis/1000) /60;
        int seconds = (int) (timeleftinMillis/1000) % 60;
        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes, seconds);
        textViewCountDown.setText(timeFormatted);

        if (timeleftinMillis < 10000){

            textViewCountDown.setTextColor(ContextCompat.getColor(this,R.color.red));
            FLAG = 3;
        }else {
            textViewCountDown.setTextColor(ContextCompat.getColor(this,R.color.black));
        }

        if (timeleftinMillis == 0 ){
            Toast.makeText(this, "Times Up!", Toast.LENGTH_SHORT).show();
            handler.postDelayed(() -> timerDialog.timerDialog(),1000);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
        Log.i("BUGBUG","onDestroy() in QuizActivity");


    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){

            Intent intent = new Intent(QuizActivity.this, MainActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Press Again to Exit", Toast.LENGTH_SHORT).show();

        }
        backPressedTime = System.currentTimeMillis();
    }

    private void finalResult(){

        Intent resultData = new Intent(QuizActivity.this,ResultActivity.class);

        resultData.putExtra("UserScore",score);
        resultData.putExtra("TotalQuestion",questionTotalCount);
        resultData.putExtra("CorrectQues",correctAns);
        resultData.putExtra("WrongQues",wrongAns);
        resultData.putExtra("Category",categoryValue);

        startActivity(resultData);

    }
}