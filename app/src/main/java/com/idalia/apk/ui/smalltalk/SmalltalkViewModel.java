package com.idalia.apk.ui.smalltalk;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SmalltalkViewModel extends ViewModel {

    private MutableLiveData<String> currentQuestion;

    public MutableLiveData<String> getCurrentQuestion() {
        return currentQuestion;
    }

    public SmalltalkViewModel() {
        currentQuestion = new MutableLiveData<>();
        currentQuestion.setValue("Welcome to smalltalk improvement part! When you are ready, press continue.");
    }
}