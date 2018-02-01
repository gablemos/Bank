package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgencyTest{

        @Test
        public void testCriarRecuperarAccount(){
            Agency agency = new Agency();

            int numberAccount = 111;

            Account account = agency.getAccountFromAccounts(numberAccount);

            System.out.println(account.getNumberAccount() + " "
                    + account.getBankBalance() + " "
                    + account.getUserAccount() );
        }

}