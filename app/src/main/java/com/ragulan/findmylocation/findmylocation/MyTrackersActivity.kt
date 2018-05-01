package com.ragulan.findmylocation.findmylocation

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MyTrackersActivity : AppCompatActivity() {
    var listOfContact = ArrayList<UserContact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_trackers)
    }

    fun dummyData() {
        listOfContact.add(UserContact("1111" , "1111"))
        listOfContact.add(UserContact("222" , "2222"))
        listOfContact.add(UserContact("333" , "3333"))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.tracker_menu , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.finishActivity -> {
                finish()
            }
            R.id.addContact     -> {
                //TODO:: Contact
            }
            else                -> {
                return super.onOptionsItemSelected(item)
            }
        }
        return true
    }

    class ContactAdapter(context: Context , var listOfContact: ArrayList<UserContact>) : BaseAdapter() {
        var context: Context? = context

        override fun getView(position: Int , convertView: View? , parent: ViewGroup?): View {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

}
