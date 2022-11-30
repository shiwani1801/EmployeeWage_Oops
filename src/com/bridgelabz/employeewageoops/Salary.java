package com.bridgelabz.employeewageoops;

public class Salary {
        static Employee employee=new Employee();

        public static void main(String[] args) {
            int totalMonthlyHours = 0;

            int totalWorkingDays;
            do {
                double check = Math.floor(Math.random() * 10) % 3;
                switch ((int) check) {
                    case 1:
                        System.out.println("full time worker ");
                        employee.setempHours(100);
                        break;
                    case 0:
                        System.out.println("part time worker");
                        employee.setempHours(80);  //obtained from uc 3 part time hour =8....8*10=80
                        break;                      //assumed monthly partime days =10
                    default:
                        employee.setempHours(0);
                }
                totalMonthlyHours = totalMonthlyHours + employee.getempHours();
                int monthlyWage = totalMonthlyHours * 20;
                System.out.println("monthlyWage = " + monthlyWage);
                totalWorkingDays = employee.gettotalWorkingDays();
            }
            while ((totalMonthlyHours < 100) && (totalWorkingDays <= 20));
        }


        }


