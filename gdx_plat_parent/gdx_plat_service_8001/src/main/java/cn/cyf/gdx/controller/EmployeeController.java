package cn.cyf.gdx.controller;

import cn.cyf.gdx.domain.Employee;
import cn.cyf.gdx.utils.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyf
 * @date 2019/2/23 14:17
 * @description
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //模拟service层数据
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
//    @RequestMapping(value = "/login")
    public void zz(){

        System.out.println("123");
    }

}
