package com.sam.dao;

import com.sam.model.CloudServer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CloudServerDao {
    /*
    * Find all the Cloud Server
     */
    List<CloudServer> findAll();
}
