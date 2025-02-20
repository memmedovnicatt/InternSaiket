package third_task;

public class Task {
    String tittle;
    boolean status;

    public Task(String tittle, boolean status) {
        this.tittle = tittle;
        this.status = status;
    }

    public Task() {
        this.status = false;

    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void markCompleted() {
        this.status = true;
    }

    public void display() {
        System.out.println("Tittle: " + tittle);
        System.out.println("Status: " + status);
    }
}