package com.example.eduecon.UI.Quiz;import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduecon.R;

public class WrongDialog {

    private Context mContext;

    private Dialog wrongDialog;

    private QuizActivity mquizActivity;

    public WrongDialog(Context mContext) {
        this.mContext = mContext;
    }


    public void wrongDialog(String correctAnswer, final QuizActivity quizActivity){
        mquizActivity = quizActivity;
        wrongDialog = new Dialog(mContext);
        wrongDialog.setContentView(R.layout.wrong_dialog);
        Button btWrongDialog = (Button) wrongDialog.findViewById(R.id.bt_wrong_dialog);
        TextView textViewCorrectAnswer = (TextView) wrongDialog.findViewById(R.id.text_correct_ans);

        textViewCorrectAnswer.setText("Correct Answer: " + "\n"+String.valueOf(correctAnswer));

        btWrongDialog.setOnClickListener(v -> {
            wrongDialog.dismiss();
            mquizActivity.showQuestions();
        });

        wrongDialog.show();
        wrongDialog.setCancelable(false);
        wrongDialog.setCanceledOnTouchOutside(false);

        wrongDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }

}