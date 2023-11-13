import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // конструктор класу
        BankAccount eximpe1 = new BankAccount("1", 2000);

        eximpe1.setName();

        while (true){

            System.out.println("Select an action: \n1 - поповнити рахунок\n2 - зняти кошти\n3 - перевірити рахунок акаунту\n4 - змінити Імя\n ");
            int actoin = scanner.nextInt();

            if (actoin == 1){
                // процес поповнення та результат поповнення
                eximpe1.insertion();
                eximpe1.getBalanceAcaunt();
            }
            else if (actoin == 2) {
                //процес зняття та результат зняття
                eximpe1.withdrawal();
                eximpe1.getBalanceAcaunt();
            }

            else if (actoin == 3) {
                // дані акаунту
                eximpe1.getBalanceAcaunt();
            }
            else if (actoin == 4) {
                eximpe1.setName();
            }
        }
    }
}


import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    private String User;
    private int balanceAcaunt;

    public BankAccount(String User,int balanceAcaunt){
        this.User = User;
        this.balanceAcaunt = balanceAcaunt;
    }
    public void setName(){

        System.out.println("Веедіть ваше імя: ");
        String name = scanner.nextLine();

        User = name;
    }
    public void insertion(){

        //запит на скільки користувач хоче поповнити акаунт
        System.out.println(User + ": ведіть бажану суму поповнення: ");
        int deposit = scanner.nextInt();

        balanceAcaunt = deposit + balanceAcaunt;
        System.out.println(balanceAcaunt);
    }

    public void withdrawal(){

        //запит у користувача скільки він хоче зняти коштів
        System.out.println(User + ":  ведіть бажану суму зняття: ");
        int sum = scanner.nextInt();

        if (balanceAcaunt < sum){
            sum = sum;
            System.out.println("Недостатньо коштів на акаунті");
        } else if (balanceAcaunt >= sum) {
            balanceAcaunt = balanceAcaunt - sum;
            System.out.println(balanceAcaunt);
        }
    }
    public void getBalanceAcaunt() {

        System.out.println(User + ": Зараз на рахунку у вас: " + balanceAcaunt);
    }
}
