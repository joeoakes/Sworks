package edu.psu.ab.ist.sworks.pojo;

public class Mission
{
    private String _climate, _continent, _landmarks, _terrain;
    private boolean _hasLandmarkOfInterest;

    public Mission() {}

    public Mission(String climate, String continent, String landmarks, String terrain,
                   boolean hasLandmarkOfInterest)
    {
        this._climate = climate;
        this._continent = continent;
        this._landmarks = landmarks;
        this._terrain = terrain;
        this._hasLandmarkOfInterest = hasLandmarkOfInterest;
    }

    public String getClimate()
    {
        return _climate;
    }

    public void setClimate(String climate)
    {
        this._climate = climate;
    }

    public String getContinent()
    {
        return _continent;
    }

    public void setContinent(String continent)
    {
        this._continent = continent;
    }

    public String getLandmarks()
    {
        return _landmarks;
    }

    public void setLandmarks(String landmarks)
    {
        this._landmarks = landmarks;
    }

    public String getTerrain()
    {
        return _terrain;
    }

    public void setTerrain(String terrain)
    {
        this._terrain = terrain;
    }

    public boolean isHasLandmarkOfInterest()
    {
        return _hasLandmarkOfInterest;
    }

    public void setHasLandmarkOfInterest(boolean hasLandmarkOfInterest)
    {
        this._hasLandmarkOfInterest = hasLandmarkOfInterest;
    }
}
