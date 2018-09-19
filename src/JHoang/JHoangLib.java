package JHoang;

public class JHoangLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String cutOut(String mainStr, String subStr)
    {
        int location = mainStr.indexOf(subStr);
        {
            if (location > 0)
            {
                String partOne = mainStr.substring(0, location);
                String partTwo = mainStr.substring(location + 1);
                String part = partOne + partTwo;
                return part;
            }
            else
            {
                String part = mainStr.substring(location + 1);
                return  part;
            }
        }
    }
}
