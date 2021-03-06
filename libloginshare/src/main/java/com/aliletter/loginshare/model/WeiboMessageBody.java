package com.aliletter.loginshare.model;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Author：alilettter
 * Github: http://github.com/aliletter
 * Email: 4884280@qq.com
 * data: 2017/12/11
 */

public class WeiboMessageBody {
    public static final int WEIBO = 0;
    public static final int WEIBO_STORY = -1;
    public static final int MSG_TEXT_IAMGE = 1;
    public static final int MSG_VIDEO = 2;
    public static final int MSG_WEB = 3;
    public Integer type;
    public Integer msgType;


    private String text;
    private String actionUrl;
    private String title;
    private String image;
    private String description;
    private ArrayList<Uri> imagesPath;
    private String videoPath;

    public String getActionUrl() {
        return actionUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<Uri> getImagesPath() {
        return imagesPath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public String getDescription() {
        return description;
    }

    public WeiboMessageBody text(String text) {
        this.text = text;
        return this;
    }

    public WeiboMessageBody description(String description) {
        this.description = description;
        return this;
    }

    public WeiboMessageBody actionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
        return this;
    }

    public WeiboMessageBody title(String title) {
        this.title = title;
        return this;
    }

    public WeiboMessageBody type(int type) {
        this.type = type;
        return this;
    }

    public WeiboMessageBody msgType(int msgType) {
        this.msgType = msgType;
        return this;
    }

    public WeiboMessageBody image(String image) {
        this.image = image;
        return this;
    }

    public WeiboMessageBody imagesPath(ArrayList<Uri> text) {
        this.imagesPath = imagesPath;
        return this;
    }

    public WeiboMessageBody videoPath(String videoPath) {
        this.videoPath = videoPath;
        return this;
    }

    public WeiboMessageBody build() {
        if (msgType == null | type == null) {
            try {
                throw new Exception("WeiboMessageBody build error !");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (type == WEIBO) {
            if (msgType == MSG_TEXT_IAMGE && text == null && image == null && imagesPath == null) {
                try {
                    throw new Exception("WeiboMessageBody build error !");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (msgType == MSG_VIDEO) {
                if (videoPath == null) {
                    try {
                        throw new Exception("WeiboMessageBody build error !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else if (msgType == MSG_WEB) {
                if (actionUrl == null | title == null | image == null | description == null) {
                    if (videoPath == null) {
                        try {
                            throw new Exception("WeiboMessageBody build error !");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        } else {
            if (msgType == MSG_VIDEO) {
                if (videoPath == null) {
                    try {
                        throw new Exception("WeiboMessageBody build error !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                if (image == null) {
                    try {
                        throw new Exception("WeiboMessageBody build error !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (text != null) {
            if (actionUrl == null | title == null) {
                try {
                    throw new Exception("WeiboMessageBody build error !");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return this;
    }

}
