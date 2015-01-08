package mohsen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Grammar {
    private HashMap<String, HashSet<String>> products;
    private String firstState;

    public Grammar(String firstState) {
        this.firstState = firstState;
        products = new HashMap<String, HashSet<String>>();
    }

    /**
     * adds a product to grammar
     *
     * @param product enter like this pattern : S->AB|a
     */
    public void addProduct(String product) {
        String[] strings = product.split("->");
        String key = strings[0];
        HashSet<String> values;
        if (products.containsKey(key))
            values = products.get(key);
        else{
            values = new HashSet<String>();
            products.put(key,values);
        }
        String[] newValues = strings[1].split("\\|");
        for (String s : newValues)
            values.add(s);
    }

    /**
     * 'product' will be deleted
     *
     * @param generator non-terminal
     * @param product   non-terminal or terminal
     */
    public void removeProduct(String generator, String product) {
        for (Map.Entry<String, HashSet<String>> entry : products.entrySet()) {
            if (entry.getKey().equals(generator)) {
                entry.getValue().remove(product);
                return;
            }
        }
    }

    /**
     *
     * @param product
     * @return a list of generators. if key not found returns null.
     */
    public ArrayList<String> getGenerators(String product) {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, HashSet<String>> entry : products.entrySet()) {
            HashSet<String> prod = entry.getValue();
            for (String s : prod) {
                if (s.equals(product))
                    result.add(entry.getKey());
            }
        }

        return (result.size() > 0) ? result : null;
    }


    public ArrayList<String> getAllVariables(){
        ArrayList<String> vars = new ArrayList<String>();
        for (Map.Entry<String, HashSet<String>> entry : products.entrySet()) {
            vars.add(entry.getKey());
        }

        return vars;
    }

    public String getFirstState() {
        return firstState;
    }
}
