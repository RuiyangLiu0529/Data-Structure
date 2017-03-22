import java.util.ArrayList;
class Permutation {
	static ArrayList<String> getPermutation(Stirng s) {
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
			result.add(str);
			return;
		}

		for(int i=0; i<s.length(); i++) {
			if(set.contains(i)) continue;
			set.add(i);
			sub += s.charAt(i);
			dfs(s, result, sub, set);
			sub = sub.substring(0, sub.length-1);
			set.remove(i);
		}

	}

	
}