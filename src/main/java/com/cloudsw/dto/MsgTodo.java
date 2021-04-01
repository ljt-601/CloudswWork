package com.cloudsw.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Repository
@Table(name = "msg_todo")//mybatis通用接口mapper依赖JPA实体类采用JPA

public class MsgTodo implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="sys_code")
    private String sysCode;

    @Column(name="sys_name")
    private String sysName;

    @Column(name="msg_id")
    private String msgId;

    @Column(name="pc_url")
    private String pcUrl;

    @Column(name="app_url")
    private String appUrl;

    @Column(name="is_read")
    private Integer isRead;

    @Column(name="is_del")
    private Integer isDel;

    @Column(name="receive_code")
    private String receiveCode;

    @Column(name="receive_name")
    private String receiveName;

    @Column(name="receive_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date receiveTime;

    @Column(name="create_code")
    private String createCode;

    @Column(name="create_name")
    private String createName;

    @Column(name="create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Column(name="handle_code")
    private String handleCode;

    @Column(name="handle_name")
    private String handleName;

    @Column(name="handle_time")
    private Date handleTime;

    @Column(name="msg_type")
    private String msgType;

    /**
     * 消息内容
     */
    @Column(name="content")
    private String content;


    /**
     * 消息发送渠道（0所有渠道 1手机短信 2企业微信）
     */
    @Column(name="send_type")
    private Integer sendType;

}