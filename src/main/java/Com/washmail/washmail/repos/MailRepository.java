package Com.washmail.washmail.repos;

import org.springframework.data.repository.CrudRepository;

import Com.washmail.washmail.models.Mail;

public interface MailRepository extends CrudRepository<Mail, Long> {

}
