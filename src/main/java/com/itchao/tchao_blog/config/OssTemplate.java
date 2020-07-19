package com.itchao.tchao_blog.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.UUID;

/**
 * @author wangchao
 * @create 2020-07-13-15:51
 */
@Slf4j
@Data
public class OssTemplate {

    private String endpoint;

    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

    public String upload(InputStream inputStream, String fileName) {

        //加工文件夹和文件名
        log.debug("接收到的原文件名称是：{}", fileName);
        fileName = UUID.randomUUID().toString().replace("-", "") + fileName;

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, "blog/" + fileName, inputStream);
        log.debug("图片上传成功--{}", fileName);
        ossClient.shutdown();
        return "https://" + bucketName + "." + endpoint + "/blog/" + fileName;
    }

    public void deleteFile(String fileName) {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.deleteObject(bucketName, fileName);
    }

}
