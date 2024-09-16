
package com.mycompany.sales;

import java.util.Scanner;

public class Sales {

 public static void main(String[] args) {
        System.out.print("Enter the number of agents: ");
        Scanner scanner = new Scanner(System.in);
        int numAgents = scanner.nextInt();

        SalesSystem salesSystem = new SalesSystem();
        SalesSystem.SalesCalculator salesCalculator = salesSystem.new SalesCalculator(numAgents); 

        salesCalculator.gatherAgentData(); 
        salesCalculator.displayAverageSales();  

        SalesSystem.Agent topAgent = salesCalculator.getTopAgent(); 
        System.out.println("Agent with the highest average sales is " 
                            + topAgent.name + " with an average sale of " 
                            + topAgent.calculateAverageSales());
    }
}

