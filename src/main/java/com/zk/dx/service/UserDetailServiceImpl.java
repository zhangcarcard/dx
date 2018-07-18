package com.zk.dx.service;

import com.zk.dx.domain.UserDetailDO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Zhangka in 2018/07/18
 */
@Service
@Transactional(readOnly = true)
public class UserDetailServiceImpl extends BaseServiceImpl<UserDetailDO> implements UserDetailService {
}
