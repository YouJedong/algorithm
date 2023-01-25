class Solution {
    public String solution(String phone_number) {
        int starCount = phone_number.length() - 4;
        String star = "";
        while (star.length() != starCount) {
            star += "*";
        }
        
        return phone_number.replaceAll(phone_number.substring(0, starCount), star);
    }
}