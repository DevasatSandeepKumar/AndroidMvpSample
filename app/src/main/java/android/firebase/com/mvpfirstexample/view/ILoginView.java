package android.firebase.com.mvpfirstexample.view;

/**
 * Created by Sandeep on 3/10/17.
 */

public interface ILoginView{

        void onClearText();
        void onLoginResult(Boolean result, int code);
        void onSetProgressBarVisibility(int visibility);
    }

