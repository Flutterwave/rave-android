package com.flutterwave.raveandroid.zmmobilemoney;

import com.flutterwave.raveandroid.Payload;
import com.flutterwave.raveandroid.ViewObject;

import java.util.HashMap;

public class NullZmMobileMoneyView implements ZmMobileMoneyContract.View {

    @Override
    public void showToast(String message) {

    }

    @Override
    public void showFetchFeeFailed(String s) {

    }

    @Override
    public void onPaymentError(String message) {

    }

    @Override
    public void showPollingIndicator(boolean active) {

    }

    @Override
    public void onPhoneValidated(String phoneToSet, boolean isEditable) {

    }

    @Override
    public void showProgressIndicator(boolean active) {

    }

    @Override
    public void onAmountValidationSuccessful(String valueOf) {

    }

    @Override
    public void displayFee(String charge_amount, Payload payload) {

    }

    @Override
    public void onPaymentFailed(String message, String responseAsJSONString) {

    }

    @Override
    public void showFieldError(int viewID, String message, Class<?> viewtype) {

    }

    @Override
    public void onValidationSuccessful(HashMap<String, ViewObject> dataHashMap) {

    }

    @Override
    public void onPollingRoundComplete(String flwRef, String txRef, String publicKey) {

    }

    @Override
    public void onPaymentSuccessful(String status, String flwRef, String responseAsString) {

    }
}
