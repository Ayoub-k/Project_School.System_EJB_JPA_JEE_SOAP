/**
 * BibService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceBibloi;

public interface BibService extends java.rmi.Remote {
    public void modfierLivre(serviceBibloi.Livre arg0) throws java.rmi.RemoteException;
    public void supprimerBiblio(int arg0) throws java.rmi.RemoteException;
    public void emprunterLivres(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public serviceBibloi.Biblio ajouterBiblio(serviceBibloi.Biblio arg0) throws java.rmi.RemoteException;
    public serviceBibloi.Livre[] rechercherLivre(java.lang.String arg0) throws java.rmi.RemoteException;
    public void supprimerLivre(int arg0) throws java.rmi.RemoteException;
    public serviceBibloi.Livre[] tousLivre() throws java.rmi.RemoteException;
    public serviceBibloi.Livre[] consulterLivres(java.lang.String arg0) throws java.rmi.RemoteException;
    public serviceBibloi.Livre ajouterLivre(serviceBibloi.Livre arg0, int arg1) throws java.rmi.RemoteException;
    public serviceBibloi.Biblio chercherBib(int arg0) throws java.rmi.RemoteException;
}
