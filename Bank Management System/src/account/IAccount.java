/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Admin
 */
public interface IAccount {
    public void withdraw(int amount);
    public void showBalance();
    public void deposit(int amount);
    public void TransferBalance(int amount, Account account);
}
