/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initialization;

import Business.Person;

/**
 *
 * @author Eric
 */
public class GetScore {

    public void setMaleScore(Person person) {
        //"i" as the conditon of loop which means the size of the healthaccount

        for (int i = 0; i < person.getHealthAccount().size(); i++) {
            int LDLPts = 0;
            int CholPts = 0;
            //step 1
            LDLPts = LDLPts + (person.getAge() / 5) - 7;
            CholPts = CholPts + (person.getAge() / 5) - 7;

            //step 2
            double ldlch = person.getHealthAccount().get(i).getLdlCholesterol();
            if (ldlch <= 2.59) {
                LDLPts = LDLPts - 3;
            }
            if (ldlch > 4.15 && ldlch < 4.92) {
                LDLPts = LDLPts + 1;
            }
            if (ldlch >= 4.92) {
                LDLPts = LDLPts + 2;
            }
            double cholesterol = person.getHealthAccount().get(i).getTotalCholesterol();
            if (cholesterol <= 4.14) {
                CholPts = CholPts - 3;
            }

            if (cholesterol >= 5.18 && cholesterol <= 6.21) {
                CholPts = CholPts + 1;
            }
            if (cholesterol >= 6.22 && cholesterol <= 7.24) {
                CholPts = CholPts + 2;
            }
            if (cholesterol >= 7.25) {
                CholPts = CholPts + 3;
            }

            //step 3
            double hdlchol = person.getHealthAccount().get(i).getHdlCholesterol();
            if (hdlchol < 0.9) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }
            if (hdlchol > 0.91 && hdlchol > 1.16) {
                LDLPts = LDLPts + 1;
                CholPts = CholPts + 1;
            }

            if (hdlchol >= 1.56) {
                LDLPts = LDLPts - 1;
                CholPts = CholPts - 2;
            }

            //step 4
            int systolic = person.getHealthAccount().get(i).getSystolic();
            int diastolc = person.getHealthAccount().get(i).getDiastolc();
            if ((systolic < 139 && diastolc > 85 && diastolc < 89) || (systolic < 139 && systolic > 130 && diastolc < 85)) {
                LDLPts = LDLPts + 1;
                CholPts = CholPts + 1;
            }
            if ((systolic < 159 && diastolc > 90 && diastolc < 99) || (systolic < 159 && systolic > 140 && diastolc < 90)) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }
            if (diastolc >= 100 || systolic >= 160) {
                LDLPts = LDLPts + 3;
                CholPts = CholPts + 3;
            }

