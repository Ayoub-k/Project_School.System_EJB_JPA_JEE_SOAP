package serviceAbsence;

public class AbsenceServiceProxy implements serviceAbsence.AbsenceService {
  private String _endpoint = null;
  private serviceAbsence.AbsenceService absenceService = null;
  
  public AbsenceServiceProxy() {
    _initAbsenceServiceProxy();
  }
  
  public AbsenceServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAbsenceServiceProxy();
  }
  
  private void _initAbsenceServiceProxy() {
    try {
      absenceService = (new serviceAbsence.AbsenceServiceServiceLocator()).getAbsenceServicePort();
      if (absenceService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)absenceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)absenceService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (absenceService != null)
      ((javax.xml.rpc.Stub)absenceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviceAbsence.AbsenceService getAbsenceService() {
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService;
  }
  
  public void deleteEtuNassid(int arg0) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    absenceService.deleteEtuNassid(arg0);
  }
  
  public serviceAbsence.StatistiqueEtu[] allInfoEtu() throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.allInfoEtu();
  }
  
  public serviceAbsence.Etudiant add_Etudiant(serviceAbsence.Etudiant arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.add_Etudiant(arg0, arg1, arg2);
  }
  
  public serviceAbsence.StatistiqueEtu ajouterInfoAbsence(serviceAbsence.StatistiqueEtu arg0, int arg1) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.ajouterInfoAbsence(arg0, arg1);
  }
  
  public serviceAbsence.Etudiant[] allEtudiants() throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.allEtudiants();
  }
  
  public void updateEtu(serviceAbsence.Etudiant arg0) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    absenceService.updateEtu(arg0);
  }
  
  public serviceAbsence.Etudiant[] blackListCreate() throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.blackListCreate();
  }
  
  public serviceAbsence.Etudiant readEtu(int arg0) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.readEtu(arg0);
  }
  
  public serviceAbsence.StatistiqueEtu findstatistique_etu(int arg0) throws java.rmi.RemoteException{
    if (absenceService == null)
      _initAbsenceServiceProxy();
    return absenceService.findstatistique_etu(arg0);
  }
  
  
}