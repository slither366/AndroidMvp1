package is.doesnt.mymvpclase1.model;

import android.text.TextUtils;

import is.doesnt.mymvpclase1.presenter.ISigninPresenter;
import is.doesnt.mymvpclase1.view.ISigninView;

public class SigninPresenterImpl implements ISigninPresenter {

    private ISigninView signinView;

    public SigninPresenterImpl(ISigninView signinView) {
        this.signinView = signinView;
    }

    @Override
    public void signIn(String userName, String passWord) {

        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(passWord)){
            signinView.showValidationError();
        }else{
            if(userName.equalsIgnoreCase("ashok") &&
                    passWord.equalsIgnoreCase("groovy")){
                signinView.signInSuccess();
            }else{
                signinView.signInError();
            }
        }
    }
}
