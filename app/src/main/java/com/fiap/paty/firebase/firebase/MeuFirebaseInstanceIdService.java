package com.fiap.paty.firebase.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService{

    @Override
    public void onTokenRefresh(){
        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        senRegistrationToServer(refreshedToken);
    }

    public void senRegistrationToServer(String token){
        Log.d("token", "Refreshed token: "+token);
    }
}
