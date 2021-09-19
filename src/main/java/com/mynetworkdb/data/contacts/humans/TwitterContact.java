package com.mynetworkdb.data.contacts.humans;

public class TwitterContact extends HumanContact {
    private String handle;

    public TwitterContact() {
        super();
    }

    public TwitterContact(String[] input) {
        super(input);
        this.handle = input[4];
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
