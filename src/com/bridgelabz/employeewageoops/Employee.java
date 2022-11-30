package com.bridgelabz.employeewageoops;

    public class Employee {
        private final int ABSENT=0;
        private final int PRESENT=1;
        private int empHours;
        private String wage;
        private int workingHours;
        private  int totalWorkingDays=20;

        public Employee() {

        }



        public int getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(int workingHours) {
            this.workingHours = workingHours;
        }

        public int getempHours() {
            return empHours;
        }

        public void setempHours(int empHours) {
            this.empHours = empHours;
        }

        public int getTotalWorkingDays() {
            return totalWorkingDays;
        }


        public void setTotalWorkingDays(int totalWorkingDays) {
            this.totalWorkingDays = totalWorkingDays;
        }

        public int getPRESENT() {
            return PRESENT;
        }




        public int getABSENT() {
            return ABSENT;
        }

        public int getEmpHours() {
            return empHours;
        }

        public void setEmpHours(int empHours) {
            this.empHours = empHours;
        }

        public int gettotalWorkingDays() {
            return totalWorkingDays;
        }


        public void settotalWorkingDays(int totalWorkingDays) {
            this.totalWorkingDays = totalWorkingDays;
        }



        public Employee(  String wage, int workingHours, int totalWorkingDays) {

            this.wage = wage;
            this.workingHours = workingHours;
            this.totalWorkingDays = totalWorkingDays;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "ABSENT=" + ABSENT +
                    ", PRESENT=" + PRESENT +
                    ", workingHours=" + workingHours +
                    ", totalWorkingDays=" + totalWorkingDays +
                    ", empHours=" + empHours +
                    '}';
        }
    }



