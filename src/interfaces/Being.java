package interfaces;

public interface Being {
    int getAge();
    int MAX_AGE = 100;

    default boolean isAlive(){
        if(getAge() < MAX_AGE){
            return true;
        }else
            return false;

    }
}
