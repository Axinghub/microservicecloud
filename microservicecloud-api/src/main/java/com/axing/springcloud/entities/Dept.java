package com.axing.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
//黄色警告就会消失，但不推荐使用，建议加上private static final long serialVersionUID = 1L;
@SuppressWarnings("serial")

@AllArgsConstructor
@NoArgsConstructor
@Data

//如果fluent=true，那么chain默认为真。
@Accessors(chain = true)
public class Dept implements Serializable {// entity --orm--- db_table
    //推荐使用
    private static final long serialVersionUID = 1L;
    private Long deptno;// 主键
    private String dname;// 部门名称
    private  String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
