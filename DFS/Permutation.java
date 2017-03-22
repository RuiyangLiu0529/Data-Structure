import java.util.ArrayList;
import java.util.HashSet;
class Permutation {
	static ArrayList<String> getPermutation(String s) {
		ArrayList<String> result = new ArrayList<>();
		if(s == null || s.length() == 0) {
			return result;
		}
		HashSet<Integer> set = new HashSet<>();
		dfs(s,result,"", set);
		return result;
	}

	static void dfs(String s, ArrayList<String> result, String sub, HashSet<Integer> set) {
		if(s.length() == sub.length()) {
			result.add(sub);
			return;
		}

		for(int i=0; i<s.length(); i++) {
			if(set.contains(i)) continue;
			set.add(i);
			sub += s.charAt(i);
			dfs(s, result, sub, set);
			sub = sub.substring(0, sub.length()-1);
			set.remove(i);
		}

	}

	public static void main(String[] args) {
		ArrayList<String> result = getPermutation("aaa");

		for(int i=0; i<result.size(); i++) {
			System.out.print(result.get(i)+",");
		}
	}
}