package jRegisterQuiz;
import java.util.*;
/**
 *File Name: randomKey
 * Programmer: Hadi S.
 * Date: December 4, 2022
 * Description: This is a simple class which is meant to generate a random index number
 * from a HashMap. This class compliments the file RegisterQuiz.
 */
public class randomKey {
	public static Object random(HashMap<Integer, String> List) { // An object called random is made
		Object[] codeKeys = List.keySet().toArray(); // Keys from the HashMap are added to the Object[] codeKeys
		Object key = codeKeys[new Random().nextInt(codeKeys.length)]; // From this array of keys, it is populated with random number from within the array length range
		return key; // The key is then returned
	}
}