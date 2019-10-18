package beemo.a99cardcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score;
        score=0;
        tv1.setText(String.valueOf(score));
        //return score;
    }
    public void ace(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+1;
            tv1.setText(String.valueOf(score));
        }
       else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void two(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+2;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void three(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+3;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void four(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
            Toast.makeText(this, "Skipped!",Toast.LENGTH_SHORT).show();
        }

    public void five(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+5;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void six(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+6;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void seven(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+7;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void eight(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+8;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void nine(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
            Toast.makeText(this, "REVERSED!",Toast.LENGTH_SHORT).show();
        }

    public void ten(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98&&score>=0){
            score = score-10;
            tv1.setText(String.valueOf(score));
        }
        else if(score < 0){
            score=0;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void jack(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+10;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }

    }

    public void queen(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = score+10;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }

    public void king(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        if(score <=98){
            score = 99;
            tv1.setText(String.valueOf(score));
        }
        else{
            Toast.makeText(this, "YOU LOSE!",Toast.LENGTH_SHORT).show();
        }
    }
    public void reset(View v){
        TextView tv1 = (TextView)findViewById(R.id.textView);
        int score = Integer.valueOf(tv1.getText().toString());
        score=0;
        tv1.setText(String.valueOf(score));
    }

}
