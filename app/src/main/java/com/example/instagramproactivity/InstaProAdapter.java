package com.example.instagramproactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class InstaProAdapter extends RecyclerView.Adapter<InstaProAdapter.MyViewHolder> {
    ArrayList<UserModelClass> data;
    StoryInterface storyInterface;
    Context context;


    public InstaProAdapter(ArrayList<UserModelClass> data, StoryInterface storyInterface) {
        this.data = data;
        this.storyInterface = storyInterface;

    }

    @NonNull
    @Override
    public InstaProAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.storyitem, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull InstaProAdapter.MyViewHolder holder, int position) {
        holder.cirstoryimg.setImageResource(data.get(position).getProfileimage());
        holder.txtstory.setText(data.get(position).getProfilename());

        holder.louthorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyInterface.onclick(data.get(position).getProfileimage(), data.get(position).getProfilename(), data.get(position).getProfilebigimg());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView cirstoryimg;
        TextView txtstory;


        LinearLayout louthorizontal;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cirstoryimg = itemView.findViewById(R.id.cirstoryimg);
            txtstory = itemView.findViewById(R.id.txtstory);
            louthorizontal = itemView.findViewById(R.id.louthorizontal);
        }
    }


}
