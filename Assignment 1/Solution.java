public class Solution{
    public static void main(String[] args) {
        /**
         * This is the solution of Assignment 1 of Java Communty classes by Telusko 
         * This contains one of the most optimized code to print "TELUSKO" and "INEURON" using * patterns
         * Please run this file in an expanded terminal or else the characters will be overlapped
         * Thank You!
         * 
         * Code submitted by Darshan Banerjee (UPI ID - "dibban30@okaxis")*/

        // TELUSKO 
        for(int i = 1; i <= 7; i++){
            if(i == 1){
                System.out.println("* * * * * * *    * * * * *    *             *       *      * * *    *     *     * * * * * ");
            }
            if(i == 2){
                System.out.println("      *          *            *             *       *     *     *   *   *       *       * ");
            }
            if(i == 3){
                System.out.println("      *          *            *             *       *     *         *  *        *       * ");
            }
            if(i == 4){
                System.out.println("      *          * * *        *             *       *      * *      * *         *       * ");
            }
            if(i == 5){
                System.out.println("      *          *            *             *       *         *     *  *        *       *");
            }
            if(i == 6){
                System.out.println("      *          *            *             *       *   *     *     *   *       *       *");
            }
            if(i == 7){
                System.out.println("      *          * * * * *    * * * * * *   * * * * *    * * *      *     *     * * * * *");
            }
        }

        // New-line gaps
        System.out.println("");
        System.out.println("");

        // INEURON
        for(int i = 1; i <= 7; i++){
            if(i == 1){
                System.out.println("    * * *        **      *    * * * * *    *       *    * * * *    * * * * *    **      *");
            }
            if(i == 2){
                System.out.println("      *          * *     *    *            *       *    *     *    *       *    * *     *");
            }
            if(i == 3){
                System.out.println("      *          *  *    *    *            *       *    * * * *    *       *    *  *    *");
            }
            if(i == 4){
                System.out.println("      *          *   *   *    * * *        *       *    * *        *       *    *   *   *");
            }
            if(i == 5){
                System.out.println("      *          *    *  *    *            *       *    *  *       *       *    *    *  *");
            }
            if(i == 6){
                System.out.println("      *          *     * *    *            *       *    *   *      *       *    *     * *");
            }
            if(i == 7){
                System.out.println("    * * *        *      **    * * * * *    * * * * *    *    *     * * * * *    *      **");
            }
        }
    }
}
