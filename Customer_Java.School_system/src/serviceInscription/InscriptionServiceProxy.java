package serviceInscription;

public class InscriptionServiceProxy implements serviceInscription.InscriptionService {
  private String _endpoint = null;
  private serviceInscription.InscriptionService inscriptionService = null;
  
  public InscriptionServiceProxy() {
    _initInscriptionServiceProxy();
  }
  
  public InscriptionServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initInscriptionServiceProxy();
  }
  
  private void _initInscriptionServiceProxy() {
    try {
      inscriptionService = (new serviceInscription.InscriptionServiceServiceLocator()).getInscriptionServicePort();
      if (inscriptionService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inscriptionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inscriptionService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inscriptionService != null)
      ((javax.xml.rpc.Stub)inscriptionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviceInscription.InscriptionService getInscriptionService() {
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    return inscriptionService;
  }
  
  public serviceInscription.Admin ajouterAdmin(serviceInscription.Admin arg0) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    return inscriptionService.ajouterAdmin(arg0);
  }
  
  public void supprimerAdmin(int arg0) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    inscriptionService.supprimerAdmin(arg0);
  }
  
  public void ajouterFiliere(serviceInscription.Filiere arg0) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    inscriptionService.ajouterFiliere(arg0);
  }
  
  public serviceInscription.Etudiant[] consulter(serviceInscription.Filiere arg0) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    return inscriptionService.consulter(arg0);
  }
  
  public serviceInscription.Filiere[] toutesfilieres() throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    return inscriptionService.toutesfilieres();
  }
  
  public serviceInscription.Etudiant stocke(serviceInscription.Etudiant arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    return inscriptionService.stocke(arg0, arg1, arg2);
  }
  
  public void supprimerFiliere(int arg0) throws java.rmi.RemoteException{
    if (inscriptionService == null)
      _initInscriptionServiceProxy();
    inscriptionService.supprimerFiliere(arg0);
  }
  
  
}