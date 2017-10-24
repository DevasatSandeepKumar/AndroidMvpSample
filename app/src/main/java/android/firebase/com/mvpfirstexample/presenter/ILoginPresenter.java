package android.firebase.com.mvpfirstexample.presenter;

/**
 * Created by Sandeep on 3/10/17.
 */

public interface ILoginPresenter  {


    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
