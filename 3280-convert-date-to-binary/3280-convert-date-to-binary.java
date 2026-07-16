class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        String yearB = Integer.toBinaryString(year);
        String monthB = Integer.toBinaryString(month);
        String dayB = Integer.toBinaryString(day);
        return yearB + "-" + monthB + "-" + dayB;
    }
}