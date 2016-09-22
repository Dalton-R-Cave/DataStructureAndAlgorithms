import java.util.HashMap;

/*
 * This is using a hashmap to switch this over from traditional recursion
 * to dynamic programming.  It is worth noting however that storing every
 * value in the hash map is not really necessary here.  We could instead just
 * keep the last two values, achieving the same end, but using less space.
 * However this sort of "sliding window" is not necessarily applicable to every
 * dynamic programming issue, leading to using this particular paradigm for practice
 */
public class Fibonacci {
	static HashMap<Integer, Long> cache = new HashMap<>();

	public static void main(String[] args){
		
		for (int i = 0; i <= 40; i++){
			System.out.println(fib(i));
		}
	}
	
	public static long fib(int index){
		if(index == 0) return 0;
		if(index == 1) return 1;
		if(cache.get(index) != null) return cache.get(index);
		else{
			cache.put(index, fib(index - 1) + fib(index - 2));
			return cache.get(index);
		}		
	}
	
	public static long fibNoCache(int index){
		if(index == 0) return 0;
		if(index == 1) return 1;
		return (fibNoCache(index - 1) + fibNoCache(index - 2));
	}
}
