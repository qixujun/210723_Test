package com.hari.test.boss;

import java.util.HashMap;
import java.util.Map;

public class TestSignature {
    public static String url = "http:///?TimeStamp=2012-12-26T10:33:56Z&Format=XML&AccessKeyId=testid&Action=" +
            "DescribeRegions&SignatureMethod=HMAC-SHA1&RegionId=region1&SignatureNonce=NwDAxvLU6tFE0DVb&Version=" +
            "2013-01-10&SignatureVersion=1.0";


    public static void main(String[] args) throws Exception {
        Map<String, String> parameters = new HashMap<>();
        String[] parametersStrList = url.split("\\?")[1].split("&");
        for (String parametersStr: parametersStrList){
            parameters.put(parametersStr.split("=")[0], parametersStr.split("=")[1]);
        }

        String accessKeyId = parameters.get("AccessKeyId");
        Request tempRequest = new Request(accessKeyId, getAccessKeySecret(accessKeyId));


        tempRequest.computeSignature(parameters);
    }

    private static String getAccessKeySecret(String accessKeyId) {
        return "testsecret";
    }
}
