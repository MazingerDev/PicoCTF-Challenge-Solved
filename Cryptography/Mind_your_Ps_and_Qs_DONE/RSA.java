import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;

class RSA{

    public static void main(String[] args) {
        BigInteger c = new BigInteger("843044897663847841476319711639772861390329326681532977209935413827620909782846667");
        BigInteger n = new BigInteger("1422450808944701344261903748621562998784243662042303391362692043823716783771691667");
        BigInteger e = new BigInteger("65537");
        BigInteger phin = new BigInteger("1422450808944701344261903748621562998783582944057933890341955406374353056752914016");

        BigInteger d,m;
        d = e.modInverse(phin);
        m = c.modPow(d, n);

        String out = String.valueOf(Encode256(base256(m)));

        System.out.println(reverseString(out));


    }
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static ArrayList<BigInteger> base256 (BigInteger M) {
        BigInteger base = new BigInteger("256");
        ArrayList<BigInteger> message256 = new ArrayList<BigInteger>();
        BigInteger sisa=M;
        BigInteger k;
        double z = Double.parseDouble(M.toString());
        double p = Math.floor(Math.log(z)/Math.log(256));
        int r = (int) p;
        for (int j=0;j<=r;j++){
            k=sisa.mod(base);
            sisa=sisa.divide(base);
            message256.add(k);
        }
        return message256;
    }

    static String Encode256 (ArrayList<BigInteger> ascii) {
        String ascii256="";
        int g;
        for (int i=0;i<ascii.size();i++) {
            g = Integer.parseInt(""+ascii.get(i));
            ascii256=ascii256+( (char) g );
        }
        return ascii256;
    }
}