package com.jzw.hrp.system.service;

import com.jzw.hrp.system.mapper.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sang on 2017/12/29.
 */
@Service
@Transactional
public class SystemService {
    @Autowired
    SystemMapper systemMapper;

}