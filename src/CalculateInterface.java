import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculateInterface extends Remote{
    public ResultType calculate(InputType inputParam) throws RemoteException;
}
