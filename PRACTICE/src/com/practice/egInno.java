package com.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class egInno {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader fw=new FileReader(new File("D:\\Data.txt"));
		
		HashMap<String,String> hmap=new HashMap<>();
		HashSet<String> hs=new HashSet<>();
		
		int ch;
		String value="";
		String valueOne="a121a4cb-8d51-4622-923c-3755c80b51b8$#$ip#$#190.25.228.161~$~sessionId#$#~$~os#$#Windows~$~device#$#Desktop~$~browserDetails#$#Internet Explorer 10.0~$~country#$#Malaysia~$~country_code#$#MY~$~region#$#Selangor~$~city#$#Kuala Lumpur~$~latitude#$#80.257616~$~longitude#$#12.968093~$~timeStr#$#2014-12-15 17:02:10~$~userAgent#$#Mozilla/5.0 (Linux; U; Android 4.0; en-us; GT-I9300 Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30~$~referrer#$#~$~errorCount#$#~$~PageLoadTime#$#1748~$~FirstbyteTime#$#1500~$~ServerConnectionTime#$#169~$~ResponseAvailableTime#$#1331~$~FrontEndTime#$#248~$~DocumentReadyTime#$#143~$~DocumentDownloadTime#$#74~$~DocumentProcessingTime#$#69~$~PageRenderTime#$#105~$~DNSLookupTime#$#1~$~TCPConnectTime#$#1~$~url#$#http://192.168.11.121:8780/corebanking/retail/interbanktransfer.jsp~$~error#$#~$~pageType#$#IFrame~$~resourceTiming#$#{\"rsrc\":[{\"tm\":[0,-1,-1,0,0,0,0,0,2,1814,2355],\"ofst\":1,\"init\":\"0\",\"url\":\"http://192.168.11.121:8780/corebanking/retail/interbanktransfer.jsp\",\"rsrctyp\":\"0\",\"frmt\":\"1\"},{\"tm\":[0,0,96],\"ofst\":1872,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/rumcollector/egrum.js\",\"rsrctyp\":\"2\",\"frmt\":\"2\"},{\"tm\":[0,-1,-1,0,39,39,39,827,840,1953,1968],\"ofst\":1873,\"init\":\"1\",\"url\":\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/base/jquery-ui.css\",\"rsrctyp\":\"1\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,46,91,94],\"ofst\":1873,\"init\":\"1\",\"url\":\"http://192.168.11.121:8780/EasyKart/styles/jquery.s...boxit.css\",\"rsrctyp\":\"1\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,22,22,22,68,89,142,145],\"ofst\":1874,\"init\":\"1\",\"url\":\"http://192.168.11.121:8780/EasyKart/styles/kk-style.css\",\"rsrctyp\":\"1\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,839,2970,2974],\"ofst\":1874,\"init\":\"3\",\"url\":\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.1/jquery.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,837,1967,2966],\"ofst\":1874,\"init\":\"3\",\"url\":\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,50,50,50,77,84,105,113],\"ofst\":1874,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.v...te.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,55,55,55,79,84,111,117],\"ofst\":1875,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.j....3.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,63,63,63,80,83,115,120],\"ofst\":1878,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.tools.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,94,162,167],\"ofst\":1878,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.s...it.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,109,123,132],\"ofst\":1878,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.u...ker-en.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,114,126,133],\"ofst\":1878,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.u...ker-de.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,117,149,154],\"ofst\":1878,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.u...ker-pt.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,130,170,175],\"ofst\":1879,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.u...ker-es.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,131,155,160],\"ofst\":1879,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/ddpowerzoomer.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,139,173,180],\"ofst\":1879,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.j...el.min.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,152,183,188],\"ofst\":1879,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/jquery.cookie.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,159,174,180],\"ofst\":1879,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/kk.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,165,173,180],\"ofst\":1880,\"init\":\"3\",\"url\":\"http://192.168.11.121:8780/EasyKart/script/kk.validation.js\",\"rsrctyp\":\"2\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,29,39,41],\"ofst\":2028,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/3/1/1/1/3111B14C...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,36,74,78],\"ofst\":2028,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/8/6/D/7/86D70649...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,37,77,78],\"ofst\":2029,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/F/F/0/6/FF06923B...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,37,76,79],\"ofst\":2029,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/1/0/3/0/10301426...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,42,75,79],\"ofst\":2029,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/5/4/F/D/54FDD302...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,74,97,98],\"ofst\":2029,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/E/7/B/8/E7B8896B...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,94,106,108],\"ofst\":2030,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/C/0/2/C/C02C89ED...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,94,149,151],\"ofst\":2031,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/5/E/8/9/5E89B135...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,94,170,171],\"ofst\":2032,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/9/6/A/2/96A22190...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,94,149,151],\"ofst\":2032,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/1/B/3/F/1B3F5FA1...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,101,108,109],\"ofst\":2033,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/9/5/7/8/95782936...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,107,121,122],\"ofst\":2033,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/A/2/1/C/A21CA25F...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,120,143,144],\"ofst\":2034,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/1/5/F/8/15F8FBB1...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,123,146,148],\"ofst\":2034,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/1/1/B/C/11BC0D25...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,145,155,156],\"ofst\":2034,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/F/9/8/F/F98F155B...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,2,23,24],\"ofst\":2356,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/4/A/6/B/4A6B2621...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,2,16,17],\"ofst\":2356,\"init\":\"4\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/prod/9/4/C/A/94CA0B48...edium.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,7,36,78],\"ofst\":5273,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/banners/home-page/delonghi.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,6,31,38],\"ofst\":5274,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/banners/home-page/electronics-sale.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,8,35,39],\"ofst\":5274,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/banners/home-page/gifts-fo...-home.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,7,31,38],\"ofst\":5274,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/banners/home-page/electron...ale-2.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,7,29,36],\"ofst\":5275,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/banners/home-page/iphone-5.jpg\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,6,28,31],\"ofst\":5276,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/star-empty.png\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,127,137,138],\"ofst\":5280,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/icons/pinterest-grey.png\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,2,19,20],\"ofst\":5578,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/flags/en_GB.gif\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,10,33,35],\"ofst\":5601,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/arrow-down-hover.png\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,3,20,21],\"ofst\":5697,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/arrow-right.png\",\"rsrctyp\":\"3\",\"frmt\":\"1\"},{\"tm\":[0,-1,-1,0,0,0,0,0,12,45,47],\"ofst\":5698,\"init\":\"2\",\"url\":\"http://192.168.11.121:8780/EasyKart/images/arrow-le...ctive.png\",\"rsrctyp\":\"3\",\"frmt\":\"1\"}],\"timeOrigin\":1470821123489,\"initType\":\"\",\"initTypeCount\":{\"0\":1,\"1\":3,\"2\":13,\"3\":16,\"4\":17},\"rsrcType\":\"\",\"rsrcTypeCount\":{\"0\":1,\"1\":3,\"2\":16,\"3\":30}}~$~gatewayIp#$#192.168.8.18~$~isNav#$#1~$~isRsrc#$#1~$~rumParentGUID#$#49b3162e-abe8-4872-7d6e-148e6186c03a-1572430640948~$~rumBaseGUID#$#49b3162e-abe8-4872-7d6e-148e6186c03a-1572430640948~$~btmGuid#$#~$~btmNodeOrder#$#~$~btmExecTime#$#~$~networkDownlink#$#5.5~$~networkEffectiveType#$#4g~$~networkRTT#$#50~$~pageName#$#static~$~status#$#~$~SSLHandshakeTime#$#0~$~AppCacheTime#$#0~$~RedirectionTime#$#4~$~BrowserWaitTime#$#3~$~~!~";
		int[] a=new int[5];
		String[] arr = null;
		int i=0;
		hs.add(valueOne.substring(44,58));
		//fr = new FileReader("D:\\Notes\\Read.txt");
        while ((ch=fw.read())!=-1)
        {
        	if(ch!=-1)
        		value+=String.valueOf((char)ch);
        	else
        		value=null;
        	System.out.println(value);
        	//arr=value.split("\n");
        	//hs.add(value.substring(44,58));
        }
        for(String ch1:hs)
        {
        	System.out.println(ch1);
        }
//        for(int k=0;k<arr.length;k++)
//        {
//        	System.out.println(arr[k]);
//        }
        fw.close();
	}

}
