package edu.psu.ab.ist.sworks.pojo;

public class Fingerprint {

    private boolean _isAllowedAccess;

    public Fingerprint() {

    }

    public Fingerprint(boolean isAllowedAccess) {
        this._isAllowedAccess = isAllowedAccess;
    }

    public boolean getIsAllowedAccess() {
        return _isAllowedAccess;
    }

    public void setIsAllowedAccess(boolean isAllowedAccess) {
        this._isAllowedAccess = isAllowedAccess;
    }




}
