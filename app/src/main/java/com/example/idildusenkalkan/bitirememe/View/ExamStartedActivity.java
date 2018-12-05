package com.example.idildusenkalkan.bitirememe.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.idildusenkalkan.bitirememe.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExamStartedActivity extends AppCompatActivity{

    TextView question;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    Button next;
    Button back;
    String [] questions;
    String [] answers;

    JSONObject json= new JSONObject();
    Integer numberOfQuestions = json.getJSONObject("exam").getInt("numberOfQuestions");

    //  String questions = json.getJSONObject("exam").getString("question");
  //  String answers =json.getJSONObject("exam").getString("answers");
  //  String trueAnswer = json.getJSONObject("exam").getString("trueAnswer");

    int temp=0;

    public ExamStartedActivity() throws JSONException {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_started);

      question = (TextView)findViewById(R.id.Question);
      answer1 = (RadioButton) findViewById(R.id.Answer1);
      answer2 = (RadioButton) findViewById(R.id.Answer2);
      answer3 = (RadioButton) findViewById(R.id.Answer3);
      answer4 = (RadioButton) findViewById(R.id.Answer4);
      next =(Button) findViewById(R.id.btnnextquest);
      back =(Button) findViewById(R.id.btnbackquest);

        gettingInfos();


    }

    public void gettingInfos(){
        try{

            JSONArray jsonArray = new JSONArray();
            JSONObject json= (JSONObject)jsonArray.getJSONObject(0);

            JSONArray js = json.getJSONArray("questions");
            for (int i=0; i<numberOfQuestions; i++){
                questions[i] =js.getString(i);
               // Log.i("..........",""+question);
            }

            //BURAYA TEKRAR BAKILMASI GEREKİYOR ŞIKLARI FARKLI YERLERE KOYMADIM BU ŞEKİLDE OLMAZ
            JSONArray jsa = json.getJSONArray("answers");
            for (int i=0; i<numberOfQuestions; i++){
                answers[i] =js.getString(i);
                // Log.i("..........",""+question);
            }

        }
        catch(Exception e){

            e.printStackTrace();
        }
    }

    public void nextPressed (View view){

        //next butonuna basıldığında bir sonraki soruya geçecek
        if(temp < (numberOfQuestions-1)){
        temp++;
        question.setText(questions[temp]);}
        else
            next =(Button) findViewById(R.id.btnnextquest);
            next.setVisibility(View.GONE);
    }

    public void backPressed (View view){

        //back butonuna basıldığında bir önceki soruya gidecek
        if(temp>0){
        temp--;
        question.setText(questions[temp]);}
        else
            back =(Button) findViewById(R.id.btnbackquest);
            back.setVisibility(View.GONE);
    }
}
