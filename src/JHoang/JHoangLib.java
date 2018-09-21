//Jack Hoang 9/20/2019//

package JHoang;

public class JHoangLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * Deletes the first occurrence of a string from another string.
     * @param mainStr The main string which we are deleting from.
     * @param subStr The string that we delete in mainStr.
     * @return Returns the cutoff string.
     */
    public static String cutOut(String mainStr, String subStr)
    {
        if (mainStr.contains(subStr)) {
            int location = mainStr.indexOf(subStr);
            {
                if (location > 0)                                       // If the subStr is found in the the middle.//
                {
                    String partOne = mainStr.substring(0, location);     //Cuts mainStr into 2 parts and reconnects them.//
                    String partTwo = mainStr.substring(location + subStr.length());
                    String part = partOne + partTwo;
                    return part;
                } else                                             //If the subStr is found is in the beginning of mainStr.//
                {
                    String part = mainStr.substring(location + subStr.length());
                    return part;
                }
            }
        }
        else
        {
            return mainStr;
        }
    }

    /**
     * Checks to see if a word is a palindrome.
     * @param word The word that we are checking.
     * @return Returns whether or not word is a palindrome.
     */
    public static boolean isPalindrome(String word){
        String reverse = "";                                //What will eventually be compared to word.//
        for (int x = word.length() - 1; x >= 0; x--)        //Goes through the entire length of word.//
        {
            reverse = reverse + word.charAt(x);   //Taking the last letter of word and putting it in front of reverse.//
        }
        if (word.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Gives the total sum of 0 up to a number.
     * @param upTo The number that we add up to.
     * @return Returns the sum of 0 to upTo.
     */
    public static int sumUpTo(int upTo)
    {
        int total = 0;                      //total is going to be what is returned.//
        for (int x = 0; x < upTo + 1; x++)  //Goes through every number until it reaches int upTo.//
        {
            total += x;                     //Individually adds each number.//
        }
        return total;
    }

    /**
     * Checks if a number is a fibonnaci number or not.
     * @param Integer The number that we are checking.
     * @return Returns whether or not the number is a fibonnaci number.
     */
    public static  boolean isFibonnaci(int Integer)
    {
        int fibCheck1 = 0;    //fibCheck1 will always be the previous number fibonacci number behind fibCheck2//
        int fibCheck2 = 1;   //fibCheck2 will always the most recent fibonacci number and will be compared to Integer//
        int fibCheck3 = 0;  //fibCheck3 "backs up" fibCheck2//
        if(Integer == 0 || Integer == 1)    //If Integer is 0 or 1 returns true.//
        {
            return true;
        }

        while (fibCheck2 <= Integer)       //Repeats until it matches or fibCheck is greater than Integer.//
        {
            if (Integer == fibCheck2)    //Checks if it's true//
            {
                return true;
            }
            fibCheck3 = fibCheck2;              //fibCheck3 remembers fibCheck2//
            fibCheck2 = fibCheck1 + fibCheck2; //Becomes the most recent fibonacci number//
            fibCheck1 = fibCheck3; //fibCheck1 becomes fibCheck3 which was previously fibCheck2 before it changed//
        }
        return false;
    }

    /**
     * Gives us the number of unique letters shared by at least two words.
     * @param word1 The first word.
     * @param word2 The second word.
     * @param word3 The third word.
     * @return Returns the number of unique letters shared by at least two words.
     */
    public static int stringUnion(String word1, String word2, String word3)
    {
        int letShared = 0;                                 //Keeps track of how many letters are shared//
        int aNum = 0;    //Each (letter)Num keeps track how many times the letter has appeared in the three words//
        int bNum = 0;
        int cNum = 0;
        int dNum = 0;
        int eNum = 0;
        int fNum = 0;
        int gNum = 0;
        int hNum = 0;
        int iNum = 0;
        int jNum = 0;
        int kNum = 0;
        int lNum = 0;
        int mNum = 0;
        int nNum = 0;
        int oNum = 0;
        int pNum = 0;
        int qNum = 0;
        int rNum = 0;
        int sNum = 0;
        int tNum = 0;
        int uNum = 0;
        int vNum = 0;
        int wNum = 0;
        int xNum = 0;
        int yNum = 0;
        int zNum = 0;
        int zeroNum = 0;
        int oneNum = 0;
        int twoNum = 0;
        int threeNum = 0;
        int fourNum = 0;
        int fiveNum = 0;
        int sixNum = 0;
        int sevenNum = 0;
        int eightNum = 0;
        int nineNum = 0;
        if (word1.contains("a")) {                  //Checks for every single letter//
                aNum++;                                 //If a letter is found (letter)Num goes up.//
            }
            if (word1.contains("b")) {
                bNum++;
            }
            if (word1.contains("c")) {
                cNum++;
            }
            if (word1.contains("d")) {
                dNum++;
            }
            if (word1.contains("e")) {
                eNum++;
            }
            if (word1.contains("f")) {
                fNum++;
            }
            if (word1.contains("g")) {
                gNum++;
            }
            if (word1.contains("h")) {
                hNum++;
            }
            if (word1.contains("i")) {
                iNum++;
            }
            if (word1.contains("j")) {
                jNum++;
            }
            if (word1.contains("k")) {
                kNum++;
            }
            if (word1.contains("l")) {
                lNum++;
            }
            if (word1.contains("m")) {
                mNum++;
            }
            if (word1.contains("n")) {
                nNum++;
            }
            if (word1.contains("o")) {
                oNum++;
            }
            if (word1.contains("p")) {
                pNum++;
            }
            if (word1.contains("q")) {
                qNum++;
            }
            if (word1.contains("r")) {
                rNum++;
            }
            if (word1.contains("s")) {
                sNum++;
            }
            if (word1.contains("t")) {
                tNum++;
            }
            if (word1.contains("u")) {
                uNum++;
            }
            if (word1.contains("v")) {
                vNum++;
            }
            if (word1.contains("w")) {
                wNum++;
            }
            if (word1.contains("x")) {
                xNum++;
            }
            if (word1.contains("y")) {
                yNum++;
            }
            if (word1.contains("z")) {
                zNum++;
            }
            if (word1.contains("0")) {
                zeroNum++;
            }
            if (word1.contains("1")) {
                oneNum++;
            }
            if (word1.contains("2")) {
                twoNum++;
            }
            if (word1.contains("3")) {
                threeNum++;
            }
            if (word1.contains("4")) {
                fourNum++;
            }
            if (word1.contains("5")) {
                fiveNum++;
            }
            if (word1.contains("6")) {
                sixNum++;
            }
            if (word1.contains("7")) {
                sevenNum++;
            }
            if (word1.contains("8")) {
                eightNum++;
            }
            if (word1.contains("9")) {
                nineNum++;
            }

            if (word2.contains("a")) {
                aNum++;
            }
            if (word2.contains("b")) {
                bNum++;
            }
            if (word2.contains("c")) {
                cNum++;
            }
            if (word2.contains("d")) {
                dNum++;
            }
            if (word2.contains("e")) {
                eNum++;
            }
            if (word2.contains("f")) {
                fNum++;
            }
            if (word2.contains("g")) {
                gNum++;
            }
            if (word2.contains("h")) {
                hNum++;
            }
            if (word2.contains("i")) {
                iNum++;
            }
            if (word2.contains("j")) {
                jNum++;
            }
            if (word2.contains("k")) {
                kNum++;
            }
            if (word2.contains("l")) {
                lNum++;
            }
            if (word2.contains("m")) {
                mNum++;
            }
            if (word2.contains("n")) {
                nNum++;
            }
            if (word2.contains("o")) {
                oNum++;
            }
            if (word2.contains("p")) {
                pNum++;
            }
            if (word2.contains("q")) {
                qNum++;
            }
            if (word2.contains("r")) {
                rNum++;
            }
            if (word2.contains("s")) {
                sNum++;
            }
            if (word2.contains("t")) {
                tNum++;
            }
            if (word2.contains("u")) {
                uNum++;
            }
            if (word2.contains("v")) {
                vNum++;
            }
            if (word2.contains("w")) {
                wNum++;
            }
            if (word2.contains("x")) {
                xNum++;
            }
            if (word2.contains("y")) {
                yNum++;
            }
            if (word2.contains("z")) {
                zNum++;
            }
            if (word2.contains("0")) {
                zeroNum++;
            }
            if (word2.contains("1")) {
                oneNum++;
            }
            if (word2.contains("2")) {
                twoNum++;
            }
            if (word2.contains("3")) {
                threeNum++;
            }
            if (word2.contains("4")) {
                fourNum++;
            }
            if (word2.contains("5")) {
                fiveNum++;
            }
            if (word2.contains("6")) {
                sixNum++;
            }
            if (word2.contains("7")) {
                sevenNum++;
            }
            if (word2.contains("8")) {
                eightNum++;
            }
            if (word2.contains("9")) {
                nineNum++;
            }

            if (word3.contains("a")) {
                aNum++;
            }
            if (word3.contains("b")) {
                bNum++;
            }
            if (word3.contains("c")) {
                cNum++;
            }
            if (word3.contains("d")) {
                dNum++;
            }
            if (word3.contains("e")) {
                eNum++;
            }
            if (word3.contains("f")) {
                fNum++;
            }
            if (word3.contains("g")) {
                gNum++;
            }
            if (word3.contains("h")) {
                hNum++;
            }
            if (word3.contains("i")) {
                iNum++;
            }
            if (word3.contains("j")) {
                jNum++;
            }
            if (word3.contains("k")) {
                kNum++;
            }
            if (word3.contains("l")) {
                lNum++;
            }
            if (word3.contains("m")) {
                mNum++;
            }
            if (word3.contains("n")) {
                nNum++;
            }
            if (word3.contains("o")) {
                oNum++;
            }
            if (word3.contains("p")) {
                pNum++;
            }
            if (word3.contains("q")) {
                qNum++;
            }
            if (word3.contains("r")) {
                rNum++;
            }
            if (word3.contains("s")) {
                sNum++;
            }
            if (word3.contains("t")) {
                tNum++;
            }
            if (word3.contains("u")) {
                uNum++;
            }
            if (word3.contains("v")) {
                vNum++;
            }
            if (word3.contains("w")) {
                wNum++;
            }
            if (word3.contains("x")) {
                xNum++;
            }
            if (word3.contains("y")) {
                yNum++;
            }
            if (word3.contains("z")) {
                zNum++;
            }
            if (word3.contains("0")) {
                zeroNum++;
            }
            if (word3.contains("1")) {
                oneNum++;
            }
            if (word3.contains("2")) {
                twoNum++;
            }
            if (word3.contains("3")) {
                threeNum++;
            }
            if (word3.contains("4")) {
                fourNum++;
            }
            if (word3.contains("5")) {
                fiveNum++;
            }
            if (word3.contains("6")) {
                sixNum++;
            }
            if (word3.contains("7")) {
                sevenNum++;
            }
            if (word3.contains("8")) {
                eightNum++;
            }
            if (word3.contains("9")) {
                nineNum++;
            }
        if (aNum >= 2)     //If the letter has appeared at least 2 times in two different words letShared increases.//
        {
            letShared++;
        }
        if (bNum >= 2)
        {
            letShared++;
        }
        if (cNum >= 2)
        {
            letShared++;
        }
        if (dNum >= 2)
        {
            letShared++;
        }
        if (eNum >= 2)
        {
            letShared++;
        }
        if (fNum >= 2)
        {
            letShared++;
        }
        if (gNum >= 2)
        {
            letShared++;
        }
        if (hNum >= 2)
        {
            letShared++;
        }
        if (iNum >= 2)
        {
            letShared++;
        }
        if (jNum >= 2)
        {
            letShared++;
        }
        if (kNum >= 2)
        {
            letShared++;
        }
        if (lNum >= 2)
        {
            letShared++;
        }
        if (mNum >= 2)
        {
            letShared++;
        }
        if (nNum >= 2)
        {
            letShared++;
        }
        if (oNum >= 2)
        {
            letShared++;
        }
        if (pNum >= 2)
        {
            letShared++;
        }
        if (qNum >= 2)
        {
            letShared++;
        }
        if (rNum >= 2)
        {
            letShared++;
        }
        if (sNum >= 2)
        {
            letShared++;
        }
        if (tNum >= 2)
        {
            letShared++;
        }
        if (uNum >= 2)
        {
            letShared++;
        }
        if (vNum >= 2)
        {
            letShared++;
        }
        if (wNum >= 2)
        {
            letShared++;
        }
        if (xNum >= 2)
        {
            letShared++;
        }
        if (yNum >= 2)
        {
            letShared++;
        }
        if (zNum >= 2)
        {
            letShared++;
        }
        if (zeroNum >= 2)
        {
            letShared++;
        }
        if (oneNum >= 2)
        {
            letShared++;
        }
        if (twoNum >= 2)
        {
            letShared++;
        }
        if (threeNum >= 2)
        {
            letShared++;
        }
        if (fourNum >= 2)
        {
            letShared++;
        }
        if (fiveNum >= 2)
        {
            letShared++;
        }
        if (sixNum >= 2)
        {
            letShared++;
        }
        if (sevenNum >= 2)
        {
            letShared++;
        }
        if (eightNum >= 2)
        {
            letShared++;
        }
        if (nineNum >= 2)
        {
            letShared++;
        }
        return letShared;
    }
}
