package com.example.idalia.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.example.idalia.FileHelper;

public class HomeViewModel extends AndroidViewModel {

    private MutableLiveData<String> mQuote;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        mQuote = new MutableLiveData<>();
        String currentQuote = new FileHelper(getApplication()).readCSVFile("quotes_all_neu.csv");
        mQuote.setValue(currentQuote.replace(';', '\n'));
    }

    public MutableLiveData<String> getQuote() {
        return mQuote;
    }

}