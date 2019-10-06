package com.example.inmobiliaria_010.ui.perfil;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<ConstraintLayout> cl;

    public PerfilViewModel() {
        //   mText = new MutableLiveData<>();
        //   mText.setValue("This is home fragment");
        cl = new MutableLiveData<>();
        cl.getValue();
    }

    public  LiveData<ConstraintLayout> layoutLiveData(){
        return cl;
    }
    //public LiveData<String> getText() {
    //    return mText;
    //}
}
