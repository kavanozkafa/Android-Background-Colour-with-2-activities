package adefault.mart29;

import android.app.Application;

/**
 * Created by sammas on 29.03.2017.
 */

public class MyappOrtakHavuz   extends Application {

    private String HerhangiBirDegisken="";


    public String GetHerhangiBirDegisken()

    {
        return HerhangiBirDegisken;
    }


    public String SetHerhangiBirDegisken(String herhangiBirDegisken)

    {
        return HerhangiBirDegisken=herhangiBirDegisken;
    }


}
