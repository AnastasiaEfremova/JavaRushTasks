package com.company.JavaCore.Level_7.Synchronized.Pres;

public class Main {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }

    public static class OurPresident {

        private static OurPresident president;

        static {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }
        }

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }
}
