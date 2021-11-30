/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Takes the 2 provided EditText int entries and gives answer based on the method used below.
 */

public class MainActivity extends AppCompatActivity {
    private EditText mNum1;
    private EditText mNum2;
    private TextView mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNum1 = (EditText) findViewById(R.id.mNum1);
        mNum2 = (EditText) findViewById(R.id.mNum2);
        mAnswer = (TextView) findViewById(R.id.mAnswer);
    }

    /** Returns the sum of the 2 numbers entered in the calculator as an int value. */

    public void sum(View view) {
        int mN1 = Integer.parseInt(mNum1.getText().toString());
        int mN2 = Integer.parseInt(mNum2.getText().toString());
        int mSum = mN1 + mN2;
        mAnswer.setText(String.valueOf(mSum));
    }

    /** Returns the difference of the 2 numbers entered in the calculator as an int value. */

    public void minus(View view) {
        int mN1 = Integer.parseInt(mNum1.getText().toString());
        int mN2 = Integer.parseInt(mNum2.getText().toString());
        int mMinus = mN1 - mN2;
        mAnswer.setText(String.valueOf(mMinus));
    }

    /** Returns the multiplication of the 2 numbers entered in the calculator as an int value. */

    public void mult(View view) {
        int mN1 = Integer.parseInt(mNum1.getText().toString());
        int mN2 = Integer.parseInt(mNum2.getText().toString());
        int mMultiply = mN1 * mN2;
        mAnswer.setText(String.valueOf(mMultiply));
    }

    /** Returns the division of the 2 numbers entered in the calculator as a double value. */

    public void div(View view) {
        double mN1 = Integer.parseInt(mNum1.getText().toString());
        double mN2 = Integer.parseInt(mNum2.getText().toString());
        double mDivide = mN1 / mN2;
        mAnswer.setText(String.valueOf(mDivide));
    }

    // Rules that are properly implemented in my code according
    // to https://source.android.com/setup/contribute/code-style
    //
    // 1. Line limit length is less than 100 characters on every line.
    // 2. Methods are short and not exceeding more than 40 lines of code.
    // 3. Using javadoc standard comments.
    // 4. Use's the standard brace style.
    // 5. Following field name conventions. Non-public, non-static field names start with 'm'.
    // 6. Imports are all fully qualified. ex: import android.widget.EditText instead of android.widget.*
}