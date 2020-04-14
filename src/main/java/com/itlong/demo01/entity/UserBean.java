package com.itlong.demo01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户bean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean implements Serializable {
    private String userName;
    private Integer age;
    private String gender;
    private String address;
}

