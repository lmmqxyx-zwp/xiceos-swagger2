package top.by.xs2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.by.xs2.entity.User;
import top.by.xs2.service.UserService;

@Api(value = "RestfulUserController类注解@Api")
@Controller
@RequestMapping(value = "restfulUser")
public class RestfulUserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @PostMapping(value = "/insert")
    @ResponseBody
    public User insert(@ModelAttribute User user) {
        return userService.insert(user);
    }

    @DeleteMapping(value = "/delete")
    @ResponseBody
    public void delete(@ModelAttribute User user) {
        userService.delete(user);
    }

    @PutMapping(value = "/update")
    @ResponseBody
    public User update(@ModelAttribute User user) {
        return userService.update(user);
    }

    @ApiOperation(value = "查询用户", notes = "根据用户主表ID查询用户")
    // 使用下面的 @ApiImplicitParam 注解导致接收参数失败
    // @ApiImplicitParam(name = "id", value = "用户表主键ID", required = true, dataType = "java.lang.Long")
    @GetMapping(value = "/select")
    @ResponseBody
    public User select(@RequestParam(name = "id", required = true) Long id) {
        return userService.select(id);
    }

}
