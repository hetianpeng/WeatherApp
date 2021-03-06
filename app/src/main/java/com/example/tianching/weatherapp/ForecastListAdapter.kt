package com.example.tianching.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by tianching on 2017/10/15.
 */

class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent!!.context))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textView.text = items[position]
    }

    override fun getItemCount(): Int = items?.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}