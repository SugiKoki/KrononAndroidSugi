package com.example.sgapp.ui.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.sgapp.CalendarAdapter
import com.example.sgapp.R


class CalendarFragment : Fragment() {

    private lateinit var homeViewModel: CalendarViewModel
    private var titleText: TextView? = null
    private var prevButton: Button? = null
    private  var nextButton: Button? = null
    private var mCalendarAdapter: CalendarAdapter? = null
    private var calendarGridView: GridView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(CalendarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calendar, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        prevButton!!.setOnClickListener {
            mCalendarAdapter!!.prevMonth()
            titleText!!.text = mCalendarAdapter!!.title
        }
        nextButton!!.setOnClickListener {
            mCalendarAdapter!!.nextMonth()
            titleText!!.text = mCalendarAdapter!!.title
        }
        calendarGridView?.setAdapter(mCalendarAdapter);
        titleText!!.text = mCalendarAdapter!!.title

    }

}