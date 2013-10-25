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
public abstract class Person
{
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Email: "+ emailAddress + "\n";
    }

    abstract String getDisplayText();
}
