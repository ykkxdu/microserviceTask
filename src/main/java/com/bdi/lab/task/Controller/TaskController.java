package com.bdi.lab.task.Controller;

import com.bdi.lab.task.utils.Utils;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/task")
public class TaskController {


    @GetMapping("/getTasks")
    public ResponseEntity getTasks(){
        return ResponseEntity.ok(Utils.getJSON("mysql-army.json"));
    }
}
