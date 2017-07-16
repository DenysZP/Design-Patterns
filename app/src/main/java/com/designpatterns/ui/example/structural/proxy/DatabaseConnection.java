package com.designpatterns.ui.example.structural.proxy;

import com.designpatterns.ui.example.structural.adapter.LocalUser;

import java.util.List;

public interface DatabaseConnection {

    List<LocalUser> getUserList() throws Exception;
}
