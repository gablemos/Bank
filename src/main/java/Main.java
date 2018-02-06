
import controller.ATMController;
import model.ATMModel;
import model.invalidBankAccountException;
import view.ATMView;



public class Main {

    public static void main(String[] args) {
        ATMView atmView = new ATMView();
        ATMModel atmModel = null;

        atmView.requestAccountMsg();
        while (true) {
            try {
                atmModel = new ATMModel(atmView.getValueFromScreen());
                break;
            } catch (invalidBankAccountException e) {
                System.out.println(e.getMessage() + "\n");
                atmView.requestValidAccountMsg();
            }
        }
        ATMController atmController = new ATMController(atmModel, atmView);


        while (true) {
            atmController.header();
            int choice = atmView.getValueFromScreen();

            switch (choice) {
                case 1:
                    atmController.optionOne();
                    break;

                case 2:
                    atmController.optionTwo();
                    break;

                case 3:
                    atmController.optionThree();
                    break;

                case 4:
                    atmController.optionFour();
                    break;

                case 5:
                    atmController.optionFive();
                    break;

                case 6:
                    atmController.optionSix();
                    break;

                default:
                    atmController.invalidOption();
            }
        }
    }

}
