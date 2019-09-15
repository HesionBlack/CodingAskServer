package cn.hesion.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Reply {
    private Long id;
    private Integer invId;
    private User user;
    private String content;
    private Date replytime;
}
