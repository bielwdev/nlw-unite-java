package rocketseat.com.passin.domain.event;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

    private String id;
}
