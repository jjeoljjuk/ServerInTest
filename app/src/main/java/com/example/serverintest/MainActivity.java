package com.example.serverintest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    String reqUrl = "http://10.0.2.2:8080/setTestDelete";
    String method = "POST";
    String reqBody= "{\"num\":9}";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









    }

    public void jsondata() {


        new Thread(new Runnable() {
            @Override
            public void run() {

                JSONObject jsonObject = HttpUtil.requestBody(reqUrl,method,reqBody);

                try
                {
                    LogService.info(jsonObject.get("result").toString());
                    LogService.info(jsonObject.toString());
                }catch(Exception ex)
                {

                }



            }
        }).start();

    }

}
