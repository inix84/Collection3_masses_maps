package HW3_1_2Product;
public class RecipeException extends RuntimeException{
    public RecipeException() {
    }
    public RecipeException(String message) {
        super(message);
    }
}