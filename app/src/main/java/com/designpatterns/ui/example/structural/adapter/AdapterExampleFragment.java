package com.designpatterns.ui.example.structural.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterExampleFragment extends Fragment {

    @BindView(R.id.originalData)
    TextView originalData;

    @BindView(R.id.userListText)
    TextView userListText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adapter_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        LocalUser localUser = new LocalUser("Jerry Stanley", "1987-Jul-02", "5159456493");
        Contact contact = new Contact("Mark", "Graves", new Date(78939493000L), "(478)-787-4093");

        originalData.setText(contact.toString());

        printLocalUser(localUser);
        printLocalUser(new ContactAdapter(contact));
    }

    private void printLocalUser(User user) {

        userListText.append("Username: " + user.getUsername() + "\n");
        userListText.append("Age: " + user.getAge() + "\n");
        userListText.append("Contact data: " + user.getContactData() + "\n");
        userListText.append("\n");
    }
}
