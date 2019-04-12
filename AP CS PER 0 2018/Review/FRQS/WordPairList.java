package FRQS;

import java.util.ArrayList;

public class WordPairList {

	private ArrayList<WordPair> allPairs;

	public WordPairList(String[] words) {
		allPairs = new ArrayList<WordPair>();

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				allPairs.add(new WordPair(words[i], words[j]));
			}

		}
	}

	public int numMatches() {
		int count = 0;
		for (WordPair p : allPairs) {
			if (p.getFirst().equals(p.getSecond())) {
				count++;
			}
		}

		return count;
	}

	public String toString() {
		String num = "";
		for (WordPair p : allPairs) {
			num += p.getFirst() + p.getSecond() + " ";
		}

		return num;
	}

}
