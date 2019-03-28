package com.cesarfmacario;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

import com.infile.juris.MainActivity;

public class MiPlugin extends CordovaPlugin {

    public CallbackContext callback = null;
    private static final String TAG = "MiPlugin";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {

        if (action.equals("listenTextSelectionAction")) {
            // Setear al contexto de esta clase el callback y al MainActivity.
            this.callback = callbackContext;
            MainActivity.callback = callbackContext;
        }

        return true;
    }

    public void resultadoPlugin(String message, CallbackContext callback){
        PluginResult result = new PluginResult(PluginResult.Status.OK, message);
        callback.sendPluginResult(result);
    }

}
