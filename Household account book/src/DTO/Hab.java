package DTO;
public class Hab{
 private String day;
 private String expenses;
 private String memo;
 private int payment;
 private int withdrawal;

 public Hab(String day, String expenses, String memo, int payment, int withdrawal) {
  super();
  this.day = day;
  this.expenses = expenses;
  this.memo = memo;
  this.payment = payment;
  this.withdrawal= withdrawal;
 }

 public String getDay() {
  return day;
 }
 public void setId(String day) {
  this.day = day;
 }
 public String getExpenses() {
  return expenses;
 }
 public void setExpenses(String expenses) {
  this.expenses = expenses;
 }
 public String getMemo() {
  return memo;
 }
 public void setMemo(String memo) {
  this.memo = memo;
 }
 public int getPayment() {
  return payment;
 }
 public void setSpeed(int payment) {
  this.payment = payment;
 }
 public int getWithdrawal() {
  return withdrawal;
 }
 public void setWithdrawal(int withdrawal) {
  this.withdrawal = withdrawal;
 }
}