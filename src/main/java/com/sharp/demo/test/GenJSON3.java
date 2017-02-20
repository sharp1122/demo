package com.sharp.demo.test;

public class GenJSON3 {

	static String[] str = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	static String[] ids = new String[]{"﻿AA","﻿AA01","﻿AA02","﻿AA03","﻿AA04","﻿AA05","﻿AA06","﻿AA07","﻿AA08","﻿AA09","﻿AA10","﻿AA11","﻿AA12","﻿AA13","﻿AA14","﻿AA15","﻿AA16","﻿AA17","﻿AA18","﻿AA19","﻿AA20","﻿AA21","﻿AA22","﻿AA23","﻿AA24","﻿AA25","﻿AA26","﻿AA27","﻿AA28","﻿AA29","﻿AA30","﻿AA31","﻿AA32","﻿AA33","﻿AA34","﻿AA35","﻿AA36","﻿AA37","AB","AB01","AB02","AB03","AB04","AB05","AB06","AB07","AB08","AB09","AB10","AB11","AB12","AB13","AB14","AB15","AB16","AB17","AB18","AB19","AB20","AB21","AB22","AB23","AB24","AB25","AB26","AB27","AB28","AB29","AB30","AB31","AB32","AB33","AB34","AB35","AB36","AB37","AB38","AB39","AB40","AB41","AB42","AB43","AB44","AB45","AB46","AB47","AB48","AB49","AB50","AC","AC01","AC02","AC03","AC04","AC05","AC06","AC07","AC08","AD","AD01","AD02","AD03","AD05","AD06","AD07","AD08","AD09","AD10","AD11","AD12","AD13","AD14","AE","AE01","AE02","AE03","AE05","AE06","AE07","AE08","AE09","AE10","AE11","AE12","AE13","AE14","AE15","AE16","AE17","AF","AF01","AF02","AF03","AF04","AF05","AF06","AF07","AF08","AF09","AF10","AF11","AF12","AF13"};
	
	static Integer[] prices = new Integer[]{0,350000,400000,332500,52500,35000,72500,50000,27500,195000,105000,107500,42500,27500,62500,52500,160000,40000,45000,20000,32500,27500,62500,120000,65000,20000,22500,172500,72500,62500,37500,25000,75000,32500,150000,47500,50000,87500,0,900,450,11250,1050,10000,2000,9000,11250,2000,9750,9750,2500,750,3500,18500,18250,5000,7000,2500,3500,2000,8000,3500,11750,6500,1250,4250,3000,1500,1750,3000,18750,1000,2000,16250,6750,1750,5000,1500,9750,2500,3250,500,2000,8000,2125,2750,1750,15000,13250,0,925,950,1500,475,100,150,3750,50,0,950,650,350,1000,150,75,350,875,625,350,750,175,150,0,600,650,600,450,275,425,8250,1375,625,825,225,475,325,2250,200,3750,0,175,175,375,200,200,375,25,75,350,125,850,800,200};
	
	static String[] hospitalIds = new String[]{"200108224036","200312010001","200210310002","200508040012","201203140001","200503220017"};
	
	public static void main(String[] args) {
        String line = ",\n\t";
        String line2 = "\n\t\t";
        String line3 = "\n\t\t\t";
        String groupId = "57034f6f4203f309e3abc69d";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ids.length; i++) {
        	if (ids[i].length() == 2 || ids[i].length() == 3)
        		continue;
        	sb.append("\ndb.c_group_service_item.save({").append("\n\t");
        	sb.append("\"_id\":").append("new ObjectId()").append(line);
        	sb.append("\"groupId\":").append("\""+groupId+"\"").append(line);
        	sb.append("\"serviceItemId\":").append("\""+ids[i]+"\"").append(line);
        	sb.append("\"price\":").append("NumberInt("+(prices[i]*100)+")").append(line);
        	sb.append("\"hospitalFee\":").append("[").append(line2);
        	for (int j = 0; j < hospitalIds.length; j++) {
        		sb.append("{").append(line3);
        		sb.append("\"hospitalId\":").append("\""+hospitalIds[j]+"\",").append(line3);
        		sb.append("\"price\":").append("NumberInt("+(prices[i]*100)+")").append(line2);
        		sb.append("},").append(line2);
        	}
        	sb.delete(sb.length()-1, sb.length()).append("]").append("\n").append("});");
        }
        System.out.println(sb.toString());
	}
}
