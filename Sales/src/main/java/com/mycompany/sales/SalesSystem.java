
package com.mycompany.sales;

import java.util.Scanner;

public class SalesSystem {

    public class Agent {
        String name;
        double[] sales;

        public Agent(String name, double[] sales) {
            this.name = name;
            this.sales = sales;
        }
        public double calculateAverageSales() {
            double sum = 0;
            for (double sale : sales) {
                sum += sale;
            }
            return sum / sales.length;
        }
    }

    public class SalesCalculator {
        private Agent[] agents;
        private Scanner scanner;

        public SalesCalculator(int numAgents) {
            agents = new Agent[numAgents];
            scanner = new Scanner(System.in);
        }

        public void gatherAgentData() {
            for (int i = 0; i < agents.length; i++) {
                System.out.print("Enter name of agent " + (i + 1) + ": ");
                String name = scanner.nextLine(); 

                System.out.print("Enter the number of sales records for " + name + ": ");
                int numSales = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println("Number of sales records entered: " + numSales);
                double[] sales = new double[numSales];

                System.out.println("Enter sales records:");
                for (int j = 0; j < numSales; j++) {
                    System.out.print("Enter sale #" + (j + 1) + ": ");
                    if (scanner.hasNextDouble()) {
                        sales[j] = scanner.nextDouble();
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next();
                        j--;
                    }
                }
                scanner.nextLine(); 

                agents[i] = new Agent(name, sales);
                System.out.println("Agent " + name + " added.");
            }
        }

        public void displayAverageSales() {
            for (int i = 0; i < agents.length; i++) {
                System.out.println(agents[i].name + "'s average sales: " + agents[i].calculateAverageSales());
            }
        }

        public Agent getTopAgent() {
            double highestSales = 0;
            Agent topAgent = null;

            for (int i = 0; i < agents.length; i++) {
                double avgSales = agents[i].calculateAverageSales();
                if (avgSales > highestSales) {
                    highestSales = avgSales;
                    topAgent = agents[i];
                }
            }
            return topAgent;
        }
    }
}

