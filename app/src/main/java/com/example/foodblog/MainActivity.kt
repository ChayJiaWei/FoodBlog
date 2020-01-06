package com.example.foodblog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            movetoEvent();
        }
        imageButton.setOnClickListener(){
            movetoProfile();
        }
        button2.setOnClickListener(){
            movetoReview();
        }
        imageButton2.setOnClickListener(){
            movetoHome();
        }

        }

        private fun movetoEvent(){
            Intent1 intent = new Intent1(this, Event.class);
            startActivity(intent);
        }
    private fun movetoProfile(){
        Intent1 intent = new Intent1(this,Profile.class);
        startActivity(intent);
    }
    private fun movetoReview(){
        Intent1 intent = new Intent1(this,Review.class);
        startActivity(intent);
    }
    private fun movetoHome(){
        Intent1 intent = new Intent1(this,MainActivity.class);
        startActivity(intent);
    }


    }
}
