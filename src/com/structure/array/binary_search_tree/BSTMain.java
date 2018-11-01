package com.structure.array.binary_search_tree;

/**
 * @author pp-sir
 * @date 2018/11/1 15:41
 */
public class BSTMain {

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};

        BSTMain main = new BSTMain();
        main.uniqueMorseRepresentations(words);

    }

    /**
     * LeetCode 804
     * @param args
     */
    public void uniqueMorseRepresentations(String[] args) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        BST<String> stringBST = new BST<>();
        for (String word : args) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                String s = codes[word.charAt(i) - 'a'];
                stringBuilder.append(s);
            }
            stringBST.add(stringBuilder.toString());
            System.out.println(stringBuilder.toString());
        }
        System.out.println(stringBST.getSize());

    }

}
