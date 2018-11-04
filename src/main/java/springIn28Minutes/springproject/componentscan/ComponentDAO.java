package springIn28Minutes.springproject.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springIn28Minutes.springproject.springin5steps.scope.JdbcConnection;

@Component
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}
