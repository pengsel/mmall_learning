package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ionolab-DP on 2018/12/21.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);


}
