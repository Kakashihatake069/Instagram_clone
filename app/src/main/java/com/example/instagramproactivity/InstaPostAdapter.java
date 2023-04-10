package com.example.instagramproactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InstaPostAdapter extends RecyclerView.Adapter<InstaPostAdapter.Viewholder> {
    ArrayList<PostModelClass> postdata;
    Context context;

    PostInterface postInterface;

    public InstaPostAdapter(ArrayList<PostModelClass> postdata,PostInterface postInterface) {
        this.postdata = postdata;
        this.postInterface=postInterface;

    }

    @NonNull
    @Override
    public InstaPostAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postitem,parent,false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull InstaPostAdapter.Viewholder holder, int position) {
        holder.postimg.setImageResource(postdata.get(position).getPostaccimg());
        holder.txtpostname.setText(postdata.get(position).getPostname());
        holder.imgpostphoto.setImageResource(postdata.get(position).getPostimg());
        holder.txtdetails.setText(postdata.get(position).getDetails());
        holder.txtdispostnametwo.setText(postdata.get(position).getPostnameTwo());

        holder.loutvertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postInterface.clickedon(postdata.get(position).getPostaccimg(),postdata.get(position).getPostname(),postdata.get(position).getPostimg(),postdata.get(position).getDetails(),postdata.get(position).getPostnameTwo());
            }
        });
    }

    @Override
    public int getItemCount() {
        return postdata.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView postimg;
        TextView txtpostname;
        ImageView imgpostphoto;
        LinearLayout loutvertical;
        TextView txtdetails;
        TextView txtdispostnametwo;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            postimg = itemView.findViewById(R.id.postimg);
            txtpostname = itemView.findViewById(R.id.txtpostname);
            imgpostphoto = itemView.findViewById(R.id.imgpostphoto);
            loutvertical = itemView.findViewById(R.id.loutvertical);
            txtdetails = itemView.findViewById(R.id.txtdetails);
            txtdispostnametwo = itemView.findViewById(R.id.txtdispostnametwo);
        }
    }
}
