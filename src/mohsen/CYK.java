package mohsen;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CYK {
    Grammar grammar;


    public CYK(Grammar grammar) {
        this.grammar = grammar;
    }

    public Result canGenerate(String statement) {
        HashSet[][] matrix = new HashSet[statement.length()][statement.length()];
        char[] statementArray = statement.toCharArray();

        /**
         * Initializes the matrix sets
         */
        for (int i = 0; i < statement.length(); i++)
            for (int j = 0; j < statement.length(); j++)
                matrix[i][j] = new HashSet();

        //
        for (int i = 0; i < statement.length(); i++) {
            ArrayList<String> gens = grammar.getGenerators(statementArray[i] + "");
            if (gens != null)
                for (String s : gens)
                    matrix[i][i].add(s);
        }

        for (int step = 1; step < statement.length(); step++) {
            int i = 0;
            for (int j = step; j < statement.length(); j++) {
                for (int k = i; k < j; k++) {
                    Set<String> muls = multiplySets(matrix[i][k],matrix[k+1][j]);
                    for (String s : muls){
                        ArrayList<String> gens = grammar.getGenerators(s);
                        if(gens != null)
                            for (String s2 : gens) {
                                matrix[i][j].add(s2);
                            }
                    }
                }
                i++;
            }
        }


        boolean status = matrix[0][statement.length() - 1].contains(grammar.getFirstState());
        return new Result(matrix,status);
    }

    private HashSet<String> multiplySets(HashSet<String> first, HashSet<String> second){
        HashSet<String> result = new HashSet<String>();
        for (Object s1 : first)
            for (Object s2 : second)
                result.add((String)s1 + (String)s2);
        return result;
    }
}
