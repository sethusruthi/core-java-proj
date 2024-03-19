package org.OOPs.Basics;

public class DataMask {

        public static String maskAccountNumber(long accNumber) {
            String str = "" + accNumber;
            if (str.length() <= 4) {
                return str;
            }
            String last4DigitsAccNumber = str.substring(str.length() - 4);
            return "********" + last4DigitsAccNumber;
        }
    }

