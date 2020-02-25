package com.example.android_seminar_8_2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Suntagi> suntages;

    public UserAdapter(Context context, ArrayList<Suntagi> suntages) {
        this.context = context;
        this.suntages = suntages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.suntagi_item , parent , false);
        MyViewHolder item = new MyViewHolder(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,final int position) {
        ((MyViewHolder)holder).textView_onoma.setText(suntages.get(position).getOnoma());
        ((MyViewHolder)holder).textView_perilipsi.setText(suntages.get(position).getPerilipsi());
        ((MyViewHolder)holder).textView_id.setText(String.valueOf(suntages.get(position).getId()));
        ((MyViewHolder)holder).imageView.setImageResource(suntages.get(position).getId());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = v.findViewById(R.id.textView_id);
                Log.d("CLICK_ITEM", textView.getText().toString());
                Intent intent = new Intent(context, SecondActivity.class);

                intent.putExtra("user_id", suntages.get(position).getId());

                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return this.suntages.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView_onoma;
        TextView textView_perilipsi;
        TextView textView_id;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView_id = itemView.findViewById(R.id.textView_id);
            textView_onoma = itemView.findViewById(R.id.textView_onoma);
            textView_perilipsi = itemView.findViewById(R.id.textView_perilipsi);
        }
    }
}
