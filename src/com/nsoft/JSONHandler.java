package com.nsoft;

import ipworks.JSON;

public class JSONHandler {
    public void processJSON(String jsonData) {
        JSON json = new JSON();
        json.setRuntimeLicense("31504A4A565A3038303432343330574542545231413100425A4E434D50544758434E41534D495500303030303030303000005754354853354743524630570000#IPWORKS#EXPIRING_TRIAL#20240903");

        try {
            json.setInputData(jsonData);
            json.setBuildDOM(true);
            json.parse();
            json.setXPath("$.products");
            int productCount = json.getXChildren().size();
            System.out.println("List with Titles: ");

            for (int i = 0; i < productCount; i++) {
                json.setXPath("$.products[" + i + "].title");
                String title = json.getXText();

                System.out.println(title);
            }

        } catch (Exception a) {
            throw new RuntimeException(a);
        }
    }
}
