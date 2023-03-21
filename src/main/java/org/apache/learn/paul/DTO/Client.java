package org.apache.learn.paul.DTO;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = true)
public class Client {
    @DataField(pos = 1)
    private int id;
    @DataField(pos = 2)
    private int limitBalance;
    @DataField(pos = 3)
    private int sex;
    @DataField(pos = 4)
    private int education;
    @DataField(pos = 5)
    private int marriage;
    @DataField(pos = 6)
    private int age;
    @DataField(pos = 7)
    private int pay0;
    @DataField(pos = 8)
    private int pay2;
    @DataField(pos = 9)
    private int pay3;
    @DataField(pos = 10)
    private int pay4;
    @DataField(pos = 11)
    private int pay5;
    @DataField(pos = 12)
    private int pay6;
    @DataField(pos = 13)
    private int bill1;
    @DataField(pos = 14)
    private int bill2;
    @DataField(pos = 15)
    private int bill3;
    @DataField(pos = 16)
    private int bill4;
    @DataField(pos = 17)
    private int bill5;
    @DataField(pos = 18)
    private int bill6;
    @DataField(pos = 19)
    private int payv1;
    @DataField(pos = 20)
    private int payv2;
    @DataField(pos = 21)
    private int payv3;
    @DataField(pos = 22)
    private int payv4;
    @DataField(pos = 23)
    private int payv5;
    @DataField(pos = 24)
    private int payv6;
    @DataField(pos = 25)
    private int defaultPaymentNextMonth;

    public Client() {
    }

    public Client(int id, int limitBalance, int sex, int education, int marriage, int age, int pay0, int pay2,
                  int pay3, int pay4, int pay5, int pay6, int bill1, int bill2, int bill3, int bill4, int bill5, int bill6,
                  int payv1, int payv2, int payv3, int payv4, int payv5, int payv6, int defaultPaymentNextMonth) {
        this.id = id;
        this.limitBalance = limitBalance;
        this.sex = sex;
        this.education = education;
        this.marriage = marriage;
        this.age = age;
        this.pay0 = pay0;
        this.pay2 = pay2;
        this.pay3 = pay3;
        this.pay4 = pay4;
        this.pay5 = pay5;
        this.pay6 = pay6;
        this.bill1 = bill1;
        this.bill2 = bill2;
        this.bill3 = bill3;
        this.bill4 = bill4;
        this.bill5 = bill5;
        this.bill6 = bill6;
        this.payv1 = payv1;
        this.payv2 = payv2;
        this.payv3 = payv3;
        this.payv4 = payv4;
        this.payv5 = payv5;
        this.payv6 = payv6;
        this.defaultPaymentNextMonth = defaultPaymentNextMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLimitBalance() {
        return limitBalance;
    }

    public void setLimitBalance(int limitBalance) {
        this.limitBalance = limitBalance;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getMarriage() {
        return marriage;
    }

    public void setMarriage(int marriage) {
        this.marriage = marriage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPay0() {
        return pay0;
    }

    public void setPay0(int pay0) {
        this.pay0 = pay0;
    }

    public int getPay2() {
        return pay2;
    }

    public void setPay2(int pay2) {
        this.pay2 = pay2;
    }

    public int getPay3() {
        return pay3;
    }

    public void setPay3(int pay3) {
        this.pay3 = pay3;
    }

    public int getPay4() {
        return pay4;
    }

    public void setPay4(int pay4) {
        this.pay4 = pay4;
    }

    public int getPay5() {
        return pay5;
    }

    public void setPay5(int pay5) {
        this.pay5 = pay5;
    }

    public int getPay6() {
        return pay6;
    }

    public void setPay6(int pay6) {
        this.pay6 = pay6;
    }

    public int getBill1() {
        return bill1;
    }

    public void setBill1(int bill1) {
        this.bill1 = bill1;
    }

    public int getBill2() {
        return bill2;
    }

    public void setBill2(int bill2) {
        this.bill2 = bill2;
    }

    public int getBill3() {
        return bill3;
    }

    public void setBill3(int bill3) {
        this.bill3 = bill3;
    }

    public int getBill4() {
        return bill4;
    }

    public void setBill4(int bill4) {
        this.bill4 = bill4;
    }

    public int getBill5() {
        return bill5;
    }

    public void setBill5(int bill5) {
        this.bill5 = bill5;
    }

    public int getBill6() {
        return bill6;
    }

    public void setBill6(int bill6) {
        this.bill6 = bill6;
    }

    public int getPayv1() {
        return payv1;
    }

    public void setPayv1(int payv1) {
        this.payv1 = payv1;
    }

    public int getPayv2() {
        return payv2;
    }

    public void setPayv2(int payv2) {
        this.payv2 = payv2;
    }

    public int getPayv3() {
        return payv3;
    }

    public void setPayv3(int payv3) {
        this.payv3 = payv3;
    }

    public int getPayv4() {
        return payv4;
    }

    public void setPayv4(int payv4) {
        this.payv4 = payv4;
    }

    public int getPayv5() {
        return payv5;
    }

    public void setPayv5(int payv5) {
        this.payv5 = payv5;
    }

    public int getPayv6() {
        return payv6;
    }

    public void setPayv6(int payv6) {
        this.payv6 = payv6;
    }

    public int getDefaultPaymentNextMonth() {
        return defaultPaymentNextMonth;
    }

    public void setDefaultPaymentNextMonth(int defaultPaymentNextMonth) {
        this.defaultPaymentNextMonth = defaultPaymentNextMonth;
    }

}
