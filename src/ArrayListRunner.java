import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);

        System.out.println("-----------------");

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);

        System.out.println("-----------------");

        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        ArrayListAlgorithms.replaceWithCaps(stringList2);
        System.out.println(stringList2);

        ArrayList<String> stringList12 = new ArrayList<String>(Arrays.asList("yes", "pass", "buts", "Mets", "Yankees"));
        ArrayListAlgorithms.replaceWithCaps(stringList12);
        System.out.println(stringList12);

        ArrayList<String> stringList13 = new ArrayList<String>(Arrays.asList("yeah", "pat", "but", "Met", "Yankee"));
        ArrayListAlgorithms.replaceWithCaps(stringList13);
        System.out.println(stringList13);

        System.out.println("-----------------");

        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int index = ArrayListAlgorithms.indexOfMinimum(intList4);
        System.out.println(index);
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(6, 8, 3, 5, 6, 3, 2, 3, 2));
        index = ArrayListAlgorithms.indexOfMinimum(intList5);
        System.out.println(index);
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(10, 12, 9, 9, 8));
        index = ArrayListAlgorithms.indexOfMinimum(intList6);
        System.out.println(index);

        System.out.println("-----------------");

        ArrayList<Integer> intList7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList9 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6));
        ArrayList<Integer> intList10 = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 4, 6));
        boolean identical = ArrayListAlgorithms.areIdentical(intList7, intList8);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList8, intList9);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList9, intList10);
        System.out.println(identical);

        System.out.println("-----------------");

        ArrayList<Integer> intList11 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayListAlgorithms.removeOdds(intList11);
        System.out.println(intList11);
        ArrayList<Integer> intList12 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayListAlgorithms.removeOdds(intList12);
        System.out.println(intList12);
        ArrayList<Integer> intList13 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayListAlgorithms.removeOdds(intList13);
        System.out.println(intList13);

        System.out.println("-----------------");

        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("these", "sly", "words", "pork", "ugly", "you", "contains", "umm", "by", "several", "sky", "words", "psh", "apple"));
        ArrayListAlgorithms.wackyVowels(stringList3);
        System.out.println(stringList3);

        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("sly", "ugly", "umm", "psh"));
        ArrayListAlgorithms.wackyVowels(stringList4);
        System.out.println(stringList4);

        ArrayList<String> stringList5 = new ArrayList<String>(Arrays.asList("these", "words", "pork", "contains"));
        ArrayListAlgorithms.wackyVowels(stringList5);
        System.out.println(stringList5);

        System.out.println("-----------------");

        ArrayList<Integer> intList14 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 4, 5, 2, 2, 1, 6, 4, 4, 7, 1, 8, 4, 2));
        ArrayListAlgorithms.removeDuplicates(intList14);
        System.out.println(intList14);
        ArrayList<Integer> intList15 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 1, 1, 1, 1, 3, 2, 1, 2, 2, 4, 3));
        ArrayListAlgorithms.removeDuplicates(intList15);
        System.out.println(intList15);
        ArrayList<Integer> intList16 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListAlgorithms.removeDuplicates(intList16);
        System.out.println(intList16);


    }
}
