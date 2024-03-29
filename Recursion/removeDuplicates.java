public class removeDuplicates {
    public static void removeDuplicates
            (String str, int index, StringBuilder newStr, boolean map[]){
        // base case
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(index);
        if (map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str,index+1,newStr,map);
        }else {
            map[currChar-'a'] = true;
//            newStr.append(currChar); //both same ways
            removeDuplicates(str,index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnanacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
