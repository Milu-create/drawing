package com.example.myapp_android_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint pensil = new Paint();
        pensil.setColor(Color.GREEN);
        canvas.drawRect(0, canvas.getHeight() - canvas.getHeight()/4, canvas.getWidth(), canvas.getHeight(), pensil);
        pensil.setColor(Color.parseColor("#654321"));
        canvas.drawRect(canvas.getWidth() - canvas.getWidth()/20,  canvas.getHeight()/4, canvas.getWidth() - canvas.getWidth()/20 + 200, canvas.getHeight() + 200, pensil);
        pensil.setStyle(Paint.Style.STROKE);
        pensil.setColor(Color.BLACK);
        canvas.drawRect(canvas.getWidth() - canvas.getWidth()/20,  canvas.getHeight()/4, canvas.getWidth() - canvas.getWidth()/20 + 200, canvas.getHeight() + 200, pensil);
}
}
