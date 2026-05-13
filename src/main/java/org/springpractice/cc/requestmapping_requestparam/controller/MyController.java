package org.springpractice.cc.requestmapping_requestparam.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class MyController {
    @GetMapping({"/{user}/posts/{postId}", "/{userId}"})
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

    @GetMapping({"/users/{userId}/address/{address}"})
    public String getUserAddress(@PathVariable Map<String, String> userMap) { //accept any number of path variables using Map
        return "User id : " + userMap.get("userId") + " Address : " + userMap.get("address");
    }

    @GetMapping({"/search"})
    public String getUserDetails(@RequestParam Long user, @RequestParam(defaultValue = "Guest") String name) { //accept any number of path variables using Map
        return "User id : " + user + " name : " + name;
    }

    @GetMapping({"/search/map"})
    public String getUserDetailsUsingMap(@RequestParam Map<String, String> userSearchMap) { //accept any number of path variables using Map
        return "User id : " + userSearchMap.get("user") + " name : " + userSearchMap.get("name");
    }
}
