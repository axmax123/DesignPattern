package com.example.design.creat.PrototypePattern;

public class User implements Cloneable{

    private String userName;
    private String password;
    private String address;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public User(String userName, String password, String address) {
        this.userName = userName;
        this.password = password;
        this.address = address;
    }

    @Override
    protected User clone() {
        try {
            return (User) super.clone();
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();

        }
    return null;}

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
