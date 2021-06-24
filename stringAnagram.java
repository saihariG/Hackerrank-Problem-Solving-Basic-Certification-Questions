import java.util.*;

public class stringAnagram {
    /*** Given 2 arrays of Strings check the total no of Anagrams found in the dictionary list for each String in query list
     *
     *   Eg Input : dictionary -> ['heater', 'cold', 'clod', 'reheat', 'dolc']
     *        query -> ['codl', 'heatre', 'abcd']
     *
     *   Eg Output: 3 2 0
     *
     *  Explanation : 'codl' in query[0] has three anagrams in dictionary list such as 'cold', 'clod', 'dolc'
     *               'heatre' in query[1] has two anagrams in dictionary list such as 'heater', 'reheat'
     *                'abcd' in query[2] has zero anagrams in dictionary list
     * ***/

    /*** Time Complexity : O(m+n) ***/

    public static List<Integer> StringAnagram(List<String> dictionary, List<String> query) {

        // list for storing the answer
        List<Integer> answer = new ArrayList<>();
        // hasMap to count the no of occurrence of each String in dictionary list
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < dictionary.size() ; i++) {
            //  getting the first string in dictionary list
            String word = dictionary.get(i);
            // converting the string into character array and sorting it
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            // storing the Sorted word array in a String
            word = Arrays.toString(wordArr);

            // if map already contains the string , then increment its occurrence
            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            }else { // if String is not there , then it is its first occurrence
                map.put(word,1);
            }

        }

        // iterating through the query list
        for(int i = 0 ; i < query.size() ; i++) {
            //  getting the first string in dictionary list
            String queri = query.get(i);
            // converting the string into character array and sorting it
            char[] qArr = queri.toCharArray();
            Arrays.sort(qArr);
            // storing the Sorted word array in a String
            queri = Arrays.toString(qArr);

            if(map.containsKey(queri)) {
                int count = map.get(queri);
                answer.add(count);
            }else {
                answer.add(0);
            }
        }

        return answer;

    }

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);

        int dictionaryCount = sc.nextInt();

        List<String> dictionary = new ArrayList<>();
        for(int i = 0 ; i < dictionaryCount ; i++) {
            dictionary.add(sc.next());
        }
        int queryCount = sc.nextInt();

        List<String> query = new ArrayList<>();
        for(int i = 0 ; i < queryCount ; i++) {
            query.add(sc.next());
        }

        List<Integer> result = StringAnagram(dictionary, query);

        for(int i = 0 ; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }


}
