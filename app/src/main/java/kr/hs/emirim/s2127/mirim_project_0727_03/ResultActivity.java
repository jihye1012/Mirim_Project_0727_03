package kr.hs.emirim.s2127.mirim_project_0727_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textComment= findViewById(R.id.text_comment);
        TextView textW=findViewById(R.id.text_weight2);
        ImageView imgV=findViewById(R.id.imgV);
        ImageView imgHome=findViewById(R.id.img_home);
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Double height = Double.parseDouble(intent.getStringExtra("height"));
        Double weight = Double.parseDouble(intent.getStringExtra("weight"));

        bmi=weight/Math.pow(height/100,2);
        textComment.setText(name+"님의 BMI지수는 "+String.format("%.2f",bmi)+"(kg/m2)입니다.");
        if(bmi >= 35.0){
            textW.setText("고도 비만");

        }
        else if(bmi >= 30.0){
            textW.setText("중도 비만");
            imgV.setImageResource(R.drawable.obese);
        }
        else if(bmi >= 25.0){
            textW.setText("경도 비만");
            imgV.setImageResource(R.drawable.rover);
        }
        else if(bmi >= 23.0){
            textW.setText("과체중");
            imgV.setImageResource(R.drawable.over);
        }
        else if(bmi >= 18.5){
            textW.setText("정상");
            imgV.setImageResource(R.drawable.normal);
        }
        else{
            textW.setText("저체중");
            imgV.setImageResource(R.drawable.under);
        }
    }
}