class UrgenteNotificacionFactory implements NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        return new NotificacionUrgentePorEmail();
    }
    public SMSNotificacion crearSMSNotificacion() {
        return new NotificacionUrgentePorSMS();
    }
    public AppNotificacion crearAppNotificacion() {
        return new NotificacionUrgentePorApp();
    }
}