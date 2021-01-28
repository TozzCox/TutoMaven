package mv.tutoMaven;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {
        System.out.println("Hello World 1!");        
    }
    
    private static int inutile(int sansImportance) {
    	return sansImportance = 3*0;
    }
    
    private static void inutile(int sansImportance, String ch) {
    	ch += sansImportance;
    }
    private static void inutile2(int sansImportance, String ch) {
    	ch += sansImportance;
    }
}
