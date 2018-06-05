package com.example.administrator.yikezhong.home.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import io.reactivex.annotations.NonNull;

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<JokesBean.DataBean> data;
    private Context context;
    private final LayoutInflater inflater;

    public RvAdapter(List<JokesBean.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        JokesBean.DataBean dataBean = data.get(position);
         viewHolder.img01.setImageURI(dataBean.getUser().getIcon());
      viewHolder.text01.setText(dataBean.getUser().getNickname());
       viewHolder.text02.setText(dataBean.getCreateTime());
        viewHolder.text03.setText(dataBean.getUser().getNickname());
        String url = dataBean.getVideoUrl();
        if(url!=null) {
            viewHolder.video.setVideoURI(Uri.parse(url));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

     private final TextView text01;
      private final TextView text02;
      private final TextView text03;
       private final SimpleDraweeView img01;
        private final VideoView video;

        public ViewHolder(View itemView) {
            super(itemView);
            text01 = itemView.findViewById(R.id.text01);
            text02 = itemView.findViewById(R.id.text02);
            text03 = itemView.findViewById(R.id.text03);
           img01 = itemView.findViewById(R.id.img01);
            video = itemView.findViewById(R.id.video);

        }
    }
}
