package com.company.Kyu7SoEasy.GetTheMiddleCharacter;

class Main{
    public static String getMiddle(String word) {
        int par=word.length()/2;
        String res="";

        if(word.length()%2==0) {
            res = res + word.charAt(par - 1) + word.charAt(par);

        }
        if (word.length() %2>0){
            res=res+word.charAt(par);
        }

        if(word.length()==1){
            return word;
        }


        return res;
    }
}