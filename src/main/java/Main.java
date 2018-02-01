import Exception.invalidBankAccountException;
import controller.ATMController;
import model.ATMModel;
import view.ATMView;

public class Main {
/*
    public static void main(String[] args){
       ATMView atmView = new ATMView();
        ATMModel atmModel = null;
        try {
            atmModel = new ATMModel(atmView.getValueFromScreen());
        } catch (invalidBankAccountException e) {
            e.printStackTrace();
        }
        ATMController atmController = new ATMController(atmModel, atmView);
        atmView.requestAccountMsg();




























        while (true) {
            atmView.menuOptionHeader();
            atmView.menuOptionOne();
            atmView.menuOptionTwo();
            atmView.menuOptionThree();
            atmView.menuOptionFour();
            atmView.menuOptionFive();
            atmView.menuOptionSix();
            atmView.menuOptionChoice();

            int choice;
            int accHolder;

            switch (choice   = atmView.getValueFromScreen()) {
                case 1:
                    atmView.splitScreen();

                    atmView.bankBalanceMenu();
                    System.out.print(account.getBankBalance() + "\n");

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
                    accHolder = atmView.getValueFromScreen();

                    atmView.requestValueMsg();
                    atmModel.deposit(accHolder, atmView.getValueFromScreen());

                    atmView.splitScreen();
                    break;
                case 4:
                    atmView.splitScreen();

                    atmView.requestAccountMsg();
                    accHolder = atmView.getValueFromScreen();

                    atmView.requestValueMsg();
                    atmModel.transfer(accHolder, atmView.getValueFromScreen());

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
    }*/
}
