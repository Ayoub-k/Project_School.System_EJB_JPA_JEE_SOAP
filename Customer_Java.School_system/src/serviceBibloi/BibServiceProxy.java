package serviceBibloi;

public class BibServiceProxy implements serviceBibloi.BibService {
  private String _endpoint = null;
  private serviceBibloi.BibService bibService = null;
  
  public BibServiceProxy() {
    _initBibServiceProxy();
  }
  
  public BibServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBibServiceProxy();
  }
  
  private void _initBibServiceProxy() {
    try {
      bibService = (new serviceBibloi.BibServiceServiceLocator()).getBibServicePort();
      if (bibService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bibService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bibService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bibService != null)
      ((javax.xml.rpc.Stub)bibService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviceBibloi.BibService getBibService() {
    if (bibService == null)
      _initBibServiceProxy();
    return bibService;
  }
  
  public void modfierLivre(serviceBibloi.Livre arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    bibService.modfierLivre(arg0);
  }
  
  public void supprimerBiblio(int arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    bibService.supprimerBiblio(arg0);
  }
  
  public void emprunterLivres(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    bibService.emprunterLivres(arg0, arg1);
  }
  
  public serviceBibloi.Biblio ajouterBiblio(serviceBibloi.Biblio arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.ajouterBiblio(arg0);
  }
  
  public serviceBibloi.Livre[] rechercherLivre(java.lang.String arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.rechercherLivre(arg0);
  }
  
  public void supprimerLivre(int arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    bibService.supprimerLivre(arg0);
  }
  
  public serviceBibloi.Livre[] tousLivre() throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.tousLivre();
  }
  
  public serviceBibloi.Livre[] consulterLivres(java.lang.String arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.consulterLivres(arg0);
  }
  
  public serviceBibloi.Livre ajouterLivre(serviceBibloi.Livre arg0, int arg1) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.ajouterLivre(arg0, arg1);
  }
  
  public serviceBibloi.Biblio chercherBib(int arg0) throws java.rmi.RemoteException{
    if (bibService == null)
      _initBibServiceProxy();
    return bibService.chercherBib(arg0);
  }
  
  
}