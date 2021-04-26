package example.DDD.dominio.centrodeprestamos.valuesObject;

import co.com.sofka.domain.generic.Identity;

public class CentroDePrestamosId extends Identity {
        private CentroDePrestamosId(String uid) {
            super(uid);
        }

        public CentroDePrestamosId() {
        }

        public static CentroDePrestamosId of(String uid) {
            return new CentroDePrestamosId(uid);
        }
}
