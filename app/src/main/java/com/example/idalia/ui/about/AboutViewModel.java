package com.example.idalia.ui.about;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class AboutViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public AboutViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        String text = "Made for improving all kinds of interpersonal relationships." +
                "\nSpecial thanks to Nick Notas for allowing me using his content!" +
                "\nIf you have any questions, feel free to contact me!";
        mText.setValue(text);
    }

    public LiveData<String> getText() {
        return mText;
    }
}