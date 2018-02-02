package de.mgr.example;

public class UserResult
{

    public UserResult (String user, String date, User user1)
    {

        this.user = user;
        this.date = date;
        this.user1 = user1;
    }

    public String getUser ()
    {
        return "User";
    }


    public String getDate ()
    {
        return "Date";
    }

    public User getUser1 ()
    {
        return user1;
    }


    private String user;
    private String date;
    private User   user1;
}
