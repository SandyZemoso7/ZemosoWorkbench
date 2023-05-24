public class ExceptionThrower {
    public void throwExceptions() throws CustomException1, CustomException2, CustomException3{
        throw new NullPointerException("null pointer exception");
    }
}
