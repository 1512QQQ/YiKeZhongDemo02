package com.example.administrator.yikezhong.my.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.example.administrator.yikezhong.bean.VideosBean;
import com.example.administrator.yikezhong.my.VideoActivity;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import io.reactivex.annotations.NonNull;

public class VideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<VideosBean.DataBean> data;
    private Context context;
    private final LayoutInflater inflater;

    public VideoAdapter(List<VideosBean.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }





    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.video1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        final VideosBean.DataBean dataBean = data.get(position);
        Glide.with(context).load(dataBean.getCover()).into(viewHolder.img01);
        viewHolder.img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, VideoActivity.class);
                intent.putExtra("dizhi",dataBean.getVideoUrl());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{


       private final ImageView img01;

        public ViewHolder(View itemView) {
            super(itemView);

           img01 = itemView.findViewById(R.id.img01);


        }
    }
}
