
package Stock;


public class main {
    
    public static void main(String[] args) {
        
      Stock s1= new Stock("ORCL","Oracle Corporation");
      s1.currentPrice=34.35;
      s1.previousClosingPrice=34.35;
      
      System.out.println(" ismi" + s1.symbol);
      System.out.println(" sembolü" + s1.name);
      
      
      
    System.out.println("Hissenin yüzde değişimi:" + s1.getChangePercent());
    }
    
    
}
