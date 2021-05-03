public class StringMethods {
        public static void main(String[] args) {
            String name = "Harry";
            // System.out.println(name);
            int value = name.length();
            //System.out.println(value);

            //String lstring = name.toLowerCase();
            //System.out.println(lstring);

            //String ustring = name.toUpperCase();
            //System.out.println(ustring);

           // String nonTrimmedString = "     Harry     ";
           // System.out.println(nonTrimmedString);

           // String trimmedString = nonTrimmedString.trim();
           // System.out.println(trimmedString);

           // System.out.println(name.substring(1));
           // System.out.println(name.substring(1,4)); //Harry

            //System.out.println(name.replace('r', 'p'));
            //System.out.println(name.replace("r", "ier"));

           // System.out.println(name.startsWith("Har")); //check true/false
           // System.out.println(name.endsWith("dd"));

            //System.out.println(name.charAt(4)); //position

            String modifiedName = "Harryrryrry";
            //System.out.println(modifiedName.indexOf("rry"));
            //System.out.println(modifiedName.indexOf("rry", 4));
            //System.out.println(modifiedName.lastIndexOf("rry", 7));

            //System.out.println(name.equals("Harry"));
            //System.out.println(name.equalsIgnoreCase("HarRY"));

            String hid = "0353701097039362";

         /*   if(hid.startsWith("035")){
                System.out.println("Concox");
            }else {
                System.out.println("vts");
            }
*/
            String vtsPacket = "861230046575644,210502184427,23.729191,090.422920,0.000000,105,0,9395,5503,1.31,13,29";
           String[] dataArray = vtsPacket.split(",");
            System.out.println(dataArray[0]);

            int defaultSpeed =50;
            int currentSpeed = Integer.parseInt(dataArray[5]);
            System.out.println(currentSpeed);

            if (currentSpeed>defaultSpeed){
                System.out.println("Over Speed !!");
            }
        }

}

// date-time, conversion (String to date/date to string)
