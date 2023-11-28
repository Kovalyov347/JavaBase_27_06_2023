package ua.hillel.kovalyov.homeworks;

public class Interface {
    interface Smartphones {
        void call();

        void sms();

        void internet();
    }

    class Androids implements Smartphones {
        @Override
        public void call() {
            System.out.println("Calling from an Android phone");
        }

        @Override
        public void sms() {
            System.out.println("Sending SMS from an Android phone");
        }

        @Override
        public void internet() {
            System.out.println("Browsing the internet on an Android phone");
        }

        void linuxOS() {
            System.out.println("Running on Linux OS");
        }
    }

    class iPhones implements Smartphones {
        @Override
        public void call() {
            System.out.println("Calling from an iPhone");
        }

        @Override
        public void sms() {
            System.out.println("Sending SMS from an iPhone");
        }

        @Override
        public void internet() {
            System.out.println("Browsing the internet on an iPhone");
        }

        void iOS() {
            System.out.println("Running on iOS");
        }
    }
}
