class RegularNotificacionFactory implements NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        return new NotificacionRegularPorEmail();
    }
    public SMSNotificacion crearSMSNotificacion() {
        return new NotificacionRegularPorSMS();
    }
    public AppNotificacion crearAppNotificacion() {
        return new NotificacionRegularPorApp();
    }
}