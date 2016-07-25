package com.example.rshabhsharma.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ViewStubCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by rshabhsharma on 7/22/16.
 */
public class RCVadapter extends RecyclerView.Adapter<RCVadapter.ourholder>
{
    Context mcontext;
    ArrayList<Batch> batches;

    RCVadapter(Context context, ArrayList<Batch> batches)
    {
        this.mcontext = context;
        this.batches = batches;
    }

    public class ourholder extends RecyclerView.ViewHolder
    {
        TextView t1;
        TextView t2;
        Button b1;
        public ourholder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.name);
            t2 = (TextView) itemView.findViewById(R.id.strenght);
            b1 = (Button) itemView.findViewById(R.id.button);
        }
    }
    @Override
    public ourholder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.row,parent,false);
        return new ourholder(v);
    }
    @Override
    public void onBindViewHolder(ourholder holder, int position)
    {
        Batch b = batches.get(position);
        holder.t1.setText(b.name);
        holder.t2.setText(b.strenght);
        holder.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
    @Override
    public int getItemCount() {
        return batches.size();
    }
}
