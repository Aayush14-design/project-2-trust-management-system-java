class TrustManagementSystem{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MemberService obj=new MemberService(sc);
        boolean flag=true;
        while(flag){
            System.out.println("Welcome To our Trust");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Amount to Pay");
            System.out.println("4. Starting Day to Pay");
            System.out.println("5. Last Day to pay");
            System.out.println("6. List of member Who pay");
            System.out.println("7. List of Student Who don't Pay");
            System.out.println("8. Display All the members");
            System.out.println("9. Search Member by Id");
            System.out.println("10. Update Member");
            System.out.println("11. Total amount created");
            System.out.println("12. Total Number of paid Member");
            System.out.println("13. Total Number of unpaid Member");
            System.out.println("14. Exit");
            System.out.println("Enter your choice");
            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    obj.addMember();
                    break;
                case 2 :
                    obj.removeMember();
                    break;
                case 3 :
                    obj.amountToPay();
                    break;
                case 4 :
                    obj.startingDayToPay();
                    break;
                case 5 :
                    obj.endingDayToPay();
                    break;
                case 6 :
                    obj.listOfMemberWhoPay();
                    break;
                case 7 :
                    obj.listOfMemberWhoDoNotPay();
                    break;
                case 8 :
                   obj.displayAllMember();
                    break;
                case 9 :
                    obj.searchMemberById();
                    break;
                case 10 :
                    obj.updateMember();
                    break;
                case 11 :
                    obj.totalAmountCreated();
                    break;
                case 12 :
                    obj.totalNumberOfPaidMembers();
                    break;
                case 13 :
                   obj.totalNumberOfUnpaidMembers();
                    break;
                case 14 :
                    flag=false;
                    System.out.println("Thanks for Coming");
                    break;
                default:
                    System.out.println("Please Enter Between 1 to 14 only");
                    break;
            }//switch
        }//while
    }
}
