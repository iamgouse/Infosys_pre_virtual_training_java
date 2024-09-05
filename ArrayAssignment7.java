/*Array - Assignment 7
Problem Statement
Find out all the possible permutations of the characters in the string passed to the method findPermutations(). Implement the logic inside findPermutations() method and return a string array containing all the permutations.

Assumption: The length of the string will be 3.

E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.*/

class Tester{
    private static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[j];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private static void permute(String str,int l, int r, java.util.List<String> result){
        if(l == r){
            result.add(str);
        }else{
            for(int i = l; i<= r; i++){
                str = swap(str, l, i);
                permute(str, l + 1,r, result);
                str = swap(str, l, i);
            }
        }
    }
    public static String[] findPermutations(String str){
        java.util.List<String> result = new java.util.ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        return result.toArray(new String[0]);
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}


