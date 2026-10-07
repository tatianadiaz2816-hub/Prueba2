  import jakarta.persistence.*;
  import org.springframework.aot.generate.GeneratedTypeReference;

  import javax.annotation.processing.Generated;
  import java.Math.Bigdecimal;
    import java.time.LocalDate;

    @Entity
    @Table (name = "tarjetas_banco" )
    public class Tarjetabanco {

        @Id
        @GeneratedValue(Strategy=GeneratedType.IDENTITY)

        private long id;
        private string productID;
        private string cardId;
        private string cardNumber;
        private string holderName;
        private LocalDate issuedAt;
        private LocalDate expiresAt;
        private string status;
        private LocalDate blockedAt;
        private string blockedReason;
        private string balance;
        private string currency;

    }