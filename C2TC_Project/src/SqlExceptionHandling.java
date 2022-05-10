
public void setClientInfo(String sname, String svalue) throws SQLClientInfoException {
    try {
        checkClosed();
        ((java.sql.Connection) this.mc).setClientInfo(sname, svalue);
    } catch (SQLException sqlEx) {
        try {
            checkAndFireConnectionError(sqlEx);
        } catch (SQLException sqlEx2) {
            SQLClientInfoException client_Ex = new SQLClientInfoException();
            client_Ex.initCause(sqlEx2);
            throw client_Ex;
        }
    }
}
}