package com.zwm.pojo;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//用户实体类
@Data
@Setter
@Getter
@AllArgsConstructor // 有参构造器
@NoArgsConstructor // 无参构造器
public class index_countent {
    private int t_id; // id
    private String t_author; // 作者
    private String t_title; // 标题
    private String t_subhead; // 副标题
    private String t_type; // 类型
    private String t_img; // 图片
    private String t_gotohtml;//要到的html
    private String t_imgportrait;//头像图片
    private Date t_date; // 时间
}
