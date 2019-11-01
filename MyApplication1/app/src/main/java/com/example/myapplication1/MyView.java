package com.example.myapplication1;

import android.view.View;
import android.graphics.*;
import android.content.Context;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }



    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        int y = 0;
        while (y < canvas.getHeight()) {
            canvas.drawLine(0, y,
                    this.getWidth(), y, paint);
            y += 30;
        }

    }


}
