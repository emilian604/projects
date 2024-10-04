

class Convertor
{
    double to_meter(double x, String um)
    {
        /// din x um in y metri
        switch(um)
        {
            case "m":
                return x;
            case "cm":
                return x*100;
            case "mm":
                return x*1000;
            case "in":
                return x*39.37;
            case "ft":
                return x*3.281;
            default:
                return 0;
        }
    }
    double from_meter(double x, String um)
    {
        /// din x m in y um
        switch(um)
        {
            case "m":
                return x;
            case "cm":
                return x/100;
            case "mm":
                return x/1000;
            case "in":
                return x/39.37;
            case "ft":
                return x/3.281;
            default:
                return 0;
        }
    }
    double conv(double x, String from, String to)
    {
        return from_meter(to_meter(x, to), from);
    }
}
public class Main
{
    public static void main(String[] args)
    {

    }
}