            //step 5
            if (person.getHealthAccount().get(i).isIfDiabetes()) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }

            //step 6
            if (person.getHealthAccount().get(i).isIfSmoke()) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }

            //step 8
            //https://www.framinghamheartstudy.org/risk-functions/coronary-heart-disease/10-year-risk.php
            //第八张表的判定,我只写了LDLPts的分数对应的risk值。。cholpts那个没有用。。你看看吧要不要加还是就这样
            //
            if (LDLPts < -3) {
                person.getHealthAccount().get(i).setScore(1);
            }
            if (LDLPts == -2 || LDLPts == -1) {
                person.getHealthAccount().get(i).setScore(2);
            }

            if (LDLPts == 0) {
                person.getHealthAccount().get(i).setScore(3);
            }
            if (LDLPts == 1 || LDLPts == 2) {
                person.getHealthAccount().get(i).setScore(4);
            }

            if (LDLPts == 3) {
                person.getHealthAccount().get(i).setScore(6);
            }
            if (LDLPts == 4) {
                person.getHealthAccount().get(i).setScore(7);
            }
            if (LDLPts == 5) {
                person.getHealthAccount().get(i).setScore(9);
            }
            if (LDLPts == 6) {
                person.getHealthAccount().get(i).setScore(11);
            }
            if (LDLPts == 7) {
                person.getHealthAccount().get(i).setScore(14);
            }
            if (LDLPts == 8) {
                person.getHealthAccount().get(i).setScore(18);
            }
            if (LDLPts == 9) {
                person.getHealthAccount().get(i).setScore(22);
            }
            if (LDLPts == 10) {
                person.getHealthAccount().get(i).setScore(27);
            }
            if (LDLPts == 11) {
                person.getHealthAccount().get(i).setScore(33);
            }
            if (LDLPts == 12) {
                person.getHealthAccount().get(i).setScore(40);
            }
            if (LDLPts == 13) {
                person.getHealthAccount().get(i).setScore(47);
            }
            if (LDLPts >= 14) {
                person.getHealthAccount().get(i).setScore(56);
            }
        }
    }

    public void setFemaleScore(Person person) {
        //"i" as the conditon of loop which means the size of the healthaccount

        for (int i = 0; i < person.getHealthAccount().size(); i++) {
            int LDLPts = 0;
            int CholPts = 0;
            //step 1
            LDLPts = LDLPts + (person.getAge() / 5) - 7;
            CholPts = CholPts + (person.getAge() / 5) - 7;

            //step 2
            double ldlch = person.getHealthAccount().get(i).getLdlCholesterol();
            if (ldlch <= 2.59) {
                LDLPts = LDLPts - 2;
            }
            if (ldlch > 4.15) {
                LDLPts = LDLPts + 2;
            }
            double cholesterol = person.getHealthAccount().get(i).getTotalCholesterol();
            if (cholesterol <= 4.14) {
                CholPts = CholPts - 3;
            }

            if (cholesterol >= 5.18 && cholesterol <= 6.21) {
                CholPts = CholPts + 1;
            }
            if (cholesterol >= 6.22 && cholesterol <= 7.24) {
                CholPts = CholPts + 1;
            }
            if (cholesterol >= 7.25) {
                CholPts = CholPts + 3;
            }

            //step 3
            double hdlchol = person.getHealthAccount().get(i).getHdlCholesterol();
            if (hdlchol < 0.9) {
                LDLPts = LDLPts + 5;
                CholPts = CholPts + 5;
            }
            if (hdlchol > 0.91 && hdlchol > 1.16) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }

            if (hdlchol > 1.17 && hdlchol > 1.29) {
                LDLPts = LDLPts + 1;
                CholPts = CholPts + 1;
            }
            if (hdlchol >= 1.56) {
                LDLPts = LDLPts - 2;
                CholPts = CholPts - 3;
            }

            //step 4
            int systolic = person.getHealthAccount().get(i).getSystolic();
            int diastolc = person.getHealthAccount().get(i).getDiastolc();
            if (systolic < 120 && diastolc < 80) {
                LDLPts = LDLPts - 3;
                CholPts = CholPts - 3;
            }
            if ((systolic < 159 && diastolc > 90 && diastolc < 99) || (systolic < 159 && systolic > 140 && diastolc < 90)) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }
            if (diastolc >= 100 || systolic >= 160) {
                LDLPts = LDLPts + 3;
                CholPts = CholPts + 3;
            }

            //step 5
            if (person.getHealthAccount().get(i).isIfDiabetes()) {
                LDLPts = LDLPts + 4;
                CholPts = CholPts + 4;
            }

            //step 6
            if (person.getHealthAccount().get(i).isIfSmoke()) {
                LDLPts = LDLPts + 2;
                CholPts = CholPts + 2;
            }

            //step 8
            //https://www.framinghamheartstudy.org/risk-functions/coronary-heart-disease/10-year-risk.php
            //第八张表的判定,我只写了LDLPts的分数对应的risk值。。cholpts那个没有用。。你看看吧要不要加还是就这样
            if (LDLPts <= -2) {
                person.getHealthAccount().get(i).setScore(1);
            }
            if (LDLPts == 1 || LDLPts == -1 || LDLPts == 0) {
                person.getHealthAccount().get(i).setScore(2);
            }

            if (LDLPts == 2 || LDLPts == 3) {
                person.getHealthAccount().get(i).setScore(3);
            }

            if (LDLPts == 4) {
                person.getHealthAccount().get(i).setScore(4);
            }
            if (LDLPts == 5) {
                person.getHealthAccount().get(i).setScore(5);
            }
            if (LDLPts == 6) {
                person.getHealthAccount().get(i).setScore(6);
            }
            if (LDLPts == 7) {
                person.getHealthAccount().get(i).setScore(7);
            }
            if (LDLPts == 8) {
                person.getHealthAccount().get(i).setScore(8);
            }
            if (LDLPts == 9) {
                person.getHealthAccount().get(i).setScore(9);
            }
            if (LDLPts == 10) {
                person.getHealthAccount().get(i).setScore(11);
            }
            if (LDLPts == 11) {
                person.getHealthAccount().get(i).setScore(13);
            }
            if (LDLPts == 12) {
                person.getHealthAccount().get(i).setScore(15);
            }
            if (LDLPts == 13) {
                person.getHealthAccount().get(i).setScore(17);
            }
            if (LDLPts == 14) {
                person.getHealthAccount().get(i).setScore(20);
            }
            if (LDLPts == 15) {
                person.getHealthAccount().get(i).setScore(24);
            }
            if (LDLPts == 16) {
                person.getHealthAccount().get(i).setScore(27);
            }
            if (LDLPts >= 17) {
                person.getHealthAccount().get(i).setScore(32);
            }
        }
    }
}
