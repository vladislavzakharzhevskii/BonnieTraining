import hash.SetAddTester;

public class Runner {

    protected static void runGenerics(String userName) throws IncompatibleTypeException {
        GenericRunner runner = new GenericRunner();
        runner.run(userName, GenericRunner.class);
    }

    protected static void runTestsFunc() {
        SetAddTester.testUp();
    }

}
