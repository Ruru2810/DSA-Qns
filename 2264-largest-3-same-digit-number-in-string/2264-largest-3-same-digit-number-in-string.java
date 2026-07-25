// class Solution {
//     public String largestGoodInteger(String num) {
//         String arr[]={"999","888","777","666","555","444","333","222","111","000"};
//         for(int i=0;i<arr.length;i++){
//             if(num.contains(arr[i])){return arr[i];}
//         }
//         return "";
//     }
// }

class Solution {
    public String largestGoodInteger(String num) {
        char max=' ';
        int count=1;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i+1)){
                count++;
            }else{
                count=1;
            }
            if(count==3){
                if(num.charAt(i)>max){max=num.charAt(i);}
            }
        }
        if(max==' '){return "";}
        return ""+max+max+max;
    }
}