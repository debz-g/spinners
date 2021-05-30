package com.debz.spinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.debz.spinners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      /*  val customList = listOf("First","Second","Third","Fourth")
        val adapter= ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,customList)
        binding.spMonths.adapter=adapter

        This is for making a custom list.
        */

        binding.spMonths.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            /*  Object should e underlined which specifies that we need to implement the functions present in OnItemSelectedListener
    To fix that pres CTRL+I and select all the options. This will automatically create the functions for us. Remove TODO()
 */
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,
                    "You selected ${parent?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
// Unlike onClickListener(), we need to create an anonymous class for onItemSelectedListener
    }
}