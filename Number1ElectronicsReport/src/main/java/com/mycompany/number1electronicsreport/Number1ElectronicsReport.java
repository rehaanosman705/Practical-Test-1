

package com.mycompany.number1electronicsreport;


public class Number1ElectronicsReport {

    public static void main(String[] args) {
        
        //single dimentional arrays
        
        String[] cities = { "Cape Town", "Port Elizabeth", "Pretoria"
        };

        String [] consoles = { "PS5", "XBOX", "SWITCH"

        };
        
        int total = 0;
        
        //2 dimentional arrays
        
        int [][]sales = { {1000, 2000, 3000},
                          {2000, 3000, 4000},
                          {1500, 1100, 1200}};
        
        System.out.println("----------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------");
        
        // printing colums
        
       System.out.printf("%-15s", "");
        for (String console : consoles) {
            System.out.printf("%-8s", console);
        }
        System.out.println();

        //nested for loop
        
              for (int i = 0; i < sales.length; i++) {
                  
                  System.out.printf("%-15s", cities [i]);
                  
                              for (int j = 0; j < sales[i].length; j++) {

                System.out.printf("%-8d", sales[i][j]);

                //calculations of total sales
                
                                  total += sales[i][j];
                
                
                
                              }
                  
              }
            
                    System.out.println();
                    
                    //printing statistics 
                    
                    System.out.println("------------------------");
                    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
                    System.out.println("------------------------");
                    System.out.println("Cape Town" + sales);
                    System.out.println("Port Elizabrth" + sales);
                    System.out.println("Pretoria" + sales);
        
    }
    
    
    
}
