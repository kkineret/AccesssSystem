package smallITgroup.door.dao.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DoorNotFoundExeption extends RuntimeException {

	private static final long serialVersionUID = -433184779955377531L;
}
