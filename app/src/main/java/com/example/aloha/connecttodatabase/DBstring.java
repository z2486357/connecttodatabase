package com.example.aloha.connecttodatabase;

import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.w3c.dom.Entity;

public class DBstring {
    public static String DB1(String i){
        String result="";
        try{
            HttpClient HC=new DefaultHttpClient();
            HttpPost HP=new HttpPost("http://z2486357.byethost31.com/");
            HP.addHeader("Cookie", "__test=ae8eb973874586be778dfa1ace725c7a; expires=Thu, 31-Dec-37 23:55:55 GMT; path=/");
            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("S1",i));
            HP.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse HR=HC.execute(HP);
            result=EntityUtils.toString(HR.getEntity(),HTTP.UTF_8);



        }catch (Exception e){
            Log.i("錯誤訊息",e.toString());
        }
        return result;
    }
}
