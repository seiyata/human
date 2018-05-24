package jp.techacademy.tajikara.seiya.human;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("大谷", 23, "野球");
        human.say();
        human.think();
    }
}
