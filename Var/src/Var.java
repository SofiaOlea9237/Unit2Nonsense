public class Var
{ public static void main(String[] args)
    {
        var number = 9237;
        var word = "hello :)";
        var decimal = 92.37;
        var ok = number+word;
        var oknumber = number+number;
        var okothernumber = number+decimal;
        var okword = word+word;

        System.out.println(number);
        System.out.println(word);
        System.out.println(decimal);
        System.out.println(ok);
        System.out.println(oknumber);
        System.out.println(okothernumber);
        System.out.println(okword);

        //oh how fun. if you use "var" instead of a double, int, string, etc. you can just
        //... put stuff without saying what it specifically is. useful
    }
}

