package test_java_utils;
import java.util.*;
public class TestJavaUtils 
{
public static void main(String[] args) 
{

    	
    	
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("LinkedList");
        linkedList.add("CSE");
        linkedList.add("IT");
        linkedList.add("AD");
        linkedList.add("AIML");
        System.out.println(linkedList);
        System.out.println("Searching MECH in linkedlist :" + linkedList.contains("MECH"));

        linkedList.remove("AIML");
        System.out.println("LinkedList after removing AIML: " + linkedList);


        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("\nArrayList");
        arrayList.add("CSE");
        arrayList.add("IT");
        arrayList.add("AD");
        arrayList.add("AIML");
        System.out.println(arrayList);
        System.out.println("Searching MECH in ArrayList :" + arrayList.contains("MECH"));
        arrayList.remove("AIML");
        System.out.println("ArrayList after removing AIML: " + arrayList);


        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("\nHashMap");
        hashMap.put("CSE", 255);
        hashMap.put("IT", 230);
        hashMap.put("AD", 250);
        hashMap.put("AIML", 220);
        System.out.println(hashMap);
        System.out.println("Searching no of students in CSE : " + hashMap.get("CSE"));
        hashMap.remove("AIML");
        System.out.println("HashMap after removing AIML: " + hashMap);


        HashSet<String> hashSet = new HashSet<>();
        System.out.println("\nHashSet");
        hashSet.add("CSE");
        hashSet.add("IT");
        hashSet.add("AD");
        hashSet.add("AIML");
        System.out.println(hashSet);
        System.out.println("Searching MECH in HashSet : " + hashSet.contains("MECH"));

        hashSet.remove("AIML");
        System.out.println("HashSet after removing AIML: " + hashSet);
    }

}
