/*
package com.hari.test.boss;

import cn.watone.desktopcloud.exception.global.WatoneRuntimeException;
import cn.watone.desktopcloud.interfaces.request.AccessKeyServiceImpl;
import cn.watone.desktopcloud.model.accessKey.AccessKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

*/
/**
 * Created by whf on 18-6-14.
 *//*

@Service
public class APIService {

    public static Map<String, String> accessKeyMap = new HashMap<>();// 授权第三方的密钥
    @Autowired
    AccessKeyServiceImpl accessKeyServiceImpl;

    */
/**
     * 检查签名字符串是否正确
     *//*

    private boolean checkSignature(Map<String, String> parameters)
//            throws WatoneRuntimeException
    {
        String accessKeyId = parameters.get("AccessKeyId");
        Request tempRequest = new Request(accessKeyId, getAccessKeySecret(accessKeyId));
        String signature = "";
        if (!parameters.containsKey("Signature")) {
//            throw new WatoneRuntimeException("Signature参数缺失", 101);
        }
        signature = parameters.get("Signature");
        parameters.remove("Signature");
        try {
            if (!signature.equals(tempRequest.computeSignature(parameters))) {
//                throw new WatoneRuntimeException("签名错误", 101);
            }
        } catch (Exception e) {
//            throw new WatoneRuntimeException(e.getMessage(), 101);
        }
        return true;
    }

    private String getAccessKeySecret(String accessKey)
//            throws WatoneRuntimeException
    {
        if (accessKeyMap.size() > 0 && accessKeyMap.containsKey(accessKey)) {
            return accessKeyMap.get(accessKey);
        }

        AccessKey rs = accessKeyServiceImpl.findByAccessKey(accessKey);
        if (rs == null) {
//            throw new WatoneRuntimeException("授权错误，找不到对应的AccessKeySecret", 101);
        } else {
            String accessKeySecret = rs.getAccessKeySecret();
            accessKeyMap.put(accessKey, accessKeySecret);
            return accessKeySecret;
        }
    }

    */
/**
     * 验证请求
     *//*

    public void checkRequest(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Map<String, String> parameters = new HashMap<String, String>(parameterMap.size());
        Set<String> key = parameterMap.keySet();
        for (Iterator it = key.iterator(); it.hasNext(); ) {
            String s = (String) it.next();
            parameters.put(s, parameterMap.get(s)[0]);
        }

        if (!parameters.containsKey("AccessKeyId")) {
//            throw new WatoneRuntimeException("AccessKeyId参数缺失", 101);
        }

        if (!parameters.containsKey("Signature")) {
//            throw new WatoneRuntimeException("Signature参数缺失", 101);
        }

        if (!parameters.containsKey("SignatureNonce")) {
//            throw new WatoneRuntimeException("SignatureNonce参数缺失", 101);
        }

        if (!parameters.containsKey("Timestamp")) {
//            throw new WatoneRuntimeException("Timestamp参数缺失", 101);
        }

        checkSignature(parameters);
    }
}
*/
