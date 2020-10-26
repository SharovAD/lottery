package com.example.my_proga1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startLotery(View view)
    {
        TextView resultN1=findViewById(R.id.result_n_1);
        TextView resultN2=findViewById(R.id.result_n_2);
        TextView resultN3=findViewById(R.id.result_n_3);

        TextView InputN1=findViewById(R.id.editTextNumber1);
        TextView InputN2=findViewById(R.id.editTextNumber2);
        TextView InputN3=findViewById(R.id.editTextNumber3);
        SecureRandom rnd=new SecureRandom();
        resultN1.setText(""+(1+rnd.nextInt(12)));
        resultN2.setText(""+(1+rnd.nextInt(12)));
        resultN3.setText(""+(1+rnd.nextInt(12)));

        Integer res1=Integer.parseInt(resultN1.getText().toString());
        Integer res2=Integer.parseInt(resultN2.getText().toString());
        Integer res3=Integer.parseInt(resultN3.getText().toString());
        Integer inp1=Integer.parseInt(InputN1.getText().toString());
        Integer inp2=Integer.parseInt(InputN2.getText().toString());
        Integer inp3=Integer.parseInt(InputN3.getText().toString());

        if (inp1==res1 | inp2==res2 | inp3==res3) {
            TextView summa=findViewById(R.id.Summa1);
            summa.setText("Выйгрыш 10 монет");
    }else if ((inp1==res1 & inp2==res2) |(inp1==res1 & inp3==res3) | (inp2==res2 & inp3==res3)){
            TextView summa=findViewById(R.id.Summa1);
            summa.setText("Выйгрыш 100 монет");
        }else if (inp1==res1 & inp2==res2 & inp3==res3){
            TextView summa=findViewById(R.id.Summa1);
            summa.setText("Выйгрыш 1000 монет");
        }else {
            TextView summa=findViewById(R.id.Summa1);
            summa.setText("Вы проиграли");
        }
    }
    public void showInfo(View view)
   {
      Intent intent= new Intent(this,MainActivity2.class);
      startActivity(intent);
    }
}