package android.firebase.com.mvpfirstexample.model;

/**
 * Created by Sandeep on 3/10/17.
 */

public interface IUser {
        String getName();

        String getPasswd();

        int checkUserValidity(String name, String passwd);

}
