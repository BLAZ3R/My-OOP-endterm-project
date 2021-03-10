package controller;

import entites.employee.consultant.Consultant;
import entites.toy.adulttoys.AdultToys;
import entites.toy.boytoys.BoyToys;
import entites.toy.girlsboys.GirlToys;
import repositories.repository_consultant.IRepositoryConsultants;
import repositories.repository_toy.IRepositoryToy;
import repositories.repository_toy.rep_atoys.IRepositoryAdultToys;
import repositories.repository_toy.rep_btoys.IRepositoryBoyToys;
import repositories.repository_toy.rep_gtoys.IRepositoryGirlToys;

public class Controller {
    private IRepositoryConsultants iRepositoryConsultants;
    private IRepositoryToy iRepositoryToy;
    private IRepositoryBoyToys iRepositoryBoyToys;
    private IRepositoryGirlToys iRepositoryGirlToys;
    private IRepositoryAdultToys iRepositoryAdultToys;

    public Controller(IRepositoryConsultants iRepositoryConsultants, IRepositoryToy iRepositoryToy, IRepositoryBoyToys iRepositoryBoyToys, IRepositoryGirlToys iRepositoryGirlToys, IRepositoryAdultToys iRepositoryAdultToys) {
        this.iRepositoryConsultants = iRepositoryConsultants;
        this.iRepositoryToy = iRepositoryToy;
        this.iRepositoryBoyToys = iRepositoryBoyToys;
        this.iRepositoryGirlToys = iRepositoryGirlToys;
        this.iRepositoryAdultToys = iRepositoryAdultToys;
    }

    public String ShowAllConsultants() {
        String res = iRepositoryConsultants.ShowAllConsultants().toString();
        return res;
    }

    public String ShowConsultantsByName(String name) {
        String res = iRepositoryConsultants.ShowConsultantsByName(name).toString();
        return res;
    }

    public String ShowConsultantById(int id) {
        String res = iRepositoryConsultants.ShowConsultantByID(id).toString();
        return res;
    }

    public String ShowConsultantsByDepartment(int id) {
        String res = iRepositoryConsultants.ShowConsultantsByDepartment(id).toString();
        return res;
    }

    public String AddConsultantsToBoyToys(Consultant consultant) {
        if (iRepositoryConsultants.addConsultantToBoyToys(consultant)) {
            return "Consultant was added";
        } else {
            return "Error";
        }
    }

    public String AddConsultantsToGirlToys(Consultant consultant) {
        if (iRepositoryConsultants.addConsultantToGirlToys(consultant)) {
            return "Consultant was added";
        } else {
            return "Error";
        }
    }

    public String AddConsultantsToAdultToys(Consultant consultant) {
        if (iRepositoryConsultants.addConsultantToAdultToys(consultant)) {
            return "Consultant was added";
        } else {
            return "Error";
        }
    }

    public String RemoveConsultantByID(int id) {
        if (iRepositoryConsultants.removeConsultantByID(id)) {
            return "Consultant was removed";
        } else {
            return "Error";
        }
    }
    public String ShowAllTOYS(){
        String res= iRepositoryToy.ShowAllToys().toString();
        return res;
    }
    public String ShowToysByName(String name){
        String res = iRepositoryToy.ShowToysByName(name).toString();
        return res;
    }
    public String ShowToyByID(int id){
        String res = iRepositoryToy.ShowToyByID(id).toString();
        return res;
    }
    public String RemoveToyByID(int id){
        if(iRepositoryToy.RemoveToyByID(id)){
            return "Toy was removed";
        }else{
            return "Error";
        }
    }
    public String ShowAllGirlToys(){
        String res= iRepositoryGirlToys.ShowAllGirlToys().toString();
        return res;
    }
    public String ShowBoyGirlByName(String name){
        String res = iRepositoryGirlToys.ShowGirlToysByName(name).toString();
        return res;
    }
    public String AddGirlToys(GirlToys girlToys){
        if(iRepositoryGirlToys.addGirlToys(girlToys)){
            return "Toy was added";
        }else {
            return "Error";
        }
    }
    public String ShowAllAdultToys(){
        String res= iRepositoryAdultToys.ShowAllAdultToys().toString();
        return res;
    }
    public String ShowAdultToysByName(String name){
        String res = iRepositoryAdultToys.ShowAdultToysByName(name).toString();
        return res;
    }
    public String AddAdultToys(AdultToys adultToys){
        if(iRepositoryAdultToys.AddAdultToys(adultToys)){
            return "Toy was added";
        }else {
            return "Error";
        }
    }
    public String ShowAllBoyToys(){
        String res= iRepositoryBoyToys.ShowAllBoyToys().toString();
        return res;
    }
    public String ShowBoyToysByName(String name){
        String res = iRepositoryBoyToys.ShowBoyToysByName(name).toString();
        return res;
    }
    public String AddBoyToys(BoyToys boyToys){
        if(iRepositoryBoyToys.AddBoyToys(boyToys)){
            return "Toy was added";
        }else {
            return "Error";
        }
    }
}
