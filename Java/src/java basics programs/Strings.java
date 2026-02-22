package java

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // int [] arr ={5,6,9,6,8,12,29,34,860};
        // Arrays.toString(arr);

        // {Length()}
        String str = "tar Tarun";
        // System.out.println(str.length());

        // {isempty()}
        // System.out.println(str.isEmpty());
        // one more point in this case that it throws exception if it contains null
        // value {nullpointerexception}
        String str2 = null;
        // System.out.println(str2.isEmpty());

        // for securing these we have to convert it like that :

        // if(str2 != null && str2.isEmpty()){
        // System.out.println("this string is null");
        // }

        // {isblank}
        // it also throws null pointer exception if string contains null value
        // System.out.println(str.isBlank());

        // {equals}
        // use to compare two objects(or strings) for equality
        // if on object which we are call equals method then it throws null pointer
        // exception

        String str3 = null;
        String str4 = "str4_String.";

        // System.out.println(str3.equals(str4));
        // System.out.println(str.equals(str4));
        // System.out.println(str==str4); -> this will check the reference of the
        // objects not the value it contains by the object


        //{equalsIgnoreCase}

        // if one of the object containes null value and if they contain on calling method then also it throws and exception which we are call equals method then it throws null pointer
        // exception

        // System.out.println(str.equalsIgnoreCase(str4));

        //{Compare to}
        // compares string with lexicographally
        // System.out.println(str.compareTo(str4));

        //{indexof}
        // return first index of fisrst character or string

        // System.out.println(str.indexOf("run",3,5)); -> from index to end index
        
        //{lastindexof}
        // it check from back means last occurance
        // System.out.println(str.lastIndexOf("n"));

        //{Contain}
        // it check that calling string have that substring or not
        // System.out.println(str.contains("taru"));

        //{startwith}
        // as the name suggst it check if string are start with a given substring or not

        // System.out.println(str.startsWith("tar"));
        // System.out.println(str.startsWith("r ",2));

        
        //{endwith}
        //vice versa of above generally used for check extension of a file

        // System.out.println(str.endsWith("un"));
        
        //{charat}
        // use to find charater at given index

        // System.out.println(str.charAt(5));


        //{substring}
        // begin index inclusive and end index is exclusive

        // System.out.println(str.substring(0,7));
        

        //{touppercase}
        
        // System.out.println(str.toUpperCase());

        //{lowercase}

        // System.out.println(str.toLowerCase());
        
        //{trim}
        // if str=    tar    tarun____; -> it also does not remove whitespaces between the strings
        // System.out.println(str.trim());
        
        //{replace}
        
        // System.out.println(str.replace("a", "pgl"));
        
        //{split}

        // use to split the the string based on delimiter we pass
        // System.out.println(str.split()); ->  see in copy


        
        // confuse in this below topic
        // see this chat with chatgpt you will be understand what is going to be happen https://chatgpt.com/share/6803abf7-43e0-8006-a03d-a55ea07085b1
        
        //{valueof}
        // int arrya [] = {15,69,78,49,36,2,1,545,6};
        // String str5 = String.valueOf(arrya);
        // System.out.println();

        // System.out.println(Arrays.toString(str5));
        
    
    }
}
