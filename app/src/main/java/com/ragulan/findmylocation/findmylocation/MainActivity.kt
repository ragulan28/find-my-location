package com.ragulan.findmylocation.findmylocation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userData = UserData(this)
      userData.loadPhoneNumber()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId){
            R.id.addTracker->{
                val intent=Intent(this,MyTrackersActivity::class.java)
                startActivity(intent)
            }
            R.id.help->{
                //TODO:: help
            }
            else->{
                return super.onOptionsItemSelected(item)
            }
        }
        return true
    }
}
