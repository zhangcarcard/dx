package com.zk.dx.domain;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Zhangka in 2018/07/17
 */
@Entity(name = "UserDetail")
@Table(name = "t_user_detail")
@SequenceGenerator(name = "userGenerator", sequenceName = "t_user_detail_id_seq", allocationSize = 1)
public class UserDetailDO extends BaseDO {
    private String address;

    private String phoneNo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
