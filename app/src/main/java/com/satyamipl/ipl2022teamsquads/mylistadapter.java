package com.satyamipl.ipl2022teamsquads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


    public class mylistadapter extends RecyclerView.Adapter<mylistadapter.ViewHolder> {

        private hadingg[] localDataSet;
        private TextView textView3;
        private TextView textView4;
        private TextView textView5;


        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        public static class ViewHolder extends RecyclerView.ViewHolder {
            private final TextView textView3,textView4,textView5;
            private TextView textView;

            public ViewHolder(View view) {
                super(view);
                // Define click listener for the ViewHolder's View

                textView3 = (TextView) view.findViewById(R.id.textView3);
                textView4 = (TextView) view.findViewById(R.id.textView4);
                textView5 = (TextView) view.findViewById(R.id.textView5);
            }

            public TextView getTextView() {
                return textView;
            }
        }

        // Step 1: Initialize the dataset of the Adapter.

        public mylistadapter(hadingg[] dataSet) {
            localDataSet = dataSet;
        }

        // Step 2: Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.hadding_layout, viewGroup, false);
            textView3 = view.findViewById(R.id.textView3);
            textView4 = view.findViewById(R.id.textView4);
            textView5 = view.findViewById(R.id.textView5);
            return new ViewHolder(view);
        }




        // Step 3: Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
//        textView.setText(localDataSet[position].name);
//        textView2.setText(localDataSet[position].phoneno);
            viewHolder.textView3.setText(localDataSet[position].role);
            viewHolder.textView4.setText(localDataSet[position].name);
            viewHolder.textView5.setText(localDataSet[position].role);

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return localDataSet.length;
        }
    }
