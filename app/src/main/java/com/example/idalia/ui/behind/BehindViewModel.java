package com.example.idalia.ui.behind;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class BehindViewModel extends AndroidViewModel {

    private MutableLiveData<String> currentQuestion;

    public BehindViewModel(@NonNull Application application) {
        super(application);
        currentQuestion = new MutableLiveData<>();
        String text = "Interested in the paper which Idalia is based on?\nJust click on the Save button." +
                "\nThe paper will be available as a pdf file in the Idalia folder in your internal storage.";
        currentQuestion.setValue(text);
    }

    public MutableLiveData<String> getCurrentQuestion() {
        return currentQuestion;
    }
}