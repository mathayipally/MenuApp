package com.example.myicetask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    // variables declarations for functional attributes placed below the welcome message
    lateinit var editText: EditText
    lateinit var btn_view: Button
    lateinit var btn_clear: Button
    lateinit var TextMenu: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //attributes and their ID's
        editText = findViewById(R.id.editText)
        btn_view = findViewById(R.id.btnview)
        btn_clear = findViewById(R.id.btnclear)
        TextMenu = findViewById(R.id.textMenu)

        //input text is cleared when reset button is clicked
        btn_clear.setOnClickListener {

            editText.text.clear()

            //meal suggestion text appears on text view when button suggest is clicked
            btn_view.setOnClickListener {

                val allowedTimes = listOf("Morning", "Mid-morning", "Afternoon", "Mid-afternoon", "Dinner")
                val value1: String = editText.text.toString()
                val input = value1.toString()
                if (value1.isEmpty()) {


                    //error message appears when the user's input is invalid
                    Toast.makeText(
                        applicationContext,
                        "Invalid entry.Please type time of the day,eg.Morning,Mid-morning,Afternoon,Mid-afternoon" +
                                " or Dinner!",
                        Toast.LENGTH_LONG
                    ).show()


                    //user's input text for time of the day
                } else if (input == "Morning") {
                    val menu_choice =
                        "Breakfast Menu:" +
                                "Sunnyside eggs,cheese griller, mushrooms, chips and toast with caffe latte"
                    TextMenu.setText(menu_choice)


                } else if (input == "Mid-morning") {
                    val menu_choice =
                        "Light snack menu:" +
                                "Fully nutritious packed green and berries smoothie and non salted almonds "
                    TextMenu.setText(menu_choice)


                } else if (input == "Afternoon") {
                    val lunch_menu =
                        "Lunch Menu:" +
                                "Grilled sermon with green peas puree and greek salad with a glass of apple juice"
                    TextMenu.setText(lunch_menu)


                } else if (input == "Mid-afternoon") {
                    val menu_choice =
                        "Mid-afternoon snack Menu:" +
                                "High protein chocolate and peanut butter brownies with a cup of warm milk "
                    TextMenu.setText(menu_choice)


                } else if (input == "Dinner") {
                    val menu_choice: String =
                        "Maincourse Menu:" +
                                "Garlic butter rib eye steak served with crispy potatoes and kale salad "
                    TextMenu.setText(menu_choice)


                    //error message displayed on screen when the user's input is incorrect or contains charrecters

                    }


                }
            }

        }
    }

















