import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.LinkedList;

public class Workerr extends UnicastRemoteObject implements IWorker {

    public Workerr() throws RemoteException {
        super();
    }

    @Override
    public ResultType calculate(InputType inputParam) throws RemoteException {
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = inputParam.x1; i < inputParam.x2; i++) {

            int podzielnik = 2;

            boolean liczbaPierwsza = true;

            if (i > 3) {

                while (podzielnik < i) {
                    if (i % podzielnik == 0) {

                        liczbaPierwsza = false;break;

                    }
                    podzielnik++;}

            }
            if (liczbaPierwsza) {

                lista.add(i);

            }

        }
        return new ResultType(lista);

    }
}
