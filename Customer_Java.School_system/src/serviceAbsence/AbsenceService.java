/**
 * AbsenceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceAbsence;

public interface AbsenceService extends java.rmi.Remote {
    public void deleteEtuNassid(int arg0) throws java.rmi.RemoteException;
    public serviceAbsence.StatistiqueEtu[] allInfoEtu() throws java.rmi.RemoteException;
    public serviceAbsence.Etudiant add_Etudiant(serviceAbsence.Etudiant arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public serviceAbsence.StatistiqueEtu ajouterInfoAbsence(serviceAbsence.StatistiqueEtu arg0, int arg1) throws java.rmi.RemoteException;
    public serviceAbsence.Etudiant[] allEtudiants() throws java.rmi.RemoteException;
    public void updateEtu(serviceAbsence.Etudiant arg0) throws java.rmi.RemoteException;
    public serviceAbsence.Etudiant[] blackListCreate() throws java.rmi.RemoteException;
    public serviceAbsence.Etudiant readEtu(int arg0) throws java.rmi.RemoteException;
    public serviceAbsence.StatistiqueEtu findstatistique_etu(int arg0) throws java.rmi.RemoteException;
}
