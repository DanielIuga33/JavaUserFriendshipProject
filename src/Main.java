import repository.RepoFriendship;
import repository.RepoUser;
import service.ServiceFriendship;
import service.ServiceUser;
import ui.Ui;

public class Main {

    public static void main(String[] args) {
        RepoUser repoUsr = new RepoUser();
        ServiceUser usr = new ServiceUser(repoUsr);
        RepoFriendship repoFr= new RepoFriendship();
        ServiceFriendship fr = new ServiceFriendship(repoFr);
        Ui ui = new Ui(fr, usr);

        ui.run();

    }

}