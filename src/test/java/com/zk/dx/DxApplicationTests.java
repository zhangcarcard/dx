package com.zk.dx;

import com.alibaba.fastjson.JSON;
import com.zk.dx.domain.UserDO;
import com.zk.dx.domain.UserDetailDO;
import com.zk.dx.repository.UserDetailRepository;
import com.zk.dx.service.UserDetailService;
import com.zk.dx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DxApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        /*for (int i = 0; i < 50; ++i) {
            UserDO user = new UserDO();
            user.setAge(18);
            user.setUsername("zhangka");

            Map<String, String> attribute = new HashMap<>();
            attribute.put("k1", "v1");
            attribute.put("k2", "v2");
            user.setAttributes(attribute);

            UserDetailDO userDetail = new UserDetailDO();
            userDetail.setAddress("杭州市");
            userDetail.setPhoneNo("15088668720");
            user.setUserDetail(userDetail);
            userRepository.save(user);
        }*/

//        List<UserDO> users = userRepository.findByUsername("zhangka");
//        UserDO u = userRepository.findByAttributes("k2");
//        System.out.println(JSON.toJSONString(users));

        /*UserDetailDO userDetail = new UserDetailDO();
        userDetail.setId(1);
        System.out.println(JSON.toJSONString(userRepository.findByUserDetail(userDetail)));
        */

        /*List<UserDO> users = userRepository.findByUsernameContainingIgnoreCase("hangk");
        System.out.println(JSON.toJSONString(users));*/
        /*users = userRepository.findByUsernameContainingOrderByAgeDesc("hangk");
        System.out.println(JSON.toJSONString(users));*/
/*
        users = userRepository.findByUsernameContainingOrderByAgeDesc("zhangka");
        System.out.println(JSON.toJSONString(users));
        users = userRepository.findByUsernameIsContainingOrderByAgeDesc("zhangka");
        System.out.println(JSON.toJSONString(users));*/
//        System.out.println(userRepository.findByUsernameContainingIgnoreCase("zhangka"));
/*
        UserDO user = new UserDO();
        user.setUsername("zhangka");
        user.setAge(17);
        Pageable page = PageRequest.of(1, 5, Sort.Direction.DESC, "age");
        Example<UserDO> example = Example.of(user);
        Page<UserDO> users = userService.findAll(example, page);
        System.out.println(JSON.toJSONString(users));
        */
        /*System.out.println(JSON.toJSONString(userService.findAll()));
        System.out.println("====================================");
        System.out.println(JSON.toJSONString(userService.getOne(5)));
        System.out.println("====================================");*/
        UserDO user = new UserDO();
        user.setUsername("zhangka");
        user.setAge(18);
        user.setIdCard("6479889987879");
        userService.save(user);

        UserDO dto = new UserDO();
        dto.setUsername("zhangka");
        List<UserDO> list = userService.findAll(Example.of(dto));
        System.out.println(JSON.toJSONString(list));
        System.out.println("====================================");

        UserDetailDO userDetail = new UserDetailDO();
        userDetail.setAddress("浙江省杭州市");
        userDetail.setPhoneNo("15088668720");
        userDetailService.save(userDetail);
        System.out.println(JSON.toJSONString(userDetailService.findById(1L)));
    }

    @Autowired
    private UserDetailService userDetailService;
}
