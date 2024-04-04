package com.shahjahan.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import soup.neumorphism.NeumorphCardView;

public class layout_calculator extends AppCompatActivity {







    //Gold Gold
    TextInputEditText ed_Gold_Vori,ed_Gold_Roti,ed_Gold_pointe,ed_Gold_taka;
    NeumorphCardView neumor_Button;
    TextView display;



    //rupa
    TextInputEditText ed_vori_rupa,ed_ana_rupa,ed_roti_rupa,rupa;



    //jog jog
    TextInputEditText ed_1,ed_2,ed_3,ed_4,ed_5,ed_6,ed_7,ed_8,ed_9;

    //biog biog
    TextInputEditText edbi_1,edbi_2,edbi_3,edbi_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_calculator);



        //Gold Gold
        ed_Gold_Vori=findViewById(R.id.ed_Gold_Vori);
        ed_Gold_Roti=findViewById(R.id.ed_Gold_Roti);
        ed_Gold_pointe=findViewById(R.id.ed_Gold_pointe);
        neumor_Button=findViewById(R.id.neumor_Button);
        display=findViewById(R.id.display);
        ed_Gold_taka=findViewById(R.id.ed_Gold_taka);


        //Rupa Rupa
        ed_vori_rupa=findViewById(R.id.ed_vori_rupa);
        ed_ana_rupa=findViewById(R.id.ed_ana_rupa);
        ed_roti_rupa=findViewById(R.id.ed_roti_rupa);
        rupa=findViewById(R.id.rupa);


        //jog jog
        //jog jog
        ed_1=findViewById(R.id.ed_1);
        ed_2=findViewById(R.id.ed_2);
        ed_3=findViewById(R.id.ed_3);
        ed_4=findViewById(R.id.ed_4);
        ed_5=findViewById(R.id.ed_5);
        ed_6=findViewById(R.id.ed_6);
        ed_7=findViewById(R.id.ed_7);
        ed_8=findViewById(R.id.ed_8);
        ed_9=findViewById(R.id.ed_9);
        //jog jog
        //jog jog


        //biog biog
        //biog biog
        edbi_1=findViewById(R.id.edbi_1);
        edbi_2=findViewById(R.id.edbi_2);
        edbi_3=findViewById(R.id.edbi_3);
        edbi_4=findViewById(R.id.edbi_4);
        //biog biog
        //biog biog






        neumor_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gold Gold
                String strin_vori = ed_Gold_Vori.getText().toString();
                String strin_Roti = ed_Gold_Roti.getText().toString();
                String strin_pointe = ed_Gold_pointe.getText().toString();
                String strin_gold_taka = ed_Gold_taka.getText().toString();


                //Rupa Rupa  //Rupa Rupa
                String strin_vori1 = ed_vori_rupa.getText().toString();
                String strin_ana = ed_ana_rupa.getText().toString();
                String strin_roti = ed_roti_rupa.getText().toString();
                String strin_taka = rupa.getText().toString();



                //jog jog
                //jog jog
                String strin_1 = ed_1.getText().toString();
                String strin_2 = ed_2.getText().toString();
                String strin_3 = ed_3.getText().toString();
                String strin_4 = ed_4.getText().toString();
                String strin_5 = ed_5.getText().toString();
                String strin_6 = ed_6.getText().toString();
                String strin_7 = ed_7.getText().toString();
                String strin_8 =ed_8.getText().toString();
                String strin_9 =ed_9.getText().toString();
                //jog jog
                //jog jog


                //biog biog
                //biog biog
                String strinbi_1 = edbi_1.getText().toString();
                String strinbi_2 = edbi_2.getText().toString();
                String strinbi_3 = edbi_3.getText().toString();
                String strinbi_4 = edbi_4.getText().toString();
                //biog biog
                //biog biog


                if (ed_Gold_Vori.length() > 0 || ed_Gold_Roti.length() > 0 || ed_Gold_pointe.length() > 0 || ed_vori_rupa.length() > 0 || ed_ana_rupa.length() > 0 || ed_roti_rupa.length() > 0 || ed_1.length() > 0|| ed_2.length() > 0|| ed_3.length() > 0|| ed_4.length() > 0|| ed_5.length() > 0|| ed_6.length() > 0|| ed_7.length() > 0|| ed_8.length() > 0|| ed_9.length() > 0) {

                    //Gold Gold
                    float flo_vori = Float.parseFloat(strin_vori);
                    float flo_Roti = Float.parseFloat(strin_Roti);
                    float flo_pointe = Float.parseFloat(strin_pointe);
                    float flo_gold_taka = Float.parseFloat(strin_gold_taka);


                    //Rupa Rupa  //Rupa Rupa
                    float flo_vori1 = Float.parseFloat(strin_vori1);
                    float flo_ana = Float.parseFloat(strin_ana);
                    float flo_roti = Float.parseFloat(strin_roti);
                    float flo_taka = Float.parseFloat(strin_taka);


                    //jog jog
                    //jog jog
                    float flo_1= Float.parseFloat(strin_1);
                    float flo_2 = Float.parseFloat(strin_2);
                    float flo_3 = Float.parseFloat(strin_3);
                    float flo_4 = Float.parseFloat(strin_4);
                    float flo_5 = Float.parseFloat(strin_5);
                    float flo_6= Float.parseFloat(strin_6);
                    float flo_7 = Float.parseFloat(strin_7);
                    float flo_8 = Float.parseFloat(strin_8);
                    float flo_9 = Float.parseFloat(strin_9);

                    float jog_kora=flo_1 + flo_2 + flo_3 + flo_4 + flo_5 + flo_6 + flo_7 + flo_8 + flo_9;
                    //jog jog
                    //jog jog



                    //biog biog
                    //biog biog
                    float flobi_1= Float.parseFloat(strinbi_1);
                    float flobi_2 = Float.parseFloat(strinbi_2);
                    float flobi_3 = Float.parseFloat(strinbi_3);
                    float flobi_4 = Float.parseFloat(strinbi_4);

                    float biog=flobi_1+flobi_2+flobi_3+flobi_4;
                    //biog biog
                    //biog biog









                    //Gold Gold
                    //Gold Gold
                    float roti = flo_Roti / 16;
                    float pointe = flo_pointe / 96;

                    float mot_vori = flo_vori + roti + pointe;

                    float taka = mot_vori * flo_gold_taka;
                    //Gold Gold
                    //Gold Gold


                    //Rupa Rupa  //Rupa Rupa
                    //Rupa Rupa  //Rupa Rupa
                    float ana = flo_ana / 16;
                    float rotii = flo_roti / 96;
                    float mot_rupa_vori = flo_vori1 + ana + rotii;
                    float rupar_taka = mot_rupa_vori * flo_taka;
                    //Rupa Rupa  //Rupa Rupa
                    //Rupa Rupa  //Rupa Rupa


                    float jog_sona_rupa=taka+rupar_taka+jog_kora;


                    float biog_fol=jog_sona_rupa-biog;
                    float zakat=biog_fol/40;






                    display.setText("Gold_vori=" + mot_vori + "\nmot_taka=" + taka + "\nrupar_vori=" + mot_rupa_vori + "\nRupar_taka=" + rupar_taka +"\nzakatar takar priman"+biog_fol+"\nzakat="+zakat);

                }else {
                    Toast.makeText(layout_calculator.this, "কি খবর তোমার", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}