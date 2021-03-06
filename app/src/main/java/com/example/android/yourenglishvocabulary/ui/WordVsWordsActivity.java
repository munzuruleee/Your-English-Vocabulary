package com.example.android.yourenglishvocabulary.ui;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.yourenglishvocabulary.R;

public class WordVsWordsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_vs_words);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AnimationsWordVsWordsFragment animationsWordVsWordsFragment = new AnimationsWordVsWordsFragment();
        fragmentTransaction.add(R.id.word_vs_words_fragment, animationsWordVsWordsFragment);
        fragmentTransaction.commit();
    }
}
