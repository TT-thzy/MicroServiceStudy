package com.thzy.openFeign.service.callback;

import com.thzy.openFeign.pojo.CommonResult;
import com.thzy.openFeign.pojo.User;
import com.thzy.openFeign.remote.UserRemoteService;
import org.springframework.stereotype.Service;

/**
 * @program: MicroServiceStudy
 * @description:
 * @author: Mr.Wang
 * @create: 2024-06-10 16:59
 **/
@Service
public class UserFallbackService implements UserRemoteService {

    @Override
    public CommonResult create(User user) {
        User defaultUser = new User();
        defaultUser.setId(-1l);
        defaultUser.setName("defaultUser");
        defaultUser.setEmail("defaultUser@gmail.com");
        defaultUser.setPhone("2134131");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User();
        defaultUser.setId(-1l);
        defaultUser.setName("defaultUser");
        defaultUser.setEmail("defaultUser@gmail.com");
        defaultUser.setPhone("2134131");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User();
        defaultUser.setId(-1l);
        defaultUser.setName("defaultUser");
        defaultUser.setEmail("defaultUser@gmail.com");
        defaultUser.setPhone("2134131");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult update(User user) {
        return new CommonResult("调用失败，服务被降级", 500);
    }

    @Override
    public CommonResult delete(Long id) {
        return new CommonResult("调用失败，服务被降级", 500);
    }
}
