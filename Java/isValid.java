class Solution {
    public boolean isValid(String word) {
        return word.matches("(?i)(?=^.*[b-df-hj-np-tv-z])(?=.*[aeiou])^[a-z0-9]{3,}$");
    }
}