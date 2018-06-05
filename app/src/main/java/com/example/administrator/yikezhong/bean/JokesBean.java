package com.example.administrator.yikezhong.bean;

import java.util.List;

public class JokesBean {
    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"早上好","createTime":"2018-05-11T07:52:37","imgUrls":"https://www.zhaoapi.cn/images/quarter/15259963574562018-05-11_07-52-06.jpg","jid":2608,"praiseNum":null,"shareNum":null,"uid":12509,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523839244885crop_photo.jpg","nickname":"%E5%BC%A0%E9%9C%B2","praiseNum":"null"}},{"commentNum":null,"content":"楼下的你是谁","createTime":"2018-05-10T11:08:20","imgUrls":null,"jid":2607,"praiseNum":null,"shareNum":null,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1526040073381image.jpg","nickname":"肤白貌美大长腿","praiseNum":"null"}},{"commentNum":null,"content":"有美人兮，见之不忘，一日不见兮，思之如狂。","createTime":"2018-04-29T09:47:56","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524966476079IMG_PITU_20180427_163105.jpg","jid":2444,"praiseNum":null,"shareNum":null,"uid":12898,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524972479241gaga_icon.jpg","nickname":"晴天","praiseNum":"null"}},{"commentNum":null,"content":"北城别，回眸三生","createTime":"2018-04-29T09:44:12","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524966252515IMG_PITU_20180427_163706.jpg","jid":2443,"praiseNum":null,"shareNum":null,"uid":12898,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524972479241gaga_icon.jpg","nickname":"晴天","praiseNum":"null"}},{"commentNum":null,"content":"你好","createTime":"2018-04-29T09:38:52","imgUrls":null,"jid":2442,"praiseNum":null,"shareNum":null,"uid":12898,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524972479241gaga_icon.jpg","nickname":"晴天","praiseNum":"null"}},{"commentNum":null,"content":"急急急","createTime":"2018-04-29T08:51:57","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524963117808mmqrcode1524905055464.png","jid":2440,"praiseNum":null,"shareNum":null,"uid":11186,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524970642661gaga_icon.jpg","nickname":"啦啦啦","praiseNum":"null"}},{"commentNum":null,"content":"向毛爷爷致敬","createTime":"2018-04-29T08:35:57","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524962157793head_icon.jpg","jid":2439,"praiseNum":null,"shareNum":null,"uid":11186,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524970642661gaga_icon.jpg","nickname":"啦啦啦","praiseNum":"null"}},{"commentNum":null,"content":"鸡翅还吃","createTime":"2018-04-27T19:43:50","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524829430588login.png|https://www.zhaoapi.cn/images/quarter/1524829430588splash.png","jid":2384,"praiseNum":null,"shareNum":null,"uid":12882,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524901794636head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"咯rosy","createTime":"2018-04-27T17:06:12","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524819972717avatar-25-27667.jpg|https://www.zhaoapi.cn/images/quarter/1524819972733avatar-14-31491.jpg|https://www.zhaoapi.cn/images/quarter/1524819972733avatar-14-31485.jpg|https://www.zhaoapi.cn/images/quarter/1524819972733avatar-25-29151.jpg","jid":2378,"praiseNum":null,"shareNum":null,"uid":2809,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1525672979819head_icon.jpg","nickname":"孑然","praiseNum":"null"}},{"commentNum":null,"content":"咯rosy","createTime":"2018-04-27T17:06:08","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524819968842avatar-25-27667.jpg|https://www.zhaoapi.cn/images/quarter/1524819968858avatar-14-31491.jpg|https://www.zhaoapi.cn/images/quarter/1524819968858avatar-14-31485.jpg|https://www.zhaoapi.cn/images/quarter/1524819968858avatar-25-29151.jpg","jid":2377,"praiseNum":null,"shareNum":null,"uid":2809,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1525672979819head_icon.jpg","nickname":"孑然","praiseNum":"null"}}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * content : 早上好
         * createTime : 2018-05-11T07:52:37
         * imgUrls : https://www.zhaoapi.cn/images/quarter/15259963574562018-05-11_07-52-06.jpg
         * jid : 2608
         * praiseNum : null
         * shareNum : null
         * uid : 12509
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523839244885crop_photo.jpg","nickname":"%E5%BC%A0%E9%9C%B2","praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private String imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(String imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/1523839244885crop_photo.jpg
             * nickname : %E5%BC%A0%E9%9C%B2
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
            private String nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
