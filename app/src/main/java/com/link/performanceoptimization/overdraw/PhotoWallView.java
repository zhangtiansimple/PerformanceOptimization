package com.link.performanceoptimization.overdraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.link.performanceoptimization.R;

public class PhotoWallView extends View {

    private Paint paint;
    private int[] res = new int[]{R.drawable.res1, R.drawable.res5, R.drawable.res3, R.drawable.res4, R.drawable.res2};
    private Bitmap[] bitmaps = new Bitmap[res.length];

    private static final int PADDING = 100;

    public PhotoWallView(Context context) {
        super(context);
    }

    public PhotoWallView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PhotoWallView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        for (int i = 0; i < bitmaps.length; i++) {
            bitmaps[i] = getBitmap(res[i]);
        }
    }

    private Bitmap getBitmap(int res) {
        return BitmapFactory.decodeResource(getResources(), res, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i = 0; i < bitmaps.length; i++) {
            canvas.drawBitmap(bitmaps[i], 0, PADDING * i, paint);
        }

//        for (int i = 0; i < bitmaps.length; i++) {
//            canvas.save();
//            if (i != bitmaps.length - 1) {
//                canvas.clipRect(0, i * PADDING, bitmaps[i].getHeight(), (i + 1) * (PADDING));
//            }
//            canvas.drawBitmap(bitmaps[i], 0, PADDING * i, paint);
//            canvas.restore();
//        }
    }
}
