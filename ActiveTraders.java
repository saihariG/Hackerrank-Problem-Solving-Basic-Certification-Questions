import java.util.*;


public class ActiveTraders {

    /*** Given a list of String representing the trades of customers , return a list of customers who made at least 5% of the total sales in a sorted order
     *
     *   Eg Input : customers -> ['alpha', 'beta', 'omega', 'omega', 'alpha' ]
     *   Eg Output : answer  -> ['alpha', 'beta','omega'] NOTE : returned list is in sorted alphabetical order
     *
     *   Here alpha occurs 2 times out of 5 so alpha's contribution = 2 / 5(size of customers list) * 100 = 40%
     *   Here beta occurs 1 times out of 5 so beta's contribution = 1 / 5(size of customers list) * 100 = 20%
     *   Here omega occurs 2 times out of 5 so omega's contribution = 2 / 5(size of customers list) * 100 = 40%
     *
     *   so every items contributed more than 5% so add them to result list if not dont add
     * ***/

    public static List<String> mostActive(List<String> customers) {
        // list for storing the answer
        List<String> answer = new ArrayList<>();
        // hasMap to count the no of occurrence of each String
        Map<String,Integer> map = new HashMap<>();
        int noOfTrades = customers.size();

        for(int i = 0 ; i < noOfTrades ; i++) {
            String item = customers.get(i);
            if(map.containsKey(item)) { // if map already contains the string , then increment its occurrence
                map.put(item , map.get(item) + 1);
            }else { // if String is not there , then it is its first occurrence
                map.put(item, 1);
            }
        }

        for (Map.Entry<String , Integer> entry : map.entrySet()) {  // Iterate through HashMap
            String key = entry.getKey();

            float value =(float) entry.getValue(); // typecasting integer to float

            float n = (float) noOfTrades;
            float d = (float) (100.0 / n);
            float percentage = d * value;
            System.out.println(percentage); // use for debugging

            if(percentage >= 5.0) { // if percentage > 5 add to result list
                answer.add(key);
            }

        }

        // sort the list in alphabetical order
        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int customersCount = sc.nextInt();

        List<String> customers = new ArrayList<>();

        for(int i = 0 ; i < customersCount ; i++) {
            customers.add(sc.next());
        }


        List<String> result = mostActive(customers);

        for(int i = 0 ; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }



}
