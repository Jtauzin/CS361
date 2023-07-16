package com.bronzeswordstudios.gymutilitykit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkoutAdapter (private val dataSet: Array<Workout>) :
    RecyclerView.Adapter<WorkoutAdapter.ViewHolder>(){
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cardTitle: TextView
        val cardWeight: TextView
        val cardReps: TextView

        init {
            // Define click listener for the ViewHolder's View
            cardTitle = view.findViewById(R.id.card_title)
            cardWeight = view.findViewById(R.id.card_weight)
            cardReps = view.findViewById(R.id.card_reps)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.weight_list_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.cardTitle.text = dataSet[position].workoutName
        viewHolder.cardReps.text = dataSet[position].workoutReps.toString()
        viewHolder.cardWeight.text = dataSet[position].workoutWeight.toString()
    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}