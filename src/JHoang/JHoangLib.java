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
        int location = mainStr.indexOf(subStr);
        {
            if (location > 0)                                       // If the subStr is found in the the middle.//
            {
                String partOne = mainStr.substring(0, location);     //Cuts mainStr into 2 parts and reconnects them.//
                String partTwo = mainStr.substring(location + 1);
                String part = partOne + partTwo;
                return part;
            }
            else                                             //If the subStr is found is in the beginning of mainStr.//
            {
                String part = mainStr.substring(location + 1);
                return  part;
            }
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
        for (int x = 0; x < word1.length() - 1; x++)   //Goes through the entire word//
        {
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
        }
        for (int x = 0; x < word2.length() - 1; x++)
        {
            if (word1.contains("a")) {
                aNum++;
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
        }
        for (int x = 0; x < word3.length() - 1; x++)
        {
            if (word1.contains("a")) {
                aNum++;
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
        return letShared;
    }
}
