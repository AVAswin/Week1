import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    void prepareMeal();
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing Vegetarian Meal: Grilled Paneer with Quinoa.");
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing Vegan Meal: Tofu Stir Fry with Brown Rice.");
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing Keto Meal: Zucchini Noodles with Avocado Sauce.");
    }

    @Override
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing High-Protein Meal: Chicken Breast with Lentils.");
    }

    @Override
    public String getMealType() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public void showMeals() {
        for (T meal : mealList) {
            System.out.print(meal.getMealType() + " -> ");
            meal.prepareMeal();
        }
    }
}

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePersonalizedPlan(T meal) {
        System.out.println("Generating Meal Plan for: " + meal.getMealType());
        meal.prepareMeal();
    }
}   

public class MealPlanManager {
    public static void main(String[] args) {
        // Creating meal objects
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Using generic Meal class
        Meal<VegetarianMeal> vegMeals = new Meal<>();
        vegMeals.addMeal(vegMeal);

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(veganMeal);

        Meal<KetoMeal> ketoMeals = new Meal<>();
        ketoMeals.addMeal(ketoMeal);

        Meal<HighProteinMeal> highProteinMeals = new Meal<>();
        highProteinMeals.addMeal(highProteinMeal);

        // Display meals
        System.out.println("=== All Meals ===");
        vegMeals.showMeals();
        veganMeals.showMeals();
        ketoMeals.showMeals();
        highProteinMeals.showMeals();

        // Use Generic Method to Generate Personalized Meal
        System.out.println("\n=== Personalized Meal Plan ===");
        MealPlanGenerator.generatePersonalizedPlan(new KetoMeal());
        MealPlanGenerator.generatePersonalizedPlan(new VeganMeal());
    }
}

