package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var text1 = findViewById<EditText>(R.id.text1)
        var text2 = findViewById<EditText>(R.id.text2)
        var carnum = findViewById<EditText>(R.id.carnum)
        var personid = findViewById<EditText>(R.id.personid)
        var mobilenum = findViewById<EditText>(R.id.mobilenum)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {

            var text1ok=charchek(text1)&&text1.text.toString().length==2
            var text2ok=charchek(text2)&&text2.text.toString().length==2
            var cannumok=carnum.text.toString().isDigitsOnly()&&carnum.text.toString().length==3
            var personidok=personid.text.toString().isDigitsOnly()&&personid.text.toString().length==11
            var mobilenumok=mobilenum.text.toString().isDigitsOnly()&&mobilenum.text.toString().length==9&&mobilenum.text.substring(0,3)=="598"

            if (text1ok&&text2ok&&cannumok&&personidok&&mobilenumok){
                Toast.makeText(this, "what color is your bugatti", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "you aint topG", Toast.LENGTH_SHORT).show()
            }


        }
    }


    fun charchek(editText: EditText):Boolean {
        var state = true
        for (i in editText.text.toString()) {
            if (!i.isLetter()){
                state=false

            }
        }
        return state


    }
}

