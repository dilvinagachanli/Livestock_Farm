import java.util.ArrayList;
import java.util.List;

class Veterinarian {

    // Command interface
    interface Command {
        void execute();
    }

    // Concrete command for vaccination
    public class VaccinateCommand implements Command {
        private Veterinarian vet;
        private Cattle cattle;

        public VaccinateCommand(Veterinarian vet, Cattle cattle) {
            this.vet = vet;
            this.cattle = cattle;
        }

        @Override
        public void execute() {
            vet.vaccinate(cattle);
        }
    }

    public class CheckEarTagCommand implements Command {
        private Veterinarian vet;
        private Cattle cattle;

        public CheckEarTagCommand(Veterinarian vet, Cattle cattle) {
            this.vet = vet;
            this.cattle = cattle;
        }

        @Override
        public void execute() {
            vet.checkEarTag(cattle);
        }
    }


    
    public void vaccinate(Cattle cattle) {
        if (!cattle.isVaccinated) {
            cattle.isVaccinated = true;
            System.out.println("Cattle " + cattle.id + " has been vaccinated.");
        } else {
            System.out.println("Cattle " + cattle.id + " is already vaccinated.");
        }
    }

    public void checkEarTag(Cattle cattle) {
        if (!cattle.hasEarTag) {
            cattle.hasEarTag = true;
            System.out.println("Ear tag applied to cattle " + cattle.id);
        } else {
            System.out.println("Cattle " + cattle.id + " already has an ear tag.");
        }
    }

    class CommandInvoker {
        private List<Command> commandQueue = new ArrayList<>();

        public void addCommand(Command command) {
            commandQueue.add(command);
        }

        public void runCommands() {
            for (Command command : commandQueue) {
                command.execute();
            }
            commandQueue.clear();
        }
    }
}
