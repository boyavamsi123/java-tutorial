package com.hyrtutorials.inheritance;

public interface  IAdmin extends IGuest, IDeveloper{
    public void manage();
}