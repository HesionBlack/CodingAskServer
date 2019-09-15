package cn.hesion.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Invitation {
    private String id;
    private String title;
    private String content;
    private String imgurl;
    private Date releasetime;
    private String author;
}
