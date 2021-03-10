import controller.Controller;
import entites.employee.consultant.Consultant;
import entites.toy.adulttoys.AdultToys;
import entites.toy.boytoys.BoyToys;
import entites.toy.girlsboys.GirlToys;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    private final Controller controller;

    Scanner scanner = new Scanner(System.in);

    public Application(Controller controller) {
        this.controller = controller;
    }

    public void Start() {
        while (true) {
            System.out.println("Choose one option:\n 1) To show all consultants\n " +
                    "2)To show consultants by name\n " +
                    "3)To show consultants by id\n " +
                    "4)To add the consultant \n " +
                    "5)To remove the consultant by id\n " +
                    "6)To show all toys\n " +
                    "7)To show toys by id\n " +
                    "8)To show toys by name\n " +
                    "9)To show toys from department\n " +
                    "10)To show toys from department by name\n " +
                    "11)Stop choosing");
            int number = scanner.nextInt();
            if (number == 1) {
                MenuShowAllConsultants();
            } else if (number == 2) {
                MenuShowConsultantsByName();
            } else if (number == 3) {
                MenuShowConsultantByID();
            } else if (number == 4) {
                MenuAddConsultant();
            } else if (number == 5) {
                MenuRemoveConsultantById();
            } else if (number == 6) {
                MenuShowAllToys();
            } else if (number == 7) {
                MenuShowToysByID();
            } else if (number == 8) {
                MenuShowToysByName();
            } else if (number == 9) {
                MenuShowToysByDepartment();
            } else if (number == 10) {
                MenuShowToysByDepartmentAndName();
            } else if (number == 11) {
                System.out.println("Bye!!");
                break;
            } else {
                System.out.println("There is no such option here");
                continue;
            }
            System.out.println("---------------------------------------------------------------");
        }
    }


    private void MenuShowAllConsultants() {
        System.out.println(controller.ShowAllConsultants());
    }

    private void MenuShowConsultantsByName() {
        System.out.println("Write the name:");
        String name = scanner.next();
        System.out.println(controller.ShowConsultantsByName(name));
    }

    private void MenuShowConsultantByID() {
        System.out.println("Write the id:");
        int id = scanner.nextInt();
        System.out.println(controller.ShowConsultantById(id));
    }

    private void MenuShowConsultantsByDepartment() {
        System.out.println("Write number of department(1-Department of toys for boys;2-Department of toys for girls;3-Department of toys for adults");
        int department;
        while (true) {
            department = scanner.nextInt();
            if (department <= 3 && department >= 1) {
                break;
            } else {
                System.out.println("There isn't this department.Write again!");
                continue;
            }
        }
        System.out.println(controller.ShowConsultantsByDepartment(department));
    }

    private void MenuAddConsultant() {
        System.out.println("Write number of department(1-Department of toys for boys;2-Department of toys for girls;3-Department of toys for adults");
        int department;
        while (true) {
            department = scanner.nextInt();
            if (department <= 3 && department >= 1) {
                break;
            } else {
                System.out.println("There isn't this department.Write again!");
                continue;
            }
        }
        if (department == 1) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the surname:");
            String surname = scanner.next();
            System.out.println("Write the age:");
            int age = scanner.nextInt();
            System.out.println("Write the salary:");
            int salary = scanner.nextInt();
            System.out.println("Write the date of the employment(format is yyyy-mm-dd):");
            String date = scanner.next();
            LocalDate start_date = LocalDate.parse(date);
            Consultant consultant = new Consultant(name, surname, age, salary, start_date);
            System.out.println(controller.AddConsultantsToBoyToys(consultant));
        } else if (department == 2) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the surname:");
            String surname = scanner.next();
            System.out.println("Write the age:");
            int age = scanner.nextInt();
            System.out.println("Write the salary:");
            int salary = scanner.nextInt();
            System.out.println("Write the date of the employment(format is yyyy-mm-dd):");
            String date = scanner.next();
            LocalDate start_date = LocalDate.parse(date);
            Consultant consultant = new Consultant(name, surname, age, salary, start_date);
            System.out.println(controller.AddConsultantsToGirlToys(consultant));
        } else if (department == 3) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the surname:");
            String surname = scanner.next();
            System.out.println("Write the age:");
            int age = scanner.nextInt();
            System.out.println("Write the salary:");
            int salary = scanner.nextInt();
            System.out.println("Write the date of the employment(format is yyyy-mm-dd):");
            String date = scanner.next();
            LocalDate start_date = LocalDate.parse(date);
            Consultant consultant = new Consultant(name, surname, age, salary, start_date);
            System.out.println(controller.AddConsultantsToAdultToys(consultant));
        }
    }

    private void MenuRemoveConsultantById() {
        System.out.println("Write the id:");
        int id = scanner.nextInt();
        System.out.println(controller.RemoveConsultantByID(id));
    }

    private void MenuShowAllToys() {
        System.out.println(controller.ShowAllTOYS());
    }

    private void MenuShowToysByName() {
        System.out.println("Write the name:");
        String name = scanner.next();
        System.out.println(controller.ShowToysByName(name));
    }

    private void MenuShowToysByID() {
        System.out.println("Write the id:");
        int id = scanner.nextInt();
        System.out.println(controller.ShowToyByID(id));
    }

    private void MenuAddToy() {
        System.out.println("Write number of department(1-Department of toys for boys;2-Department of toys for girls;3-Department of toys for adults");
        int department;
        while (true) {
            department = scanner.nextInt();
            if (department <= 3 && department >= 1) {
                break;
            } else {
                System.out.println("There isn't this department.Write again!");
                continue;
            }
        }
        if (department == 1) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the price:");
            int price = scanner.nextInt();
            System.out.println("Write the manufacturer:");
            String manufacturer = scanner.next();
            System.out.println("Write the quantity:");
            int quantity = scanner.nextInt();
            BoyToys boyToys = new BoyToys(name, price, manufacturer, quantity);
            System.out.println(controller.AddBoyToys(boyToys));
        } else if (department == 2) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the price:");
            int price = scanner.nextInt();
            System.out.println("Write the manufacturer:");
            String manufacturer = scanner.next();
            System.out.println("Write the quantity:");
            int quantity = scanner.nextInt();
            GirlToys girlToys = new GirlToys(name, price, manufacturer, quantity);
            System.out.println(controller.AddGirlToys(girlToys));
        } else if (department == 3) {
            System.out.println("Write the name:");
            String name = scanner.next();
            System.out.println("Write the price:");
            int price = scanner.nextInt();
            System.out.println("Write the manufacturer:");
            String manufacturer = scanner.next();
            System.out.println("Write the quantity:");
            int quantity = scanner.nextInt();
            AdultToys adultToys = new AdultToys(name, price, manufacturer, quantity);
            System.out.println(controller.AddAdultToys(adultToys));
        }
    }

    private void MenuRemoveToyById() {
        System.out.println("Write the id:");
        int id = scanner.nextInt();
        System.out.println(controller.RemoveToyByID(id));
    }

    private void MenuShowToysByDepartment() {
        System.out.println("Write number of department(1-Department of toys for boys;2-Department of toys for girls;3-Department of toys for adults");
        int department;
        while (true) {
            department = scanner.nextInt();
            if (department <= 3 && department >= 1) {
                break;
            } else {
                System.out.println("There isn't this department.Write again!");
                continue;
            }
        }
        if (department == 1) {
            System.out.println(controller.ShowAllBoyToys());
        } else if (department == 2) {
            System.out.println(controller.ShowAllGirlToys());
        } else if (department == 3) {
            System.out.println(controller.ShowAllAdultToys());
        }
    }

    private void MenuShowToysByDepartmentAndName() {
        System.out.println("Write number of department(1-Department of toys for boys;2-Department of toys for girls;3-Department of toys for adults");
        int department;
        while (true) {
            department = scanner.nextInt();
            if (department <= 3 && department >= 1) {
                break;
            } else {
                System.out.println("There isn't this department.Write again!");
                continue;
            }
        }
        System.out.println("Write the name:");
        String name = scanner.next();
        if (department == 1) {
            System.out.println(controller.ShowBoyToysByName(name));
        } else if (department == 2) {
            System.out.println(controller.ShowBoyGirlByName(name));
        } else if (department == 3) {
            System.out.println(controller.ShowAdultToysByName(name));
        }
    }


}
