class Solution {
    public String solution(String phone_number) {
        char[] pnArr = phone_number.toCharArray();
        
        for (int i = 0; i < pnArr.length - 4; i++) {
            pnArr[i] = '*';
        }
        
        return String.valueOf(pnArr);
    }
}