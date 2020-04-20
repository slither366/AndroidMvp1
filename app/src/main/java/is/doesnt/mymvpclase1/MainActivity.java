package is.doesnt.mymvpclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import is.doesnt.mymvpclase1.model.SigninPresenterImpl;
import is.doesnt.mymvpclase1.presenter.ISigninPresenter;
import is.doesnt.mymvpclase1.view.ISigninView;

public class MainActivity extends AppCompatActivity implements ISigninView {

    private ISigninPresenter signinPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signinPresenter = new SigninPresenterImpl(MainActivity.this);
        //Deves llamar a las mismas credenciales de PresenterImpl
        signinPresenter.signIn("ashok", "groovy");
    }

    @Override
    public void showValidationError() {
        Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInSuccess() {
        Toast.makeText(MainActivity.this, "Signin success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInError() {
        Toast.makeText(MainActivity.this, "Sigin failed -- Invalid Credentials", Toast.LENGTH_SHORT).show();
    }
}
