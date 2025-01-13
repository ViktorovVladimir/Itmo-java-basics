package LabWork07.Task01;

public class Airplane {

    public class Wing {

        private double rWeight;

        public Wing(double weight) {
            this.rWeight = weight;
        }

        public void viewWeight() {
            System.out.println("Wing weight is: " + rWeight + " kg");
        }
    }
    
}
