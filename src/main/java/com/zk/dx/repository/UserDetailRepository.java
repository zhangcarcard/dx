package com.zk.dx.repository;

import com.zk.dx.domain.UserDetailDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Zhangka in 2018/07/18
 */
public interface UserDetailRepository extends JpaRepository<UserDetailDO, Long> {
}
