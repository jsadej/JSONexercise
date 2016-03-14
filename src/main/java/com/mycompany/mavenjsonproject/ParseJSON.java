/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjsonproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Ksiezniczka
 */
public class ParseJSON {

    public static void main(String[] args) {

        String s = "{\n"
                + "	\"id\": \"41\",\n"
                + "	\"name\": \"Web html flat release\",\n"
                + "	\"hosts\": [{\n"
                + "		\"server\": \"www1\",\n"
                + "		\"ip\": \"192.168.1.2\",\n"
                + "		\"dns\": \"8.8.8.8\"\n"
                + "	}, {\n"
                + "		\"server\": \"www2\",\n"
                + "		\"ip\": \"192.168.1.3\",\n"
                + "		\"dns\": \"8.8.1.1\"\n"
                + "	}]\n"
                + "\n"
                + "}";

        JSONParser parser = new JSONParser();
        try {
            
            JSONObject jsonObject = (JSONObject) parser.parse(s);
            JSONArray hosts = (JSONArray) jsonObject.get("hosts");
            String name = (String) jsonObject.get("name");
            System.out.println(name);
            for (int i = 0; i < hosts.size(); i++) {
                JSONObject host = (JSONObject) hosts.get(i);
                System.out.println(host.get("server"));
                
            }
            //JSONObject host = (JSONObject) hosts.get(0);
            //System.out.println(host);
            //ystem.out.println(host.get("server"));
            //System.out.println(host.get("ip"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
