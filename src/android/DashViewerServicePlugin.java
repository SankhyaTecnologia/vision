package br.com.sankhya.dashviewer;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;

import android.content.Intent;
import android.util.Log;

public class DashViewerServicePlugin extends CordovaPlugin {

    @Override
    public void onNewIntent(Intent intent) {
    	Log.i("WebIntent", "Passando no onNewIntent force Extra = " + intent.toString());
    	//Forçamos atualização dos parâmetros da Itent (Intent Extra)
    	((CordovaActivity)this.cordova.getActivity()).setIntent(intent);
    }
    
//    @TargetApi(12)
//    private void allowThirdPartyCookieCompat() {
//    	CookieManager.setAcceptFileSchemeCookies(true); 
//    }
//    
//	@TargetApi(21)
//	private void allowThirdPartyCookie(CordovaWebView webView) {
//        CookieManager cookieManager = CookieManager.getInstance();
//        cookieManager.setAcceptThirdPartyCookies(webView,true);
//	}
//    
//    @Override
//    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
//    	 //Allow third party cookies for Android Lollipop
//        if (Build.VERSION.SDK_INT >= 21) {
//        	allowThirdPartyCookie(webView);
//        }else if (Build.VERSION.SDK_INT >= 12) {
//        	allowThirdPartyCookieCompat();
//        }
//    }
}
