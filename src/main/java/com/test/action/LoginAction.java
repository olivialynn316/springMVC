package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import com.test.domain.UserDO;
import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wb-yxj268701
 * @date 2017/05/22
 */
@Controller
@RequestMapping("/login")
public class LoginAction {

    /**
     * ע��userService
     */
    //依赖注入
    //@Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces="application/json;charset=UTF-8")
    @ResponseBody
    public UserDO login(@ModelAttribute("userDO")UserDO userDO) {
        //List<UserDO> result = userService.findUserList(userDO);
//        long count = userService.findUserListForCount(userDO);
//        UserDO findUser = userService.findUser(userDO);
        UserDO findUser= new UserDO("123","123");
        return findUser;
    }
}
