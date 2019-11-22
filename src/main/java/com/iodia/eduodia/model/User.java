package com.iodia.eduodia.model;

public class User
{

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    public User(long id, String firstName, String email, String mobile)
    {
        super();
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "User [id=" + id + ", name=" + firstName + "]";
    }

}
