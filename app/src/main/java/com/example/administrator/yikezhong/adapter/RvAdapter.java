package com.example.administrator.yikezhong.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
//        viewHolder.ivimg.setImageURI(dataBean.getImgUrls());
//        //  viewHolder.img.setImageURI(dataBean.getImgUrls());
//
//        viewHolder.tvname.setText(dataBean.getUser().getNickname());
//        viewHolder.tvtime.setText(dataBean.getCreateTime());
//        viewHolder.tvtitle.setText(dataBean.getContent());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

//        private final TextView tvname;
//        private final TextView tvtime;
//        private final TextView tvtitle;
//        private final SimpleDraweeView ivimg;

        public ViewHolder(View itemView) {
            super(itemView);
//            tvname = itemView.findViewById(R.id.tvname);
//            tvtime = itemView.findViewById(R.id.tvtime);
//            tvtitle = itemView.findViewById(R.id.tvtitle);
//            ivimg = itemView.findViewById(R.id.ivimg);

        }
    }
}
