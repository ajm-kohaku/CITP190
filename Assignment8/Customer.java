/*
 * ASCII Signature: AJM
 *                  ,.     ,.
 *                 {^ \-"-/ ^}
 *                 "   """   "
 *                { <O> _ <O> }
 *                ==_ .:Y:. _==
 *              .""  `--^--' "".
 *             (,~-~."" "" ,~-~.)
 *       ------(     )----(     )-----
 *             ^-'-'-^    ^-'-'-^
 *       _____________________________
 *             |"""" /~.^.~\ """"|
 *       hjw    ,i-i-i(""(  i-i-i.
 *       `97   (o o o ))"")( o o o)
 *              \(_) /(""(  \ (_)/
 *               `--'  \""\  `--'
 *                      )"")
 *                     (""/
 *                      `"
 */

package com.company;
public class Customer extends Person
{
    private String customerNumber;

    public Customer()
    {
        super();
        customerNumber = "";
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    String getDisplayText() {
        return super.toString() +
                "Customer number: " + customerNumber + "\n";
    }
}
