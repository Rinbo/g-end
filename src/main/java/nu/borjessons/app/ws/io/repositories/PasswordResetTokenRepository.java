package nu.borjessons.app.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import nu.borjessons.app.ws.io.entity.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long> {
	PasswordResetTokenEntity findByToken(String token);
}
