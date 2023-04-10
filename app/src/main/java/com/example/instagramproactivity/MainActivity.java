package com.example.instagramproactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //    story id
    ArrayList<Integer> proimg = new ArrayList<>();
    ArrayList<String> proname = new ArrayList<>();
    ArrayList<UserModelClass> data = new ArrayList<UserModelClass>();
    RecyclerView rcvmain;
    ArrayList<Integer> sdimg = new ArrayList<>();

    //   post id
    ArrayList<Integer> postaccimg = new ArrayList<>();
    ArrayList<String> postname = new ArrayList<>();

    ArrayList<String> postnameTwo = new ArrayList<>();
    ArrayList<Integer> postimg = new ArrayList<>();

    ArrayList<String> details = new ArrayList<String>();
    ArrayList<PostModelClass> postdata = new ArrayList<PostModelClass>();
    RecyclerView rcvpost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
        postview();

    }

    private void postview() {
        postdetails();

        PostInterface postInterface = new PostInterface() {
            @Override
            public void clickedon(int postphoto, String postname, int postaccphoto,String details,String postnameTwo) {
                Intent o = new Intent(MainActivity.this,DisplayPostItem.class);
                o.putExtra("photos",postphoto);
                o.putExtra("names",postname);
                o.putExtra("accphoto",postaccphoto);
                o.putExtra("details",details);
                o.putExtra("postnameTwo",postnameTwo);
                startActivity(o);
            }
        };

        for (int i = 0; i < 9; i++) {
            PostModelClass model = new PostModelClass();
            model.setPostaccimg(postaccimg.get(i));
            model.setPostimg(postimg.get(i));
            model.setPostname(postname.get(i));
            model.setDetails(details.get(i));
            model.setPostnameTwo(postnameTwo.get(i));
            postdata.add(model);

            rcvpost = findViewById(R.id.rcvpost);
            InstaPostAdapter postAdapter = new InstaPostAdapter(postdata,postInterface);

            LinearLayoutManager postmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            rcvpost.setLayoutManager(postmanager);
            rcvpost.setAdapter(postAdapter);


        }
    }

    private void postdetails() {
        postname.add("Jhonney");
        postname.add("Olivia");
        postname.add("Charlotte");
        postname.add("Jayden");
        postname.add("Lincoln");
        postname.add("Jacob");
        postname.add("Sophia");
        postname.add("Mia");
        postname.add("Amelia");
        postname.add("Isabella");

        postnameTwo.add("Jhonney");
        postnameTwo.add("Olivia");
        postnameTwo.add("Charlotte");
        postnameTwo.add("Jayden");
        postnameTwo.add("Lincoln");
        postnameTwo.add("Jacob");
        postnameTwo.add("Sophia");
        postnameTwo.add("Mia");
        postnameTwo.add("Amelia");
        postnameTwo.add("Isabella");

        postaccimg.add(R.drawable.sp1);
        postaccimg.add(R.drawable.sp2);
        postaccimg.add(R.drawable.sp3);
        postaccimg.add(R.drawable.sp4);
        postaccimg.add(R.drawable.sp5);
        postaccimg.add(R.drawable.sp6);
        postaccimg.add(R.drawable.sp7);
        postaccimg.add(R.drawable.sp8);
        postaccimg.add(R.drawable.sp9);
        postaccimg.add(R.drawable.sp10);

        postimg.add(R.drawable.x1);
        postimg.add(R.drawable.x2);
        postimg.add(R.drawable.x3);
        postimg.add(R.drawable.x4);
        postimg.add(R.drawable.x5);
        postimg.add(R.drawable.x6);
        postimg.add(R.drawable.x7);
        postimg.add(R.drawable.x8);
        postimg.add(R.drawable.x9);
        postimg.add(R.drawable.x10);

        details.add("Devlopers Be like");
        details.add("Naruto Uzumaki");
        details.add("Jim Carry");
        details.add("Yin and Yan Between Two Rival");
        details.add("GTR");
        details.add("Get Travel Bag");
        details.add("Toyota Supra");
        details.add("T-Shirt 60% OFF");
        details.add("BMW");
        details.add("Kawasaki Ninja ZX2R");

    }

    private void initview() {

        setdetails();

        StoryInterface storyInterface = new StoryInterface() {
            @Override
            public void onclick(int storyimg, String storyname, int storybigimg) {
                Log.e("TAG", "clicked on:" + sdimg + " " + proname);

                Intent i = new Intent(MainActivity.this, DisplayStoryItem.class);
                i.putExtra("photo", storyimg);
                i.putExtra("name", storyname);
                i.putExtra("bigphoto", storybigimg);
                startActivity(i);

            }
        };
        for (int i = 0; i < 9; i++) {
            UserModelClass modelClass = new UserModelClass();
            modelClass.setProfileimage(proimg.get(i));
            modelClass.setProfilename(proname.get(i));
            modelClass.setProfilebigimg(sdimg.get(i));
            data.add(modelClass);

            rcvmain = findViewById(R.id.rcvmain);
            InstaProAdapter adapter = new InstaProAdapter(data, storyInterface);


            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            rcvmain.setLayoutManager(manager);
            rcvmain.setAdapter(adapter);
        }
    }

    private void setdetails() {
        proimg.add(R.drawable.sp1);
        proimg.add(R.drawable.sp2);
        proimg.add(R.drawable.sp3);
        proimg.add(R.drawable.sp4);
        proimg.add(R.drawable.sp5);
        proimg.add(R.drawable.sp6);
        proimg.add(R.drawable.sp7);
        proimg.add(R.drawable.sp8);
        proimg.add(R.drawable.sp9);
        proimg.add(R.drawable.sp10);

        proname.add("Jhonney");
        proname.add("Olivia");
        proname.add("Charlotte");
        proname.add("Jayden");
        proname.add("Lincoln");
        proname.add("Jacob");
        proname.add("Sophia");
        proname.add("Mia");
        proname.add("Amelia");
        proname.add("Isabella");

        sdimg.add(R.drawable.z1);
        sdimg.add(R.drawable.z2);
        sdimg.add(R.drawable.z3);
        sdimg.add(R.drawable.z4);
        sdimg.add(R.drawable.z5);
        sdimg.add(R.drawable.z6);
        sdimg.add(R.drawable.z7);
        sdimg.add(R.drawable.z8);
        sdimg.add(R.drawable.z9);
        sdimg.add(R.drawable.z10);


    }
}