package com.designpatterns.ui.example.behavioral.chain_of_responsibility;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

public class ChainOfResponsibilityExampleFragment extends Fragment {

    @BindView(R.id.loginButton)
    View loginButton;

    private String email;
    private String password;
    private Middleware middleware;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chain_of_responsibility_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        middleware = new EmptyValidatorMiddleware()
                .linkWith(new EmailValidatorMiddleware())
                .linkWith(new PasswordStrengthMiddleware());
    }

    @OnTextChanged(R.id.emailEdt)
    void onEmailTextChanged(CharSequence charSequence) {
        email = charSequence.toString();
        checkData();
    }

    @OnTextChanged(R.id.passwordEdt)
    void onPasswordTextChanged(CharSequence charSequence) {
        password = charSequence.toString();
        checkData();
    }

    private void checkData() {
        loginButton.setEnabled(middleware.check(email, password));
    }
}
