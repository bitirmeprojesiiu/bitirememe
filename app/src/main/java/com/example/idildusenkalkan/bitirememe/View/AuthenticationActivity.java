package com.example.idildusenkalkan.bitirememe.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.idildusenkalkan.bitirememe.R;

import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticationActivity extends AppCompatActivity {

    JSONObject json= new JSONObject();
    //bu iki değişkeni test için yazmıştım json verisi alıp parçalanarak bunlar yerine kullanılacak
    private static int id =1;
    String passformdb="a";
    //kullanıcı id ve mail ile gelen şifre
    String pass = json.getJSONObject("userInfo").getString("pass");
    Integer iid = json.getJSONObject("userInfo").getInt("id");
    boolean clickedToStartButton=false;

    public AuthenticationActivity() throws JSONException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        EditText editTextid = (EditText) findViewById(R.id.editText);
        final String idfromuser =  editTextid.getText().toString();


        final Button exit = (Button) findViewById(R.id.button4);
        final Button start = (Button) findViewById(R.id.button3);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }

        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickedToStartButton=true;
                int idfromu = Integer.parseInt(idfromuser);
                checkID(idfromu);
            }

        });




    }

   public void startToExam (){
       final Intent intent = new Intent(getBaseContext(), StartExamActivity.class);
       startActivity(intent);
   }

   public void checkID(int idfromu){

       String idfromuser = Integer.toString(idfromu);

       if(idfromuser.equals(id)){
           checkPassword(passformdb);
       }

       else{
           Toast.makeText(getApplicationContext(),"ID HATALI!",Toast.LENGTH_LONG).show();
       }
    }

    public void checkPassword(String passfromdb){
        EditText editTextpass = (EditText) findViewById(R.id.editText2);
        String pass = editTextpass.getText().toString();

        if (passfromdb.equals(pass)){

            if(clickedToStartButton==true){
                startToExam();
            }

        }
        else{
            Toast.makeText(getApplicationContext(),"ŞİFRE HATALI!",Toast.LENGTH_LONG).show();
        }
    }



}
