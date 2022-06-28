package com.company.Kyu4Hard.DifferentiatePolynomial;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        System.out.println(differentiate("12x-3x",2));
        differentiate("12x^2+1",2);
    }

    private static final Pattern TERM = Pattern.compile("(.*?)x(\\^\\d+)?");

    public static void differentiate(String equation, long x) {
      BigInteger xb=BigInteger.valueOf(x);
      BigInteger res=BigInteger.ZERO;
      Matcher m=TERM.matcher(equation);

      while(m.find()){
          long k=1;
          String ks=m.group(1);
          if (!ks.isEmpty() && !ks.equals("+")){
              k=ks.equals("-") ? -1:Long.parseLong(ks);
          }
          int p=1;
          String ps=m.group(2);
          if(ps!=null){
              p=Integer.parseInt(ps.substring(1));
          }
          res=res.add(BigInteger.valueOf(k).multiply(BigInteger.valueOf(p).multiply(xb.pow(p-1))));
      }
    }


}
