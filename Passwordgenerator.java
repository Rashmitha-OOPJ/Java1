import java.util.Random;
class Passwordgenerator{
    public static void main(String[] args){
    String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower="abcdefghijklmnopqrstuvwxyz";
    String nums="0123456789";
    String all=upper+lower+nums;
    String s1="";
    Random rand1=new Random();
    int r1=rand1.nextInt(26);
    int r2=rand1.nextInt(10);
    s1=s1+upper.substring(r1,r1+3)+lower.substring(r1,r1+3)+nums.substring(r2,r2+2);
    System.out.println(s1);
    
    }
    
}
