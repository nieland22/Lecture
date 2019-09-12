package com.example.a301practice;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class MySurfaceView extends SurfaceView {

    public MySurfaceView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);
    }


    
    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawRect(50, 100, 150, 200, paint);

        Bitmap theImg = BitmapFactory.decodeResource(getResources(), R.drawable.forest);
        canvas.drawBitmap(theImg, 150, 50, null);

    }
}
