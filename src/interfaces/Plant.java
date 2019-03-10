package interfaces;

public interface Plant extends Being {
    @Override
    default boolean isAlive() {
        if(getAge() < 1000){
            return true;
        }else
            return false;
    }
}
