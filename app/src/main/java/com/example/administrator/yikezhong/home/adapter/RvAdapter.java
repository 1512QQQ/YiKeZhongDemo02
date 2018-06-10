package com.example.administrator.yikezhong.home.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
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
        final ViewHolder viewHolder = (ViewHolder) holder;
        JokesBean.DataBean dataBean = data.get(position);
         viewHolder.img01.setImageURI(dataBean.getUser().getIcon());
      viewHolder.text01.setText(dataBean.getUser().getNickname());
       viewHolder.text02.setText(dataBean.getCreateTime());
        viewHolder.text03.setText(dataBean.getUser().getNickname());



        viewHolder.jcVideoPlayerStandard.setUp("http://jzvd.nathen.cn/c6e3dc12a1154626b3476d9bf3bd7266/6b56c5f0dc31428083757a45764763b0-5287d2089db37e62345123a1be272f8b.mp4"
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "嫂子闭眼睛");
        Glide.with(context).load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                .into(viewHolder.jcVideoPlayerStandard.thumbImageView);
        viewHolder.jcVideoPlayerStandard.setTag(1);
        viewHolder.jcVideoPlayerStandard.thumbImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int) viewHolder.jcVideoPlayerStandard.getTag();
                if (tag==1){
                viewHolder.tu1.setVisibility(View.VISIBLE);
                viewHolder.tu2.setVisibility(View.VISIBLE);
                viewHolder.tu3.setVisibility(View.VISIBLE);
                viewHolder.tu4.setVisibility(View.VISIBLE);
                    viewHolder.jcVideoPlayerStandard.setTag(2);
                }else {
                    viewHolder.tu1.setVisibility(View.GONE);
                    viewHolder.tu2.setVisibility(View.GONE);
                    viewHolder.tu3.setVisibility(View.GONE);
                    viewHolder.tu4.setVisibility(View.GONE);
                    viewHolder.jcVideoPlayerStandard.setTag(1);


                }
            }
        });
        viewHolder.tu1.setTag(1);
        viewHolder.tu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag1 = (int) viewHolder.tu1.getTag();
                if (tag1==1) {
                    viewHolder.tu1.setBackgroundResource(R.drawable.t1);
                    viewHolder.tu1.setTag(2);
                }else {
                    viewHolder.tu1.setBackgroundResource(R.drawable.xin);
                    viewHolder.tu1.setTag(1);
                }
            }
        });
        viewHolder.tu2.setTag(1);
        viewHolder.tu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag2 = (int) viewHolder.tu2.getTag();
                if (tag2==1) {
                    viewHolder.tu2.setBackgroundResource(R.drawable.raw_1499947358);
                    viewHolder.tu2.setTag(2);
                }else {
                    viewHolder.tu2.setBackgroundResource(R.drawable.raw_1500083878);
                    viewHolder.tu2.setTag(1);
                }
            }
        });




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
        private final JCVideoPlayerStandard jcVideoPlayerStandard;
        private final ImageView tu1;
        private final ImageView tu2;
        private final ImageView tu3;
        private final ImageView tu4;


        public ViewHolder(View itemView) {
            super(itemView);
            text01 = itemView.findViewById(R.id.text01);
            text02 = itemView.findViewById(R.id.text02);
            text03 = itemView.findViewById(R.id.text03);
           img01 = itemView.findViewById(R.id.img01);
           jcVideoPlayerStandard = (JCVideoPlayerStandard) itemView.findViewById(R.id.videoplayer);
            tu1 = itemView.findViewById(R.id.tu1);
           tu2 = itemView.findViewById(R.id.tu2);
            tu3 = itemView.findViewById(R.id.tu3);
            tu4 = itemView.findViewById(R.id.tu4);


        }
    }
}
