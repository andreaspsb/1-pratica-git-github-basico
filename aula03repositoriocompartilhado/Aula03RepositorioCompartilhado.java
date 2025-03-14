import java.util.ArrayList;

public class Aula03RepositorioCompartilhado {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(Aula03RepositorioCompartilhado.hasRepeat(l));
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
}
