package com.designpatterns.ui.example.creational.builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuilderExampleFragment extends Fragment {

    public static final String USER_FIRST_NAME = "user_first_name";
    public static final String USER_SURNAME = "user_surname";
    public static final String USER_EMAIL = "user_email";

    @BindView(R.id.userData)
    TextView userData;

    @BindView(R.id.email)
    TextView email;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_builder_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Bundle arg = getArguments();
        userData.setText(arg.getString(USER_FIRST_NAME) + " " + arg.getString(USER_SURNAME));
        email.setText(arg.getString(USER_EMAIL));
    }

    public static class Builder {

        private Bundle bundle;

        public Builder() {
            bundle = new Bundle();
        }

        public Builder setUserFirstName(String userFirstName) {
            bundle.putString(USER_FIRST_NAME, userFirstName);
            return this;
        }

        public Builder setUserSurname(String userSurname) {
            bundle.putString(USER_SURNAME, userSurname);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            bundle.putString(USER_EMAIL, userEmail);
            return this;
        }

        public BuilderExampleFragment build() {
            BuilderExampleFragment fragment = new BuilderExampleFragment();
            fragment.setArguments(bundle);
            return fragment;
        }
    }
}
