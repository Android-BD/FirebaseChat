package com.glacion.firebasechat;

public interface LoginModel {

    interface OnLoginFinishedListener{

        void onCancelled();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener onLoginFinishedListener);
}
