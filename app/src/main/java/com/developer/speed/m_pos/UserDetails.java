package com.developer.speed.m_pos;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class UserDetails extends RealmObject {
    @PrimaryKey
    public String identity;

    @Required
    public String firstName, lastName;

    @Required
    public int phoneNumber;

    public String emailAddress;

    @Required
    public String password;


}
