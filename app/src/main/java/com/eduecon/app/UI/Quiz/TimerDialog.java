package com.eduecon.app.UI.Quiz;import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.TextView;

import com.eduecon.app.R;
import com.eduecon.app.UI.ui.MainActivity;

public class TimerDialog {

    private Context mContext;
    private Dialog TimerDialog;

    private TextView textviewTimeUP;

    public TimerDialog(Context mContext) {
        this.mContext = mContext;
    }

    public void timerDialog(){


        TimerDialog = new Dialog(mContext);
        TimerDialog.setContentView(R.layout.times_up_dialog);

        final Button btTimer =  (Button) TimerDialog.findViewById(R.id.bt_timer);



        btTimer.setOnClickListener(v -> {

            TimerDialog.dismiss();
            Intent intent = new Intent(mContext, MainActivity.class);
            mContext.startActivity(intent);


        });

        TimerDialog.show();
        TimerDialog.setCancelable(false);
        TimerDialog.setCanceledOnTouchOutside(false);

        TimerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }


}