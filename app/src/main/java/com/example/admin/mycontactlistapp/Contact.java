package com.example.admin.mycontactlistapp;

public class Contact
{
    int image;
    String name,nickname;

    public Contact(int image, String name, String nickname) {
        this.image = image;
        this.name = name;
        this.nickname = nickname;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}