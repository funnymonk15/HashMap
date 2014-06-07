import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class HashMapTest 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("test1.txt");
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		while ((line = bufferedReader.readLine()) != null)
		{
			
			String[] parts = line.split(" ");
			String word = parts[0];
			String numberWord = parts[1];
			int number = Integer.parseInt(numberWord.replaceAll("[\\D]", ""));
			
			boolean exists = hm.containsKey(word);
			
			if (exists == true) {
				int value = hm.get(word);
				number = number + value;
				hm.put(word, number);
			} else {
				hm.put(word, number);
			}
		}
		
        Set<String> keys = hm.keySet();
        for(String key: keys)
        {
        	String stringFinal = key + " " + hm.get(key);
        	System.out.println(stringFinal);
        }
		
		fileReader.close();
//		
//		String string1 = stringBuffer.toString();
//		
//		String[] parts = string1.split("\n");
//		String part1 = parts[0];
//			String[] part1parts = part1.split(" ");
//			String part1word = part1parts[0];
//			String part1part2 = part1parts[1];
//			int part1number = Integer.parseInt(part1part2.replaceAll("[\\D]", ""));
//		String part2 = parts[1];
//			String[] part2parts = part2.split(" ");
//			String part2word = part2parts[0];
//			String part2part2 = part2parts[1];
//			int part2number = Integer.parseInt(part2part2.replaceAll("[\\D]", ""));
//		String part3 = parts[2];
//			String[] part3parts = part3.split(" ");
//			String part3word = part3parts[0];
//			String part3part2 = part3parts[1];
//			int part3number = Integer.parseInt(part3part2.replaceAll("[\\D]", ""));
//		String part4 = parts[3];
//			String[] part4parts = part4.split(" ");
//			String part4word = part4parts[0];
//			String part4part2 = part4parts[1];
//			int part4number = Integer.parseInt(part4part2.replaceAll("[\\D]", ""));
//		String part5 = parts[4];
//			String[] part5parts = part5.split(" ");
//			String part5word = part5parts[0];
//			String part5part2 = part5parts[1];
//			int part5number = Integer.parseInt(part5part2.replaceAll("[\\D]", ""));
//			
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		
//		Integer value1 = hm.get(part1word);
//		if (value1 != null) 
//		{
//			hm.put(part1word, part1number);
//		} else {
//			hm.put(part1word, part1number);
//		}
//		
//		Integer value2 = hm.get(part2word);
//		if (value2 != null) 
//		{
//			hm.put(part2word, part2number);
//		} else {
//			hm.put(part2word, part2number);
//		}
//		
//		Integer value3 = hm.get(part3word);
//		if (value3 != null) 
//		{
//			hm.put(part3word, part3number);
//		} else {
//			hm.put(part3word, part3number);
//		}
//		
//		Integer value4 = hm.get(part4word);
//		if (value4 != null) 
//		{
//			part1number = part1number + part4number;
//			hm.put(part1word, part1number);
//		} else {
//			hm.put(part4word, part4number);
//		}
//		
//		Integer value5 = hm.get(part5word);
//		if (value5 != null) 
//		{
//			part3number = part3number + part5number;
//			hm.put(part3word, part3number);
//		} else {
//			hm.put(part5word, part5number);
//		}
//		
//        Set<String> keys = hm.keySet();
//        for(String key: keys)
//        {
//        	String stringFinal = key + " " + hm.get(key);
//        	System.out.println(stringFinal);
//        }

		
	}
}
