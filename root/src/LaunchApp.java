public class LaunchApp {

    private final static String userName = System.getProperty("user.name");
    /**
    * Entry point to run specific part of the app.
    *
    */
    public static void main(String[] args) {
        try {
            Runner.runGenerics(userName);

        } catch (IncompatibleTypeException e) {
            System.out.println("Error Occured. Exception: IncompatibleTypeException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error Occured. Exception: Exception");
            e.printStackTrace();
        }

    }



}
