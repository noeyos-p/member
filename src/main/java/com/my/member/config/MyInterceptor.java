package com.my.member.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import java.net.http.HttpResponse;

@Component
// 사용자가 의존성 주입에 필요한
public class MyInterceptor implements HandlerInterceptor {
    // 특정한 로그인을 요청할 때 낚아채는 역할

    @Override
    // Generate -> implement Method -> preHandle
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // localhost:8080/user/login --> post
        HttpSession session = request.getSession();
        Object loginEmail = session.getAttribute("loginEmail");
        if (ObjectUtils.isEmpty(loginEmail)) {
            response.sendRedirect("/user/login");
        }
        return true;
    }
}


