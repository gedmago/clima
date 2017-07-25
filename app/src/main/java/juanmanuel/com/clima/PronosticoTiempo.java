package juanmanuel.com.clima;


public class PronosticoTiempo {

    private String coordLon;    //longitud
    private String coordLat;    //latitud
    private String weatherId;   // id del tiempo
    private String description; //descripción del tiempo
    private String icon;        //ícono
    private String base;        //parámetro interno
    private String temp ;       //temperatura
    private String pressure;    //presión atmosférica en hPa
    private String humidity;    //humedad en %
    private String tempMin;     //temeratura mínima
    private String tempMax;     // temperatura máxima
    private String seaLevel;    //presión atmosférica al nivel del mar en hPa
    private String grndLevel;   //presión atmosférica al nivel del suelo en hPa
    private String speed;       //velocidad del viento en m/s
    private String degWind;     //dirección del viento en º
    private String all;         //nubosidad en%
    private String tresHRain;   //volumen de lluvia en las últimas 3 horas
    private String tresHSnow;   //volumen de nieve en las últimas tres horas
    private String country;     //código de país
    private String sunrise;     //hora de salida del sol
    private String sunset;      //hora de puesta del sol
    private String id;          //código de ciudad
    private String name;        //nombre de ciudad

    public PronosticoTiempo(String temp,String tempMax,String tempMin) {
        this.temp=temp;
        this.tempMax=tempMax;
        this.tempMin=tempMin;
    }

    public String getCoordLon() {
        return coordLon;
    }

    public void setCoordLon(String coordLon) {
        this.coordLon = coordLon;
    }

    public String getCoordLat() {
        return coordLat;
    }

    public void setCoordLat(String coordLat) {
        this.coordLat = coordLat;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(String seaLevel) {
        this.seaLevel = seaLevel;
    }

    public String getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(String grndLevel) {
        this.grndLevel = grndLevel;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDegWind() {
        return degWind;
    }

    public void setDegWind(String degWind) {
        this.degWind = degWind;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getTresHRain() {
        return tresHRain;
    }

    public void setTresHRain(String tresHRain) {
        this.tresHRain = tresHRain;
    }

    public String getTresHSnow() {
        return tresHSnow;
    }

    public void setTresHSnow(String tresHSnow) {
        this.tresHSnow = tresHSnow;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
