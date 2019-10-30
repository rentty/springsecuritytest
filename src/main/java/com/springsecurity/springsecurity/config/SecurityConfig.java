//package com.springsecurity.springsecurity.config;
//
//import com.springsecurity.springsecurity.filter.VerifyCodeFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * @author BABA
// * @date 2019/10/10 16:34
// */
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
////    @Autowired
////    VerifyCodeFilter verifyCodeFilter;
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
////        auth.inMemoryAuthentication().withUser("admin").roles("admin")
////                .password("123456")
////                .and()
////                .withUser("guest").roles("user")
////                .password("123456");
////    }
////
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////        web.ignoring().antMatchers("/vercode");
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.addFilterBefore(verifyCodeFilter, UsernamePasswordAuthenticationFilter.class);
////        http.authorizeRequests()// 开启登录配置
////        .antMatchers("/hello").hasRole("admin")
////        .anyRequest().authenticated()// 剩余接口登录后就能直接访问
////        .and()
////        .formLogin().successHandler(new AuthenticationSuccessHandler() {
////            @Override
////            public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
////                httpServletResponse.setContentType("application/json;charset=utf-8");
////                PrintWriter out = httpServletResponse.getWriter();
////                out.write("success");
////                out.flush();
////            }
////        }).failureHandler(new AuthenticationFailureHandler() {
////            @Override
////            public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
////                httpServletResponse.setContentType("application/json;charset=utf-8");
////                PrintWriter out = httpServletResponse.getWriter();
////                out.write("fail");
////                out.flush();
////            }
////        }).permitAll()// 和表单登录相关的接口统统直接通过
////        .and().logout().logoutUrl("/logout")
////        .logoutSuccessHandler(new LogoutSuccessHandler() {
////            @Override
////            public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
////                httpServletResponse.setContentType("application/json;charset=utf-8");
////                PrintWriter out = httpServletResponse.getWriter();
////                out.write("logout success");
////                out.flush();
////            }
////        }).permitAll().and().httpBasic().and().csrf().disable();
////    }
//
////    @Bean
////    PasswordEncoder passwordEncoder(){
////        return new BCryptPasswordEncoder();
////    }
////
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////        web.ignoring().antMatchers("/css/**");
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
//////        http.formLogin() // 表单登录
//////                // http.httpBasic() // HTTP Basic
//////                .loginPage("/login.html")
//////                .loginProcessingUrl("/login")
//////                .and()
//////                .authorizeRequests() // 授权配置
//////                .antMatchers("/login.html").permitAll()
//////                .anyRequest()  // 所有请求
//////                .authenticated(); // 都需要认证
////        http.formLogin() // 表单登录
////                // http.httpBasic() // HTTP Basic
////                .loginPage("/authentication/require") // 登录跳转 URL
////                .loginProcessingUrl("/login") // 处理表单登录 URL
////                .and()
////                .authorizeRequests() // 授权配置
////                .antMatchers("/authentication/require", "/login.html").permitAll() // 登录跳转 URL 无需认证
////                .anyRequest()  // 所有请求
////                .authenticated() // 都需要认证
////                .and().csrf().disable();
////    }
//
//}
