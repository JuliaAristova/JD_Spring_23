public class Mentor {

    //composition
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }
    public void manageAccount() {
        fullTimeMentor.creteAccount();
        partTimeMentor.creteAccount();
    }
}
