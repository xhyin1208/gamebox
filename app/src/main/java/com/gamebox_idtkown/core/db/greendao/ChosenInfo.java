package com.gamebox_idtkown.core.db.greendao;

import com.alibaba.fastjson.annotation.JSONField;

import org.greenrobot.greendao.annotation.*;

import java.io.Serializable;
import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.
/**
 * Entity mapped to table "CHOSEN_INFO".
 */
@Entity
public class ChosenInfo  implements Serializable {
    public static final long serialVersionUID = 0x1001;

    @Id
    private Long id;
    @JSONField(name = "id")
    private String tid;
    private String name;
    private String img;
    private String desp;

    @JSONField(name = "_list")
    public List<GameInfo> gameInfos;

    @Generated
    public ChosenInfo() {
    }

    public ChosenInfo(Long id) {
        this.id = id;
    }

    @Generated
    public ChosenInfo(Long id, String tid, String name, String img, String desp) {
        this.id = id;
        this.tid = tid;
        this.name = name;
        this.img = img;
        this.desp = desp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

}
