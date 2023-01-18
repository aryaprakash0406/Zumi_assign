package com.example.zumi_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.example.zumi_assign.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        String text = "I agree to Terms of use and Privacy Policy of OneScore and CIBIL";
        String text2 = "I agree to Terms of use and Privacy Policy of OneScore and CIBIL";
        SpannableString spannableString = new SpannableString(text);

        // Creating the spans to style the string
        ForegroundColorSpan foregroundColorSpanRed = new ForegroundColorSpan(Color.BLUE);
        ForegroundColorSpan foregroundColorSpanGreen = new ForegroundColorSpan(Color.BLUE);
        ForegroundColorSpan foregroundColorSpanPink = new ForegroundColorSpan(Color.BLUE);

        // Setting the spans on spannable string
        spannableString.setSpan(foregroundColorSpanRed, 11, 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(foregroundColorSpanGreen, 28, 42, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(foregroundColorSpanPink, 59, 64, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        activityMainBinding.checkBox.setText(spannableString);



//

    }

}