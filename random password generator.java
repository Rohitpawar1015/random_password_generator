import java.util.*;
class Pass_Generate
{
    public static void main(String args[])
    {
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialChars="<>,.?/}]{[]+=-!~@#$%^&*()";
        String combination=upper+lower+num+specialChars;

        int len=8;

        char[]password=new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++)
        {
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("generated Password is="+new String(password));

    }
}