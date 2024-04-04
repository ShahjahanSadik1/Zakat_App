package com.shahjahan.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.RelativeLayout;

public class zakat_kat extends AppCompatActivity {

    RelativeLayout rela_kat;
    TextToSpeech specch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_kat);
        rela_kat=findViewById(R.id.rela_kat);

        specch=new TextToSpeech(zakat_kat.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

       rela_kat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String tag=rela_kat.getTag().toString();
               if (tag.equals("play")){
                   specch.speak("যাকাত বণ্টনের খাতসমূহ\n" +
                                   "\n" +
                                   "পবিত্র কুরআনের সূরা আত-তাওবার ৬০ নাম্বার আয়াতে যাকাত বণ্টনে আটটি খাত আল্লাহ তায়ালা নির্ধারন করেছেন। এই খাতগুলো সরাসরি কুরআন দ্বারা নির্দিষ্ট এবং যেহেতু তা আল্লাহর নির্দেশ, তাই এর বাইরে যাকাত বণ্টন করলে তা ইসলামী শরিয়তসম্মত হয় না।\n" +
                                   "\n" +
                                   "   ১ ফকির (যার কিছুই নেই)\n" +
                                   "   ২ মিসকীন(যার নেসাব পরিমাণ সম্পদ নেই)\n" +
                                   "   ৩ যাকাত আদায়ে নিযুক্ত কর্মচারী (যার অন্য জীবিকা নেই)\n" +
                                   "   ৪ নওমুসলিমদের(আর্থিক সংকটে থাকলে)\n" +
                                   "   ৫ ক্রীতদাস(মুক্তির উদ্দেশ্যে)\n" +
                                   "   ৬ ধনী সম্পদশালী ব্যক্তি যার সম্পদের তুলনায় ঋণ বেশি\n" +
                                   "   ৭(স্বদেশে ধনী হলেও বিদেশে) আল্লাহর পথে জেহাদে রত ব্যক্তি\n" +
                                   "   ৮ মুসাফির (যিনি ভ্রমণকালে অভাবে পতিত)"
                           ,TextToSpeech.QUEUE_FLUSH,null,null);
                   rela_kat.setTag("pause");

               }else {
                   if (specch.isSpeaking()){
                       specch.stop();
                   }
                   rela_kat.setTag("play");
               }



           }

       });





    }

    @Override
    protected void onDestroy() {
        if (specch!=null){
            specch.stop();
            specch.shutdown();
        }
        super.onDestroy();
    }

     
}