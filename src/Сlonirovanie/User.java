package Сlonirovanie;
class User implements Cloneable {
    int id;
    String name;
    Address address;

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }

    // Глубокое клонирование
    public User deepClone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }

}