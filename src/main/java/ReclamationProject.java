/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */


/**.
 * Reclamation Project
 */
public class ReclamationProject {

    /**
     *
     * @param a a string
     * @param b a string
     * @return r
     */
    static String doit(final String a, final String b) {
        String c = a;
        String d = b;

        if (a.length() > b.length()) {
           c = b;
           d = a; // exchange a, b

        }

        String r;

        if (a.equals(d)) {
            r = "";
        } else {
            r = "";
        }




        /*
         * For loop with i
         */
        for (int i = 0; i < c.length(); i++) {
            for (int j = c.length() - i; j > 0; j--) {
                for (int k = 0; k < d.length() - j; k++) {

                    if (c.regionMatches(i, d, k, j) && j > r.length()) {
                        r = c.substring(i, i + j);
                    }


                        }
                } // Ah yeah
        } return r; }
}
