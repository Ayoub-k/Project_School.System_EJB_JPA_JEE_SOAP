/**
 * InscriptionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceInscription;

public interface InscriptionService extends java.rmi.Remote {
    public serviceInscription.Admin ajouterAdmin(serviceInscription.Admin arg0) throws java.rmi.RemoteException;
    public void supprimerAdmin(int arg0) throws java.rmi.RemoteException;
    public void ajouterFiliere(serviceInscription.Filiere arg0) throws java.rmi.RemoteException;
    public serviceInscription.Etudiant[] consulter(serviceInscription.Filiere arg0) throws java.rmi.RemoteException;
    public serviceInscription.Filiere[] toutesfilieres() throws java.rmi.RemoteException;
    public serviceInscription.Etudiant stocke(serviceInscription.Etudiant arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public void supprimerFiliere(int arg0) throws java.rmi.RemoteException;
}
