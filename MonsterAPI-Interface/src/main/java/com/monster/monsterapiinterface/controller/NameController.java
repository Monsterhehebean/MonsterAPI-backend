package com.monster.monsterapiinterface.controller;

import com.monster.monsterapiclientsdk.model.User;
import com.monster.monsterapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 *
 * @author Sherlno
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getName(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("monster"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "Post 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该是去数据库中查是否分配给用户
//        if (!accessKey.equals("monster")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//        // 校验时间戳, 时间和当前时间不能超过五分钟
//        Long currentTime = System.currentTimeMillis() / 1000;
//        Long FIVE_MINUTES = 60 * 5L;
//        if ((currentTime - Long.parseLong(timestamp)) >= FIVE_MINUTES) {
//            throw new RuntimeException("超时, 无权限");
//        }
//        // todo 实际情况中是从数据库中查出 secretKey
//        String serverSign = SignUtils.genSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
        // todo 调用次数 + 1  invokeCount
        String result = "Post 用户名字是" + user.getUsername();

        return result;
    }
}
