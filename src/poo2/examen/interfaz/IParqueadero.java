package poo2.examen.interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IParqueadero extends Remote{

	public String registrarVehiculo(String nombreParqueadero, String idParqueadero, 
			String placa, boolean aplicaDescuento) throws RemoteException;
	public boolean pagarVehiculo(String placa) throws RemoteException;
	public int consultarValorPagar(String placa) throws RemoteException;
	
}
