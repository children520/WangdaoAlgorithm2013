public  class WordDictionary {
    private String sentence;
    /** Initialize your data structure here. */
    public WordDictionary() {
        sentence="";
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        sentence+=word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        int k=0;
        for (int i=0;i<sentence.toCharArray().length;i++){
            if(sentence.charAt(i)==word.charAt(i)){
                k++;
                if(k==word.length()){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */