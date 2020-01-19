package com.example.imageapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;


public class ScreenFragments extends Fragment {



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //StrictMode.setThreadPolicy(policy);

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        ImageView imageView=(ImageView) rootView.findViewById(R.id.image);
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int random_num = rand.nextInt(10000);

        Picasso.get().load("https://picsum.photos/200/300?random=" + random_num).fit().centerInside().into(imageView);
        //Picasso.get().load("https://picsum.photos/200/300.jpg").fit().centerInside().into(imageView);
        //TextView tv = (TextView) rootView.findViewById(R.id.avg_testtv);
        //tv.setText(String.valueOf(getArguments().getInt("page_position")));
        //container.addView(imageView);

        return rootView;
    }
}

