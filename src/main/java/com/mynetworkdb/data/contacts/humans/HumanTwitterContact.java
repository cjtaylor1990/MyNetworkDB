package com.mynetworkdb.data.contacts.humans;

import com.mynetworkdb.data.interfaces.TwitterInterface;

public class HumanTwitterContact extends HumanContact implements TwitterInterface {
    private String handle;

    public HumanTwitterContact() {}

    public HumanTwitterContact(String[] input){
        super(input);
        this.handle = input[4];
    }

    public String getHandle() {
        return this.handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
