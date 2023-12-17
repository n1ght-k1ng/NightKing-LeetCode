import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class FoodRatings {

//     HashMap<String, Integer> FR = new HashMap<>();
//     HashMap<String, List<String>> CF = new HashMap<>();

//     public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
//         for (int i = 0; i < foods.length; i++) {
//             FR.put(foods[i], ratings[i]);

//             CF.computeIfAbsent(cuisines[i], k -> new ArrayList<>()).add(foods[i]);
//         }
//     }

//     public void changeRating(String food, int newRating) {
//         FR.put(food, newRating);
//     }

//     public String highestRated(String cuisine) {
//         List<String> foodList = CF.get(cuisine);
//         int max = -1;
//         List<String> highestRatedFoods = new ArrayList<>();

//         for (String food : foodList) {
//             int rating = FR.get(food);

//             if (rating > max) {
//                 max = rating;
//                 highestRatedFoods.clear();
//                 highestRatedFoods.add(food);
//             } else if (rating == max) {
//                 highestRatedFoods.add(food);
//             }
//         }

//         Collections.sort(highestRatedFoods);
//         return highestRatedFoods.get(0);
//     }
// }  -- FAILS !! (TLE)

HashMap<String, PriorityQueue<Food>> x = new HashMap<>();
HashMap<String, Food> menu = new HashMap<>();

public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
    for(int i=0; i<foods.length; i++){
		Food curr = new Food(foods[i], cuisines[i], ratings[i]);
        x.putIfAbsent(cuisines[i], new PriorityQueue<>((a,b)->
            b.rating==a.rating ? a.name.compareTo(b.name) : b.rating-a.rating));
		PriorityQueue<Food> pq = x.get(cuisines[i]);
        pq.add(curr);
        menu.put(foods[i], curr);
    }
}

public void changeRating(String food, int newRating) {
    Food curr = menu.get(food);
    PriorityQueue<Food> pq = x.get(curr.cuisine);
    pq.remove(curr);
    curr.rating = newRating;
    pq.add(curr);
}

public String highestRated(String cuisine) {
    return x.get(cuisine).peek().name;
}

class Food{
    int rating;
    String name, cuisine;
    Food(String name, String cuisine, int rating){
        this.name = name; this.rating = rating; this.cuisine = cuisine;
    }
}}
/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */