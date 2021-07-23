package com.hari.test.boss;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by whf on 18-6-14.
 */
public class Request {
    private static final String ENCODING = "UTF-8";
    private static final String RESPONSE_FORMAT = "JSON";

    private String httpMethod = "GET";

    private String accessKeyId;
    private String accessKeySecret;

    public Request(String accessKeyId, String accessKeySecret) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }
    /**
     * 根据传入参数生成签名字符串
     *
     * @param parameters parameters
     * @throws Exception Exception
     */
    public String computeSignature(Map<String, String> parameters) throws Exception {
        // 将参数Key按字典顺序排序
        String[] sortedKeys = parameters.keySet().toArray(new String[] {});
        Arrays.sort(sortedKeys);

        final String SEPARATOR = "&";

        // 生成规范化请求字符串
        StringBuilder canonicalizedQueryString = new StringBuilder();
        for (String key : sortedKeys) {
            canonicalizedQueryString.append("&").append(percentEncode(key)).append("=")
                    .append(percentEncode(parameters.get(key)));
        }

        // 生成用于计算签名的字符串 stringToSign

        // 注意accessKeySecret后面要加入一个字符"&"
        String stringToSign = httpMethod + SEPARATOR
                + percentEncode("/") + SEPARATOR
                + percentEncode(canonicalizedQueryString.toString().substring(1));
        String signature = calculateSignature(accessKeySecret + "&",
                stringToSign);
        System.out.println(signature.replaceAll("/", "%2F").replaceAll("\\+", "%2B").replaceAll("=", "%3D"));
        return signature;
    }

    private static String calculateSignature(String key, String stringToSign) throws Exception {
        // 使用HmacSHA1算法计算HMAC值
        final String ALGORITHM = "HmacSHA1";
        Mac mac = Mac.getInstance(ALGORITHM);
        mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
        byte[] signData = mac.doFinal(stringToSign.getBytes(ENCODING));

        return new String(Base64.encodeBase64(signData));
    }

    private static String percentEncode(String value) throws UnsupportedEncodingException {
        // 使用URLEncoder.encode编码后，将"+","*","%7E"做替换即满足ECS API规定的编码规范
        return value != null ? URLEncoder.encode(value, ENCODING).replace("+", "%20").replace("*", "%2A")
                .replace("%7E", "~") : null;
    }
}