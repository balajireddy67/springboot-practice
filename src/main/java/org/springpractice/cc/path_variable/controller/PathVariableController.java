package org.springpractice.cc.path_variable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PathVariableController {
    @GetMapping({"/api/users/{user}/posts/{postId}", "/api/users/{userId}"})
    public String getDetailsUsingPathVariable(@PathVariable(name = "userId") Long user, @PathVariable(required = false) String postId) {
        String response;
        if (postId == null) {
            response = "User ID: " + user;
        } else {
            response = "User ID: " + user + " Post ID: " + postId;
        }
        return response;
    }
//
//    @GetMapping({"/api/users/{userId}/posts/{postId}", "/api/users/{userId}"})
//    public String getDetailsUsingPathVariable(@PathVariable Long userId, @PathVariable(required = false) String postId) {
//        String response;
//        if (postId == null) {
//            response = "User ID: " + userId;
//        } else {
//            response = "User ID: " + userId + " Post ID: " + postId;
//        }
//        return response;
//    }

    @GetMapping({"/api/users/{userId}/address/{address}"})
    public String getUserAddress(@PathVariable Map<String, String> userMap) { //accept any number of path variables using Map
        return "User id : " + userMap.get("userId") + " Address : " + userMap.get("address");
    }

}
