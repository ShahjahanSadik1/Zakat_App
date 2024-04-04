package com.shahjahan.zakat;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class web_activity extends AppCompatActivity {


    RelativeLayout rela1;
    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        rela1=findViewById(R.id.rela1);
        textToSpeech=new TextToSpeech(web_activity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });


        rela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tag = rela1.getTag().toString();
                if (tag.equals("play")){
                    textToSpeech.speak("যাকাত কি?\n" +
                            "\n" +
                            "ইসলামের ৫টি মূল স্তম্ভের মধ্যে যাকাত একটি। হিজরি ২য় সনে যাকাতের প্রবর্তন করা হয়। কোন মুসলিম নর-নারী যদি নিসাব পরিমাণ সম্পদের মালিক হয় তাহলে উক্ত ব্যক্তির উপর যাকাত ফরজ। কিন্তু যাকাত সকলের উপর ফরজ নয়। কিছু শর্ত সাপেক্ষে যাকাত ফরজ হয়। যাকাত কাকে বলে? \n" +
                            "\n" +
                            "যাকাত কাকে বলে – যাকার আরবি শব্দ। এর আভিধানিক অর্থ হলো পবিত্রতা, বিশুদ্ধতা, বৃদ্ধি পাওয়া ইত্যাদি। ইসলামি শরিয়াহ অনুযায়ী যে সকল মুসলিম ব্যক্তি নিসাব পরিমাণ সম্পদের মালিক সেই সকল ব্যক্তির সম্পদের একটি নির্দিষ্ট পরিমাণ অর্থাৎ শতকরা ২.৫ শতাংশ হারে গরীব দু:খীদের মাঝে দান করাকে যাকাত বলে। \n" +
                            "\n" +
                            "আবার কোন কোন ইমামগনের মতে, যেমন ইমাম ইবনু তাইমিয়ার এর মতে ” যা প্রদান করার মাধ্যমে মন ও আত্মার পবিত্রতা লাভ হয়, সম্পদ বৃদ্ধি পায় এবং সম্পদ পরিচ্ছন্ন হয় তাকে যাকাত বলে। \n" +
                            "\n" +
                            "ইমাম নববী (রা:) এর মতে ধন সম্পদ হতে একটি নির্দিষ্ট পরিমাণ বের করাকে যাকাত বলে। \n" +
                            "\n" +
                            "সুতরাং যাকাত হলো ব্যক্তি ও মালামাল পবিত্র করার একটি মাধ্যম। যা প্রদান করলে মাল কমে না বরং বাড়ে। তাই আমাদের সকলের উচিত ইসলামি শরিয়াহ অনুযায়ী নিসাব পরিমাণ সম্পদের মালিক হলে যথাযথ ভাবে যাকাত প্রদান করা। এছাড়া কোরআন মজিদে বহুবার উল্লেখ করা হয়েছে কোন মুসলমান যদি নিসাব পরিমাণ সম্পদের মালিক হওয়া সত্ত্বেও যাকাত প্রদান না করে তাকে মুশরিক হিসেবে আখ্যায়িত করা হয়েছে। \n" +
                            "\n" +
                            "আমরা মুশরিক না হয়ে আল্লাহর প্রিয় বান্দা হিসেবে আল্লাহর দেয়া বিধান অনুযায়ী যাকাত প্রদান করব। ",TextToSpeech.QUEUE_FLUSH,null,null);
                    rela1.setTag("pause");
                }else {
                    if (textToSpeech.isSpeaking()){
                        textToSpeech.stop();
                    }
                    rela1.setTag("play");
                }

            }
        });






    }

    @Override
    protected void onDestroy() {
        if (textToSpeech!=null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }
}