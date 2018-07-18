package com.zk.dx.domain;

import javax.persistence.*;

/**
 * Created by Zhangka in 2018/07/16
 */
@Entity(name = "User")
@Table(name = "t_user", uniqueConstraints = @UniqueConstraint(name = "uk_t_user_username", columnNames = "username"))
@SequenceGenerator(name = "userGenerator", sequenceName = "t_user_id_seq", allocationSize = 1)
public class UserDO extends BaseDO {

    private String username;

    private Integer age;

    private String idCard;

/*
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "t_attribute", joinColumns = @JoinColumn(name = "uid"))
    @Column(name = "value")
    @MapKeyColumn(name = "key")
    private Map<String, String> attributes;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "detail_id")
    private UserDetailDO userDetail;
*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    /*
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public UserDetailDO getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetailDO userDetail) {
        this.userDetail = userDetail;
    }*/
}
