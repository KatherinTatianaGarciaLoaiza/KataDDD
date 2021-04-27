package example.DDD.dominio.centrodeprestamos;

import co.com.sofka.domain.generic.EventChange;
import example.DDD.dominio.centrodeprestamos.event.AdministradorCreado;
import example.DDD.dominio.centrodeprestamos.event.CentroDePrestamosCreado;
import example.DDD.dominio.centrodeprestamos.event.PrestamoCreado;

public class CentroDePrestamosChange extends EventChange {
    public CentroDePrestamosChange(CentroDePrestamos centroDePrestamos) {
        apply((CentroDePrestamosCreado event) -> {
            centroDePrestamos.idSolicitante = event.getIdSolicitante();
            centroDePrestamos.caracteristicasDelPrestamo = event.getCaracteristicasDelPrestamo();
            centroDePrestamos.tipoDeSolicitud = event.getTipoDeSolicitud();
        });

        apply((AdministradorCreado event) -> {
            var id = event.getAdministradorId();
            centroDePrestamos.administradores.put(id, new Administrador(id, event.getDatosPersonales()));
        });

        apply((PrestamoCreado event) -> {
            var id = event.getPrestamoId();
            centroDePrestamos.prestamos.put(id, new Prestamo(id, event.getEstadoDelRecurso(), event.getTipoDeRecurso(), event.getFecha(), event.getTiempoDePrestamo(), event.getSalirDeLaInstitucion()));
        });
    }
}
