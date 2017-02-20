package com.sharp.demo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GenJSON2 {

	static String[] str = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static void main(String[] args) {
		File file = new File("F:/baseServiceItem.txt");
        BufferedReader reader = null;
        String line = ",\n\t";
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            StringBuilder sb = new StringBuilder();
            
            String tempid = "";
            while ((tempString = reader.readLine()) != null) {
                if (tempString.indexOf("#") == -1)
                	continue;
            	sb.append("\ndb.b_service_item.save({").append("\n\t");
            	String[] arr = tempString.split("#");
            	if (arr[0].contains("A")) {
            		tempid = arr[0];
            		sb.append("\"_id\":").append("\"").append(tempid).append("\"");
            	} else {
            		String id2 = arr[0];
            		if (arr[0].length() == 1) {
            			id2 = "0"+arr[0];
            		}
            		id2 = tempid+id2;
            		sb.append("\"_id\":").append("\"").append(id2).append("\"");
            	}
            	sb.append(line);
            	
            	sb.append("\"name\":").append("\"").append(arr[1]).append("\"");
            	sb.append(line);
            	
            	sb.append("\"price\":").append("NumberInt(").append(Integer.valueOf(arr[2])*100).append(")");
            	sb.append(line);
            	if (arr[0].contains("A")) {
            		sb.append("\"parent\":").append("\"").append("0").append("\"");
            	} else {
            		sb.append("\"parent\":").append("\"").append(tempid).append("\"");
            	}
            	sb.append("\n});");
            	
            }
            System.out.println(sb);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
	}
}
