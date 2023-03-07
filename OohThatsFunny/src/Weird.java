public class Weird
{
    public static void main(String[] args)
    {
        //ok so... if you are insane and decide to use the same name for different variables,
        //the thing (in this case number) will have the value of the "last thing" that was mentioned...
        double width = 20;
        System.out.println(width);
        //for example, width is worth 20 right now
        width = 30;
        width = width + 10;
        System.out.println(width);
        //now width is 40 because the last thing "mentioned" was width=30 and then 30+10
        //how weird... im never gonna use that :)
    }
}
