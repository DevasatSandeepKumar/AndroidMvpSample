package android.firebase.com.mvpfirstexample.presenter;

import android.os.Handler;
import android.os.Looper;

import android.firebase.com.mvpfirstexample.view.ILoginView;
import android.firebase.com.mvpfirstexample.model.IUser;
import android.firebase.com.mvpfirstexample.model.UserModel;

/**
 * Created by Sandeep on 3/10/17.
 */

public class LoginPresenterCompl implements ILoginPresenter{
    ILoginView iLoginView;
    IUser user;
    Handler handler;


    public LoginPresenterCompl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    private void initUser() {

        user = new UserModel("Sandy","12345");
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String passwd) {

        Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name,passwd);
        if (code!=0) isLoginSuccess = false;
        final Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);

    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {
        iLoginView.onSetProgressBarVisibility(visiblity);
    }

    }
    

    
    
    

