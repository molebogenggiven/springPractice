package springIn28Minutes.springproject.springin5steps.xml;

//@Component
public class XMLPersonDAO {

   // @Autowired
    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
