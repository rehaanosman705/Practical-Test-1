
package com.mycompany.console;


public abstract class Consoles implements IConsole{
    
    
    
    private String ConsoleDeviceType;
    private String Name;
    private int TotalSales;
    
    //constructor
        public Consoles(String inConsoleDeviceType, int inTotalSales, String inName) {
        this.ConsoleDeviceType = inConsoleDeviceType;
        this.Name = inName;
        this.TotalSales = inTotalSales;
    }

    
        // Getter 
    public String getConsoleType() {
        return ConsoleDeviceType;
    }

    // Getter for time to make
    public int getTotalSales() {
        return TotalSales;
    }

    // Getter for difficulty level
    public String getStore() {
        return Name;
    }

    
}
