package uk.ac.cam.lxp20.supo3;

public class RetValTest {

        public static String sEmail = "";
        public static int extractCamEmail(String sentence) throws EmptyInputException, NoCamEmailFoundException {
            if (sentence==null || sentence.length()==0)
                throw new EmptyInputException(); // Error - sentence empty
            String tokens[] = sentence.split(" "); // split into tokens
            for (int i=0; i< tokens.length; i++) {
                if (tokens[i].endsWith("@cam.ac.uk")) {
                    sEmail=tokens[i];
                    return 0; // success
                }
            }
            throw new NoCamEmailFoundException(); // Error - no cam email found
        }
        public static void main(String[] args) {
            try {
                RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
                System.out.println("Success: " + RetValTest.sEmail);
            }
            catch (EmptyInputException e) {
                System.out.println("Supplied string empty");
            }
            catch (NoCamEmailFoundException e){
                System.out.println("No @cam address in supplied string");
            }
        }
}

class EmptyInputException extends Exception{};
class NoCamEmailFoundException extends Exception{};
