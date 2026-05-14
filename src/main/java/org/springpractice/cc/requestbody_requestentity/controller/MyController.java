package org.springpractice.cc.requestbody_requestentity.controller;

import org.apache.catalina.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.springpractice.cc.requestbody_requestentity.dto.UserDto;

@RestController
@RequestMapping("/api/users")
public class MyController {
    @GetMapping("/{userId}/posts/{postId}")
    public String getUserAndPost(@PathVariable String userId, @PathVariable String postId) {
        return "User Id : " + userId + " Post Id : " + postId;
    }

    @PostMapping("/body")
    public String postRequestBody(@RequestBody UserDto userDto) {
        return "user created: " + userDto.toString();
    }

    @PostMapping("/body/re")
    public String postRequestEntity(RequestEntity<UserDto> requestEntity) {
        String body = requestEntity.getBody().toString();
        //UserDto dto = requestEntity.getBody();
        String path = requestEntity.getUrl().getPath();
        String url =  requestEntity.getUrl().toString();
        HttpHeaders headers = requestEntity.getHeaders();

        return "Body: " + body + " path: " + path + " url: " + url + " headers: " + headers;
    }
}
