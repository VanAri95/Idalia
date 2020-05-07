package com.example.idalia.ui.questionnaire;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionnaireViewModel extends ViewModel {

    private MutableLiveData<String> currentQuestion;

    public MutableLiveData<String> getCurrentQuestion(){
        return currentQuestion;
    }

    public QuestionnaireViewModel() {
        currentQuestion = new MutableLiveData<>();
        currentQuestion.setValue("Welcome to the questionnaire! When you are ready, press continue.");
    }
}