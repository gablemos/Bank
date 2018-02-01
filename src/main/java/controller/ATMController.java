package controller;

import model.ATMModel;
import view.ATMView;

public class ATMController {

    private ATMModel atmModel;
    private ATMView atmView;

    public ATMController(ATMModel atmModel, ATMView atmView){
        this.atmModel = atmModel;
        this.atmView = atmView;
    }
}
