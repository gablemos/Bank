package model;

import java.util.ArrayList;
import java.util.Optional;

public class Agency {
   private final ArrayList<Account> accounts;

   public Agency(){
       this.accounts = new ArrayList<Account>();

       accounts.add( new Account("João da Silva", 541259, 10854.78));
       accounts.add(new Account("Pedro Otávio Magalhães", 252148, 1050.99));
       accounts.add(new Account("Maria Green",884521, 7696.00));
       accounts.add(new Account("Stephan Pereira",159357, 412.13));
   }

   public boolean existAccount(final Account accountVerify){
       for (Account account : accounts) {
            if(account.equals(accountVerify)){
                return true;
            }
       }
       return false;
   }

   public Account getAccountFromAccounts(final int numberAccount){
       for(Account account : accounts){
           if(account.isAccount(numberAccount)){
               return account;
           }
       }
       Optional<Account> account = Optional.empty();
       return account.get();
   }
}
