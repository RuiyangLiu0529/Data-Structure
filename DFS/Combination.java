import java.util.ArrayList;
class Combination {
	static ArrayList<String> findCombination(String str) {
		ArrayList<String> result = new ArrayList<>();
		if(str == null || str.length() == 0) return result;
		dfs(str, result, "", 0);
		return result;
	}
	static void dfs(String str, ArrayList<String> result, String sub, int start) {
		result.add(sub);
		if(start == str.length()) return;
		for(int i=start; i<str.length(); i++) {
			sub += str.charAt(i);
			dfs(str, result, sub, i+1);
			sub = sub.substring(0, sub.length()-1);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> result = findCombination("wxyz");
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i)+" ");
		}
	}
	
}