package LinearSearch;

public class Main {
    public static void main(String[] args){
        int[] myarray = {20,1,30,-15,34,-90};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(myarray,-15));
        System.out.println(linearSearch.search(myarray,2000));

    }
}
