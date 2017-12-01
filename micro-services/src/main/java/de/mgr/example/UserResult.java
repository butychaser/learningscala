package de.mgr.example;

public class UserResult
{

    public UserResult (String user, String date)
    {

        this.user = user;
        this.date = date;
    }

    public String getUser ()
    {
        return "User";
    }


    public String getDate ()
    {
        return "Date";
    }


    private String user;
    private String date;
}
