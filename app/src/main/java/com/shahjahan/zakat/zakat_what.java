package com.shahjahan.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.RelativeLayout;

public class zakat_what extends AppCompatActivity {

    RelativeLayout rela_voice;

    TextToSpeech voice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_what);


        rela_voice=findViewById(R.id.rela_voice);
        voice=new TextToSpeech(zakat_what.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        rela_voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tag=rela_voice.getTag().toString();
                if (tag.equals("play")){
                    voice.speak("যাকাত আদায় করা কি?\n" +
                            "\n" +
                            "ইসলামী শরীয়ত অনুযায়ী কোন মুসলিম ব্যক্তি যদি নিসাব পরিমাণ সম্পদের মালিক হয় তাহলে প্রতি বছরে তার সম্পত্তির শতকরা ২.৫০% হারে নির্দিষ্ট খাতে অর্থাৎ গরিব দুখির মাঝে দান করাকে যাকাত বলে। সুতরাং কোন ব্যক্তি যদি শরীয়তে নির্দিষ্ট নিসাব পরিমান অর্থাৎ ৭.৫তোলা স্বর্ণ বা ৫২.৫০ তোলা রুপা কিংবা সমপরিমাণ মূল্যের টাকা বা ব্যবসার মালের মালিক হয় তাহলে তার সম্পদের যাকাত আদায় করা ফরজ। আবার কোন ব্যক্তি যদি নিসাব পরিমাণ সম্পদের মালিক হওয়া স্বত্বেও যাকাত প্রদান না করে থাকেন তাহলে তাদেরকে কোরআনের বিভিন্ন আয়াতে আল্লাহ তায়ালা মুশরিক বলে আখ্যায়িত করেছেন। সুতরাং সমাজে যারা ধনী মানুষ তাদের প্রত্যেকের উচিত যাকাত প্রদান করা।\n" +
                            "যাকাত কাকে বলে  FAQ\n" +
                            "\n" +
                            "যাকাত কি?\n" +
                            "\n" +
                            "যাকাত আরবী শব্দ। এর আভিধানিক অর্থ হলো পবিত্রতা, বৃদ্ধি পাওয়া, বরকত হওয়া ইত্যাদি। যদি কোন মুসলিম নর-নারীর কাছে ১ বছর সময় ধরে নিসাব পরিমাণ সম্পদ জমা থাকে তাহলে শরিয়াতের নিয়মানুযায়ী শতকরা ২.৫% হারে গরীব মিসকিনদের মাঝে বিতরণ করাই হলো যাকাত।\n" +
                            "\n" +
                            "যাকাত শব্দের অর্থ কি?\n" +
                            "\n" +
                            "যাকাত আরবী শব্দ। যার অর্থ হলো পরিপূর্ণতা, পবিত্রতা, বৃদ্ধি পাওয়া, বরকত হওয়া ইত্যাদি।\n" +
                            "\n" +
                            "বর্তমানে কত টাকা থাকলে যাকাত ফরজ হয়?\n" +
                            "\n" +
                            "যদি কোন ব্যক্তি বর্তমান সোনার দাম অনুসারে যাকাত দিতে চাই তাহলে তাকে ছয় লক্ষ টাকার মালিক হতে হবে। আর যদি রুপার দাম অনু্যায়ী যাকাত দিতে চাই তাহলে তাকে ৬০ হাজার টাকার মালিক হতে হবে।",TextToSpeech.QUEUE_FLUSH,null,null);
                    rela_voice.setTag("pause");
                }else {
                    if (voice.isSpeaking()){
                        voice.stop();
                    }
                    rela_voice.setTag("play");
                }

            }
        });




    }

    @Override
    protected void onDestroy() {
        if (voice!=null){
            voice.stop();
            voice.shutdown();
        }
        super.onDestroy();
    }
}