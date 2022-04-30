package server;

import source_code.Approver;
import source_code.DeliveryManager;
import source_code.Director;
import source_code.Supervisor;

public class LeaveRequestWorkFlow {
    public static Approver getApprover() {
        Approver supervisor = new Supervisor();
        Approver manager = new DeliveryManager();
        Approver director = new Director();
 
        supervisor.setNext(manager);
        manager.setNext(director);
        return supervisor;
    }
}
