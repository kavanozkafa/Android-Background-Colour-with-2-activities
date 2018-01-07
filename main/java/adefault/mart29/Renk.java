package adefault.mart29;

import android.app.Application;

/**
 * Created by sammas on 29.03.2017.
 */

public class Renk extends Application {

    int redvalue;
    int greenvalue;
    int bluevalue;

    public int getred()
    {

        return redvalue;
    }
    public void setred(int r)
    {

        redvalue=r;
    }

    public int getblue()
    {

        return bluevalue;
    }

    public void setblue(int b)
    {

        bluevalue=b;
    }


    public void setgreen(int g)
    {

        greenvalue=g;
    }

    public int getgreen()
    {

        return greenvalue;
    }
}
