class MemberService{
     Scanner sc;
     MemberService(Scanner sc){
         this.sc=sc;
     }
     ArrayList<Member> a1=new ArrayList<>();
     void addMember(){
         System.out.println("Enter Name");
         String name=sc.nextLine();
         System.out.println("Enter Your Id");
         int id=sc.nextInt();
         int count5=0;
         for (Member x : a1){
             if(x.getId()==id){
                 System.out.println("Entered ID Already Exist");
                 count5++;
             }
         }
         if(count5==0){
             Member p=new Member(name,id);
             a1.add(p);
             System.out.println("Member Added successfully");
         }
     }
     void removeMember(){
         System.out.println("Enter Id that you want to remove");
         int id1= sc.nextInt();
         int count=0;
                   /* for (Project x : a1){
                        if(x.id==id1){
                            a1.remove(x);
                            System.out.println("Member removed");
                            count++;
                            break;
                        }
                    }sometime it should give ConcurrentModificationException, so I used another way*/
         Iterator<Member> it = a1.iterator();

         while(it.hasNext()){
             Member x = it.next();

             if(x.getId() == id1){
                 it.remove();
                 System.out.println("Member removed");
                 count++;
                 break;
             }
         }
         if(count==0){
             System.out.println("Member Not Found");
         }
     }
     void amountToPay(){
         System.out.println("Enter your id");
         int id2 = sc.nextInt();

         if(id2 < 0 || id2 > 1500){
             System.out.println("Please Enter Valid id");
         }
         else{
             boolean found = false;

             for(Member x : a1){

                 if(x.getId() == id2){

                     found = true;

                     if(id2 <= 1000){
                         System.out.println("Amount to Pay = 1000");
                         x.setAmount(1000);
                     }
                     else if(id2 <= 1200){
                         System.out.println("Amount to Pay = 850");
                         x.setAmount(850);

                     }
                     else{
                         System.out.println("Amount to Pay = 500");
                         x.setAmount(500);
                     }

                     x.setPayment(true);
                     x.setD1(LocalDate.now());

                     break;
                 }
             }

             if(!found){
                 System.out.println("Member Not Found");
             }
         }
     }
     void startingDayToPay(){
         System.out.println("Starting Date = 1/1/2026");
     }
     void endingDayToPay(){
         System.out.println("Ending Date = 25/5/2026");
     }
     void listOfMemberWhoPay(){
         for (Member x : a1){
             if (x.isPayment()){
                 System.out.println("Details of Member who Paid");
                 System.out.print("Name = "+x.getName()+ ", ");
                 System.out.print("ID = "+ x.getId()+ ", ");
                 System.out.println("Amount paid = "+ x.getAmount()+ " At Date = "+ x.getD1() + ".");
             }
         }
     }
     void  listOfMemberWhoDoNotPay(){
         for (Member x : a1){
             if (!x.isPayment()){
                 System.out.println("Details of Member Who Not Paid");
                 System.out.print("Name = "+x.getName()+ ", ");
                 System.out.println("ID = "+ x.getId()+ ". ");
             }
         }
     }
     void displayAllMember(){
         for (Member x: a1){
             System.out.println(x);
         }
     }
     void searchMemberById(){
         System.out.println("Enter ID that you want to search");
         int id3= sc.nextInt();
         int count1=0;
         for (Member x : a1){
             if (x.getId()==id3){
                 System.out.println(x);
                 count1++;
                 break;
             }
         }
         if (count1==0){
             System.out.println("Id not found");
         }
     }
     void updateMember(){
         System.out.println("Enter the Id that you want to change Name");
         int id4= sc.nextInt();
         sc.nextLine();
         int count2=0;
         for (Member x : a1) {
             if(x.getId()==id4) {
                 System.out.println("Enter The Name that you want to update");
                 String name1 = sc.nextLine();
                 x.setName(name1);
                 System.out.println("Name updated.");
                 count2++;
                 break;
             }
         }
         if(count2==0){
             System.out.println("Id not found");
         }
     }
     void totalAmountCreated(){
         double amount=0;
         for (Member x : a1){
             amount+=x.getAmount();
         }
         System.out.println("Total Amount paid ="+ amount);
     }
     void totalNumberOfPaidMembers(){
         int count3=0;
         for (Member x : a1){
             if(x.isPayment()){
                 count3++;
             }
         }
         System.out.println("Total Number of Paid Member="+count3);
     }
     void totalNumberOfUnpaidMembers(){
         int count4=0;
         for (Member x : a1){
             if(!x.isPayment()){
                 count4++;
             }
         }
         System.out.println("Total Number of unpaid Member="+count4);
     }
 }
