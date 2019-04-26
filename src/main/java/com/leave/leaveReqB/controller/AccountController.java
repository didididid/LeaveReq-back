package com.leave.leaveReqB.controller;

import com.leave.leaveReqB.request.LoginForm;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class AccountController {

    @Autowired
    ProcessLogin process;

    @PostMapping("/loginState")
    public ResponseEntity<Map<String, Object>> loginState(@RequestBody Map<String, Object> data,
            HttpSession session) throws IOException {
        String id = data.get("id").toString();
        String password = data.get("password").toString();
        System.out.println(id);
        System.out.println(password);

        Map<String, Object> result = new HashMap<>();

        if (!process.authUser(id, password)) {

            return ResponseEntity.badRequest().build();
        } else {
            result.put("id", id);
            return ResponseEntity.ok(result);
        }

    }

}
