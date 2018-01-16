package com.example.android.yourenglishvocabulary.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.yourenglishvocabulary.R;

public class SoundVsWordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_vs_words);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AnimationsSoundVsWordsFragment animationsSoundVsWordsFragment = new AnimationsSoundVsWordsFragment();
        fragmentTransaction.add(R.id.sound_vs_words_fragment, animationsSoundVsWordsFragment);
        fragmentTransaction.commit();
    }
}
