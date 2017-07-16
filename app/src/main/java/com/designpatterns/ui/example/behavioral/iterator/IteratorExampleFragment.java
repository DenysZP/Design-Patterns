package com.designpatterns.ui.example.behavioral.iterator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.adapter.User;

public class IteratorExampleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_iterator_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (view instanceof TextView) {
            TextView textView = (TextView) view;

            Iterator oldDatabaseIterator = new OldUserDatabase();
            textView.append("Old user database\n\n");
            printData(textView, oldDatabaseIterator);

            Iterator newDatabaseIterator = new NewUserDatabase();
            textView.append("New user database\n\n");
            printData(textView, newDatabaseIterator);
        }
    }

    private void printData(TextView textView, Iterator iterator) {

        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof User) {
                User user = (User) object;
                textView.append("Username: " + user.getUsername() + "\n");
                textView.append("Age: " + user.getAge() + "\n");
                textView.append("Contact data: " + user.getContactData() + "\n");
                textView.append("\n");
            }
        }
    }
}
