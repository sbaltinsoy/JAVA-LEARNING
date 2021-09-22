public class Main {

    public static void main(String[] args) {
     /*   EmailLogger logger = new EmailLogger();
        logger.Log("Log Mesaji !");


        DatabaseLogger logger1 = new DatabaseLogger();
        logger1.Log("Sa");*/

/*        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

        for(BaseLogger logger:loggers){
            logger.Log("Log Mesaji: ");
        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}