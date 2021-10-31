package com.example.keznel.ui.borrowing_page;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BorrowingPageViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public BorrowingPageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is borrowing page fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}