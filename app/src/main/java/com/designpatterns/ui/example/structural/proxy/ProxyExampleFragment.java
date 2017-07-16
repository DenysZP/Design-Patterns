package com.designpatterns.ui.example.structural.proxy;

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

public class ProxyExampleFragment extends Fragment {

    @BindView(R.id.adminResult)
    TextView adminResult;

    @BindView(R.id.employeeResult)
    TextView employeeResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_proxy_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Admin admin = new Admin();
        admin.setDatabaseConnection(new DatabaseConnectionProtectionProxy(admin));

        Employee employee = new Employee();
        employee.setDatabaseConnection(new DatabaseConnectionProtectionProxy(employee));

        getAccess(admin, adminResult);
        getAccess(employee, employeeResult);
    }

    private void getAccess(Position position, TextView resultView) {

        String result;
        try {
            result = position.getUserDatabase().toString();
        } catch (Exception ex) {
            result = ex.getMessage();
        }

        resultView.setText(position.getPositionName() + " result - " + result);
    }
}
