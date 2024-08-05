package com.nsoft;

import ipworks.HTTP;

public class HTTPRequestHandler {
    public String getJSONData(String url) {
        HTTP http = new HTTP();
        http.setRuntimeLicense("31504A4A565A3038303432343330574542545231413100425A4E434D50544758434E41534D495500303030303030303000005754354853354743524630570000#IPWORKS#EXPIRING_TRIAL#20240903"); // Replace with your actual license key

        try {
            http.get(url);
            byte[] data = http.getTransferredData();
            return new String(data, "UTF-8");

        } catch(Exception a) {
            return null;
        }
    }
}
