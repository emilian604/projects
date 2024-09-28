

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

class BaseConverter
{
    int Convert(int x)
    {
        /// convertim x din baza 2 in baza 10
        int rasp, j;
        rasp = 0;
        j = 1;
        while (x > 0)
        {
            rasp += x % 2 * j;
            j *= 2;
            x /= 10;
        }
        return rasp;
    }
}

class Elev
{
    int varsta;
    String nume;
    String prenume;
    int cnp;
    public Elev(int varsta, String nume, String prenume, int cnp)
    {
        this.varsta = varsta;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }
}

class Fizica
{
    private int Parser(String s)
    {
        int num = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            else
                break;
        }

        return num;
    }
    double Problema(String s1, String s2)
    {
        /// v = d / t
        String time, distance, viteza;
        time = distance = viteza = "";
        char C, PC;
        C = s1.charAt(s1.length() - 1);
        PC = s1.charAt(s1.length() - 2);
        if (C == 's' || C == 'h')
        {
            if (PC == '/')
                viteza = s1;
            else
                time = s1;
        }
        else
            distance = s1;

        C = s2.charAt(s2.length() - 1);
        PC = s2.charAt(s2.length() - 2);
        if (C == 's' || C == 'h')
        {
            if (PC == '/')
                viteza = s2;
            else
                time = s2;
        }
        else
            distance = s2;
        int d, t, v;
        d = Parser(distance);
        t = Parser(time);
        v = Parser(viteza);
        if (viteza.isEmpty())
            return  1f * d / t;
        else if (distance.isEmpty())
            return 1f * v * t;
        else
            return 1f * d / v;
    }
}

public class Main
{
    public static void main(String[] args)
    {

    }
}