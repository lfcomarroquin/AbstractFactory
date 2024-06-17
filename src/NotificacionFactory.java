interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
}

interface EmailNotificacion {
    void enviarEmail();
}
interface SMSNotificacion {
    void enviarSMS();
}
interface AppNotificacion {
    void enviarApp();
}