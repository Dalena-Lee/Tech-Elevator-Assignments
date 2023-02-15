package com.techelevator;

public class Exercise01_StoreOrders {

    /*
    Sally's Pizza is bringing its pizza ordering system into the digital age
    to get better customer insights.

    They've encoded each of Sally's pizzas and other dishes as an integer:
	 * 10: small, cheese       20: medium, cheese       30: large, cheese
	 * 11: small, pepperoni    21: medium, pepperoni    31: large, pepperoni
	 * ---
	 * 40: calzone
	 * 41: spaghetti pie
	 * 42: baked ziti
     */

    // You can use these constants in your solutions.
    private final int SMALL_CHEESE = 10;
    private final int SMALL_PEPPERONI = 11;

    private final int MEDIUM_CHEESE = 20;
    private final int MEDIUM_PEPPERONI = 21;

    private final int LARGE_CHEESE = 30;
    private final int LARGE_PEPPERONI = 31;

    private final int CALZONE = 40;
    private final int SPAGHETTI_PIE = 41;
    private final int BAKED_ZITI = 42;

    /*
    Each customer order, consisting of one or more pizzas, is represented as an array
    where each value represents an item in that order.

    Create an "order" that contains the following items:
	 * - small, cheese (SMALL_CHEESE)
	 * - calzone (CALZONE)
	 * - large, pepperoni (LARGE_PEPPERONI)
	 * - spaghetti pie (SPAGHETTI_PIE)

	 Examples:
	 createOrder() → [10, 40, 31, 41]
     */
    public int[] createOrder() {
        return new int[] {SMALL_CHEESE, CALZONE, LARGE_PEPPERONI, SPAGHETTI_PIE};
    }

    /*
    Sally realized that she needed to know how many calzones her shop sells per day.

    Implement the logic to count the number of calzones sold per day when given an
    array representing each item that her customers ordered that day.

    Examples:
    getCalzoneSales([40, 30, 31, 40, 10]) → 2
    getCalzoneSales([30, 31, 10]) → 0
    getCalzoneSales([]) → 0
     */
    public int getCalzoneSales(int[] orders) {
        int numberOfCalzonesInOrder = 0;

        for (int i = 0; i < orders.length; i++) {
            int eachItem = orders[i];

            if (eachItem == CALZONE) {
                //Increase count of calzones
                numberOfCalzonesInOrder += 1;
            }
        }
        return numberOfCalzonesInOrder;
    }

    /*
    Sally also needs to know the total revenue for all cheese pizzas sold on any given day.
        * Each small cheese pizza costs $8.
        * Each medium cheese pizza costs $11.
        * Each large cheese pizza costs $14.

    Implement the logic to return the total revenue of all cheese pizzas when given
    an array representing each item that her customers ordered that day.

    Examples:
    getCheesePizzaRevenue([10]) → 8
    getCheesePizzaRevenue([10, 11, 20]) → 19
    getCheesePizzaRevenue([11, 21]) → 0
     */
    public int getCheesePizzaRevenue(int[] orders) {
        //1. Go through all the items in the order.
        int revenue = 0;

        for(int i = 0; i < orders.length; i++) {
            int eachItem = orders[i];
            //2. Check if the item is a cheese pizza.
            if (eachItem == SMALL_CHEESE) {
                //3. If the item is a small cheese pizza, add $8 to my total revenue.
                revenue += 8;
            }
            //4. If the item is a medium cheese pizza, add $11 to my total revenue.
            if (eachItem == MEDIUM_CHEESE) {
                revenue += 11;
            }
            //5. If the item is a large cheese pizza, add $14 to my total revenue.
            if (eachItem == LARGE_CHEESE) {
                revenue += 14;
            }
        }
        //6. Return the total revenue.
        return revenue;
    }
}
