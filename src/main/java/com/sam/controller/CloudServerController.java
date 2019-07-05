package com.sam.controller;


import com.sam.dao.CloudServerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.sam.model.CloudServer;

@RestController
public class CloudServerController {

    @Autowired
    private CloudServerDao cloudServerDao;

    @CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
    @RequestMapping("/cloudserver")
    public List<CloudServer> getCloudServerList(HttpServletResponse response) {


        System.out.println("Accessing /cloudserver");
        List<CloudServer> cloudServerList = cloudServerDao.findAll();
        int cloudServerSize = cloudServerList.size();
        response.setHeader("X-Total-Count", String.valueOf(cloudServerSize));
        return cloudServerList;
    }
}
