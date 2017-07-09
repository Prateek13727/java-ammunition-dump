/**
 * Created by tracxn-lp-175 on 21/5/17.
 */
public class Main {
    public static void main(String[] args) {
//        Bank bank = new Bank("SBI");
//        bank.addBranch("SBI-LKO");
//        bank.addCustomerToBranch("prateek","SBI-LKO", 500.0);
//        System.out.println(bank.getCustomerListByBranch("SBI-LKO"));

             String footer = "</div>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "<tr>\n" +
                    "    <td style=\"height: 40px; background: #000; padding-left: 10px;padding-right: 10px; text-align: left;\" align=\"center\" width=\"600\">\n" +
                    "\n" +
                    "        <a href=\"http://tracxn.com\" rilt=\"img_email_logo\" target=\"_blank\"><img src=\"http://s3.amazonaws.com/tracxnassets/assets/static/images/tracxn_logo_new.png\" height=\"20\" /></a>\n" +
                    "\n" +

                    "        <a href=\"http://www.linkedin.com/company/tracxn\" style=\"padding: 4px; float: right; margin-right:5px; \"><img src=\"http://s3.amazonaws.com/tracxnassets/assets/static/images/linkedin.png\" alt=\"linkedin\" title=\"linkedin\"/></a>\n" +
                    "        <a href=\"//www.facebook.com/Tracxn\" style=\"padding: 4px; float: right; margin-right:5px; \"><img src=\"http://s3.amazonaws.com/tracxnassets/assets/static/images/facebook.png\" alt=\"facebook\" title=\"facebook\"/></a>\n" +
                    "        <a href=\"//twitter.com/tracxn\" style=\"padding: 4px; float: right; margin-right:5px; \"><img src=\"http://s3.amazonaws.com/tracxnassets/assets/static/images/twitter.png\" alt=\"twitter\" title=\"twitter\"/></a>\n" +
                    "\n" +
                    "    </td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "\n" +
                    "</table>\n" +
                    "</body>";


             String header = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                    "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                    "<body>\n" +
                    "<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" style=\"background:#efefef\">\n" +
                    "    <tr>\n" +
                    "        <td style=\"padding-top: 30px;padding-bottom: 30px;\">\n" +
                    "            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"630\" align=\"center\" style=\"padding-left: 10px;padding-right: 10px;\n" +
                    "            background: url('http://s3.amazonaws.com/tracxnassets/assets/static/images/shadow/left-shadow.png') left center,url('http://s3.amazonaws.com/tracxnassets/assets/static/images/shadow/right-shadow.png') right center;background-repeat: repeat-y,repeat-y;\">\n" +
                    "                <tr>\n" +
                    "                    <td>\n" +
                    "                        <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"600\" style=\"background:#fff;border:0;\">\n" +
                    "                            <tr>\n" +
                    "                                <td style=\"height: 40px; padding: 5px;vertical-align: middle;text-align:center;background-color: #000;\">\n" +
                    "                                    <a href=\"http://tracxn.com\" rilt=\"img_email_logo\" target=\"_blank\">\n" +
                    "                                        <img src=\"http://s3.amazonaws.com/tracxnassets/assets/static/images/tracxn_logo_new_white\" height=\"30\" />\n" +
                    "                                    </a>\n" +
                    "                                </td>\n" +
                    "                            </tr>\n" +
                    "                            <tr>\n" +
                    "                                <td style=\"vertical-align: top; padding: 10px; padding-left: 40px;padding-right: 40px; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: 18px;\">\n" +
                    "                                    <div style=\"min-height: 200px;\">";


            String emailButton = "<p style=\"text-align: center; padding-top: 20px; padding-bottom: 20px; \">\n" +
                    "    <a href=%s target=\"_blank\" style=\"\n" +
                    "    font-family: Arial,Helvetica,sans-serif;\n" +
                    "    font-size: 17px;\n" +
                    "    color: inherit;\n" +
                    "    text-decoration: none;\n" +
                    "    background-color: #ffffff;\n" +
                    "    border: 1px solid #000000;\n" +
                    "    border-radius: 3px;\n" +
                    "    padding-left: 20px;\n" +
                    "    padding-right: 20px;\n" +
                    "    padding-top: 5px;\n" +
                    "    padding-bottom: 5px;\">\n" +
                    "        %s\n" +
                    "    </a>\n" +
                    "</p>\n";


             String adminAdd = "%s\n" +
                    "<p>Hi Tracxn Admin,</p>\n" +
                    "<p>\n" +
                    "    <b>Email-id: </b>%s<br>\n" +
                    "    <b>Domain Description (%s): </b>%s<br>\n" +
                    "    <b>Registration Type: </b>%s<br>\n" +
                    "    <b>User Status: </b>%s<br>\n" +
                    "    %s" +
                    "    <b>Created Time: </b>%s<br>\n" +
                    "\n" +
                    "</p>\n" +
                    "<p>Click on the button below to view all the subscription logs: </p>\n" +
                    "\n%s" +
                    "\n" +
                    "<p><br> Thanks,<br> Team Tracxn! <br>http://www.Tracxn.com | hi@tracxn.com<br></p>\n" +
                    "%s";
             String button = String.format(emailButton, "https://tracxn.com/internal/users/edit/prateek.pandey+um+testing0090234@tracxn.com", "Subscription Logs");

             String addedBy = "<b>Added By: </b>" + "prateek.pandey@tracxn.com" + "(" + "prateek" + ")" + "<br>\n";

             String email = String.format(adminAdd, header, "anubhav.agrawal@tracxn.com", "tracxn.com", "some desc", "ADMIN_ADD", "UNKNOWN", addedBy, "2017/06/12", button, footer);

            System.out.println(email);
        }
}
