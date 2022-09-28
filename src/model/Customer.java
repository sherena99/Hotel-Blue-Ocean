package model;

public class Customer {
     private String id;
     private String name;
     private String age;
     private String nicNumber;
     private String email;
     private String address;
     private String mobileNumber;
     private String date;
     private String time;
     private String duration;
     private String selectedPackage;
     private String selectedRoom;
     private String selectedMeals;
     private String totalCost;


    public Customer(String text, String txtNameText, String txtAgeText) {
    }

    public Customer(String id, String name, String age, String nicNumber, String email, String address, String mobileNumber, String date, String time, String duration, String selectedPackage, String selectedRoom, String selectedMeals, String totalCost) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setNicNumber(nicNumber);
        this.setEmail(email);
        this.setAddress(address);
        this.setMobileNumber(mobileNumber);
        this.setDate(date);
        this.setTime(time);
        this.setDuration(duration);
        this.setSelectedPackage(selectedPackage);
        this.setSelectedRoom(selectedRoom);
        this.setSelectedMeals(selectedMeals);
        this.setTotalCost(totalCost);
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSelectedPackage() {
        return selectedPackage;
    }

    public void setSelectedPackage(String selectedPackage) {
        this.selectedPackage = selectedPackage;
    }

    public String getSelectedRoom() {
        return selectedRoom;
    }

    public void setSelectedRoom(String selectedRoom) {
        this.selectedRoom = selectedRoom;
    }

    public String getSelectedMeals() {
        return selectedMeals;
    }

    public void setSelectedMeals(String selectedMeals) {
        this.selectedMeals = selectedMeals;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }
}

