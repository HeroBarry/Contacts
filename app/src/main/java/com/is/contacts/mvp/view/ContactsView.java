package com.is.contacts.mvp.view;

import com.is.contacts.entity.Contacts;

import java.util.List;

/**
 * Created by MVPHelper on 2016/10/13
 */

public interface ContactsView extends BaseView {
    void showData(List<Contacts> contacts);

    void exit();
}