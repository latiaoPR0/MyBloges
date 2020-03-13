package com.zwm.pojo;

import lombok.*;

import java.util.List;
@Data
@Setter
@Getter
@AllArgsConstructor // 有参构造器
@NoArgsConstructor // 无参构造器
public class PageUtil <T>{
    private int pageIndex;  //当前页码
    private int pageSize;   //当前页显示数目
    private int pageSum;   //总页数
//    private int pageNumber;  //总条数
    private List<T> list;//每页显示的数据

}
