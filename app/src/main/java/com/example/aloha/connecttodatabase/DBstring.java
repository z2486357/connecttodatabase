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
import org.w3c.dom.Entity;

import java.util.ArrayList;

public class DBstring {
    public static String DB1(String i){
        String result="";
        try{
            HttpClient HC=new DefaultHttpClient();
            HttpPost HP=new HttpPost("http://z2486357.byethost31.com/");
            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("S1",i));
            HP.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse HR=HC.execute(HP);
            result=EntityUtils.toString(HR.getEntity(),HTTP.UTF_8);



        }catch (Exception e){
            Log.i("Error Message",e.toString());
        }
        return result;
    }
}
