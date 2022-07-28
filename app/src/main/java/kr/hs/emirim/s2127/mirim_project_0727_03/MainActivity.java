package kr.hs.emirim.s2127.mirim_project_0727_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText name, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn_result);
        name=findViewById(R.id.edit_name);
        height = findViewById(R.id.edit_height);
        weight = findViewById(R.id.edit_weight);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                //String result = "1";
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("height",height.getText().toString());
                intent.putExtra("weight",weight.getText().toString());
                startActivity(intent);
            }
        });
    }
}