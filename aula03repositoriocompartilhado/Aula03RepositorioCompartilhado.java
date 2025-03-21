import java.util.ArrayList;

public class Aula03RepositorioCompartilhado {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(10);
        System.out.println(Aula03RepositorioCompartilhado.hasRepeat(l));

        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l2.add(10);
        l2.add(5);
        l2.add(3);

        
        System.out.println("UNION: \n");
        printArray(union(l, l2));
        System.out.println("INTERSECT: \n");
        printArray(intersect(l,l2));
    }

    
    public static boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) == l.get(j)) {
                    return true;
                }
            } 
        }

        return false;
    }

    public ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repeated = new ArrayList<>();
        
        for (int i = 0; i < l.size(); i++) {
            Integer current = l.get(i);
            

            if (!repeated.contains(current)) {
                int count = 0;
                for (int j = 0; j < l.size(); j++) {
                    if (l.get(j).equals(current)) {
                        count++;
                    }
                }
            
                if (count > 1) {
                    repeated.add(current);
                }
            }
        }
        
        return repeated;
    } 

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList <Integer> union = l1; 
        for (int i = 0; i < l2.size(); i++){
            union.add(l2.get(i));
        }
        return union;

    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for (Integer num1 : l1) {
            if (l2.contains(num1)) {
                if (!intersection.contains(num1)) {
                    intersection.add(num1); 
                }
            }
        }
        
        return intersection;
    }

    public static void printArray(ArrayList<Integer> l){
        for(Integer num : l){
            System.out.println(num);
        }
    }

}
