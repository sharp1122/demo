package com.sharp.demo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GenJSON {

	static String[] str = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static void main(String[] args) {
		File file = new File("F:/serviceItem.txt");
        BufferedReader reader = null;
        String line = ",\n\t";
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int i = -1;
            // 一次读入一行，直到读入null为文件结束
            StringBuilder sb = new StringBuilder();
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
            	sb.append("\ndb.b_service_item.save({").append("\n\t");
            	sb.append("\"_id\":");
            	
            	String[] names = tempString.split(" ");
            	StringBuilder id = new StringBuilder();
                if (names[0].endsWith(".")) {
                	i++;
                	sb.append("\"A").append(str[i]+"\"").append(line);
                } else {
                	String[] seqs = names[0].split("\\.");
                	//System.out.println(names[0]);
                	if (seqs[1].length() == 1) {
                		id.append("\"A").append(str[i]).append("0"+seqs[1].trim()+"\"");
                		sb.append(id).append(line);
                	} else {
                		id.append("\"A").append(str[i]).append(seqs[1].trim()+"\"");
                		sb.append(id).append(line);
                	}
                }
                sb.append("\"name\":").append("\""+names[1]+"\"").append(line);
                if (names[0].endsWith(".")) {
                	sb.append("\"parent\":").append("\"0\"");
                } else {
                	sb.append("\"parent\":").append(id.substring(0, 3)+"\"");
                }
//                sb.append(line).append("\"isLeaf\":").append("true").append("\n});");
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
