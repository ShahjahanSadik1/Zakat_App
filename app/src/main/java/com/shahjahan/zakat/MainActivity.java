package com.shahjahan.zakat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {


    NeumorphCardView  bmiImage1,id_celsius2,jor3,tranSac4;

    WebView webview;
    LinearLayout lay_one,lay_two,lay_there,lay_four,lay_five,layout_video,main_layout,home_lay,video_lay;


    //video image gone
    ImageView imagegon;

    //admove
    AdView mAdView;

    //calculator button
    RelativeLayout calculator_button;


    //ad
    InterstitialAd mInterstitialAd;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //BANNER ad porichoy
        mAdView=findViewById(R.id.mAdView);
        //BANNER ad porichoy






        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        webview=findViewById(R.id.webview);
        lay_one=findViewById(R.id.lay_one);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>




        lay_two=findViewById(R.id.lay_two);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        lay_there=findViewById(R.id.lay_there);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        lay_four=findViewById(R.id.lay_four);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        lay_five=findViewById(R.id.lay_five);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        main_layout=findViewById(R.id.main_layout);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        layout_video=findViewById(R.id.layout_video);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        home_lay=findViewById(R.id.home_lay);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        video_lay=findViewById(R.id.video_lay);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        imagegon=findViewById(R.id.imagegon);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Calculator battton porichoy
        calculator_button=findViewById(R.id.calculator_button);




        bmiImage1=findViewById(R.id.bmiImage1);
        id_celsius2=findViewById(R.id.id_celsius2);
        jor3=findViewById(R.id.jor3);
        tranSac4=findViewById(R.id.tranSac4);











        //BANNER initialize BANNER initialize BANNER initialize
        //BANNER initialize BANNER initialize BANNER initialize
        //BANNER initialize BANNER initialize BANNER initialize
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        //BANNER initialize BANNER initialize BANNER initialize
        //BANNER initialize BANNER initialize BANNER initialize
        //BANNER initialize BANNER initialize BANNER initialize






        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        lay_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/6H8blzS2QW0");
                imagegon.setVisibility(View.GONE);
            }
        });
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        lay_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/TCuSkrZC-fE");
                imagegon.setVisibility(View.GONE);
            }
        });
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        lay_there.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/_9lQC4h-pCs");
                imagegon.setVisibility(View.GONE);
            }
        });
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        lay_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/Xw9QbKLRpu4");
                imagegon.setVisibility(View.GONE);
            }
        });
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        lay_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/AZJBntuyUrw");
                imagegon.setVisibility(View.GONE);
            }
        });
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        home_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_layout.setVisibility(View.VISIBLE);
                layout_video.setVisibility(View.GONE);
            }
        });


        video_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_layout.setVisibility(View.GONE);
                layout_video.setVisibility(View.VISIBLE);
            }
        });









        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.img1,"image 1"));
        sliderItems.add(new SliderItem(R.drawable.img2,"Image 2"));
        sliderItems.add(new SliderItem(R.drawable.img3,"Image 3"));
        sliderItems.add(new SliderItem(R.drawable.img4,"Image 4"));
        sliderItems.add(new SliderItem("https://scontent.fjsr16-1.fna.fbcdn.net/v/t39.30808-6/277468026_5486907201354434_1626911398828644923_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1ac024&_nc_eui2=AeGnLuAInRws3c58h6tXipRBbe4-XJx-d8Ft7j5cnH53wVvPISC7Kxn6TvzhX_SJduVhrUFCGXuJ_6qR4CFsJ0nj&_nc_ohc=9_KxwVkXuUgAX87tso_&_nc_zt=23&_nc_ht=scontent.fjsr16-1.fna&oh=00_AfAQ8ctEtL5cCBTsH1StX8b4OeuZRAF5V3C6vG5f8fsnow&oe=650C65A8","Image from url"));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,5000));

        new SliderAdapter((position, title, view) -> {
            Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show();
        });
        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //silyder>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        bmiImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(MainActivity.this,web_activity.class);
                startActivity(in1);

            }
        });



        id_celsius2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(MainActivity.this,zakat_foroz.class);
                startActivity(in1);
            }
        });



        jor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(MainActivity.this,zakat_kat.class);
                startActivity(in1);
            }
        });



        tranSac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(MainActivity.this,zakat_what.class);
                startActivity(in1);
            }
        });


        //Calculator battton
        //Calculator battton
        //Calculator battton
        calculator_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int_calculator=new Intent(MainActivity.this,layout_calculator.class);
                startActivity(int_calculator);
            }
        });
        //Calculator battton
        //Calculator battton
        //Calculator battton














    }






        @Override
    public void onBackPressed() {

            // super.onBackPressed();

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Zakat")
                    .setMessage("Do you want to exit?")
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            finishAndRemoveTask();

                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();

                        }
                    })
                    .setIcon(R.drawable.message_icon)
                    .show();


        }






    }

















