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

public class Employee extends Person
{
    private String ssn;

    public Employee()
    {
        super();
        ssn = "";
    }
    // create getters and setters
    public String getSsn()
    {
        return ssn;
    }
    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }
    @Override
    String getDisplayText() {
        return super.toString() +
                "Social security number: " + ssn + "\n";
    }
}
