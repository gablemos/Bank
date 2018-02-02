
import controller.ATMController;
import model.ATMModel;
import model.invalidBankAccountException;
import view.ATMView;

public class Main {

    public static void main(String[] args){
       ATMView atmView = new ATMView();
        ATMModel atmModel = null;

        while (true) {
            atmView.requestAccountMsg();
            try {
                atmModel = new ATMModel(atmView.getValueFromScreen());
                break;
            } catch (invalidBankAccountException e) {
                System.out.println(e.getMessage());
            }
        }

        ATMController atmController = new ATMController(atmModel, atmView);


        while (true) {
            atmView.menuOptionHeader();
            atmView.menuOptionOne();
            atmView.menuOptionTwo();
            atmView.menuOptionThree();
            atmView.menuOptionFour();
            atmView.menuOptionFive();
            atmView.menuOptionSix();
            atmView.menuOptionChoice();

            int choice  = atmView.getValueFromScreen();
            int accountHolder;

            switch (choice) {
                case 1:
                    atmView.splitScreen();

                    System.out.println(atmModel.bankBalance());

                    atmView.splitScreen();
                    break;
                case 2:
                    atmView.splitScreen();

                    atmView.requestValueMsg();
                    atmModel.withdraw(atmView.getValueFromScreen());

                    atmView.splitScreen();
                    break;
                case 3:
                    atmView.splitScreen();

                    atmView.requestAccountMsg();
                    accountHolder = atmView.getValueFromScreen();
                    atmView.requestValueMsg();
                    while (true) {
                        try {
                            atmModel.deposit(accountHolder, atmView.getValueFromScreen());
                            break;
                        } catch (invalidBankAccountException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    atmView.splitScreen();
                    break;
                case 4:
                    atmView.splitScreen();

                    atmView.requestAccountMsg();
                    accountHolder = atmView.getValueFromScreen();
                    atmView.requestValueMsg();
                    while (true) {
                        try {
                            atmModel.transfer(accountHolder, atmView.getValueFromScreen());
                            break;
                        } catch (invalidBankAccountException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    atmView.splitScreen();
                    break;
                case 5:
                    atmView.splitScreen();

                    System.out.println("Extrato");

                    atmView.splitScreen();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                     atmView.invalidOption();
            }

        }
    }
}
