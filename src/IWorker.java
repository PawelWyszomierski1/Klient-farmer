import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorker extends Remote {

    ResultType calculate(InputType inputParam) throws RemoteException;
}
