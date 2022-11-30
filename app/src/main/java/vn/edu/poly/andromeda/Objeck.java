package vn.edu.poly.andromeda;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Objeck {
    public static boolean CheckInternet(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(context.CONNECTIVITY_SERVICE);
        if(connectivityManager!=null){
            NetworkInfo[] infos = connectivityManager.getAllNetworkInfo();
            if(infos!= null){
                for (int i=0;i<infos.length;i++){
                    if(infos[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;
                }
            }
        }
        return false;
    }
}
