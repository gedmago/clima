package juanmanuel.com.clima;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParserJson  {
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
    private String speed;       //velocidad del viento en m/s
    private String degWind;     //dirección del viento en º
    private String all;         //nubosidad en%
    private String tresHRain;   //volumen de lluvia en las últimas 3 horas
    private String country;     //código de país
    private String sunrise;     //hora de salida del sol
    private String sunset;      //hora de puesta del sol
    private String id;          //código de ciudad
    private String name;        //nombre de ciudad

    private String data;        //String para los datos del json

    public ParserJson(String data) {

        this.data=data;
        parsear();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                parsear();
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private void parsear(){

        try {
            JSONObject padre=new JSONObject(data);

            JSONObject coord=padre.getJSONObject("coord");
            coordLat=coord.getString("lat");
            coordLon=coord.getString("lon");


            JSONArray weather=padre.getJSONArray("weather");
            JSONObject wather0=weather.getJSONObject(0);
            weatherId=wather0.getString("id");
            description=wather0.getString("description");
            icon=wather0.getString("icon");


            base=padre.getString("base");

            JSONObject main=padre.getJSONObject("main");
            temp=main.getString("temp");
            pressure=main.getString("pressure");
            humidity=main.getString("humidity");
            tempMin=main.getString("temp_min");
            tempMax=main.getString("temp_max");



            JSONObject wind=padre.getJSONObject("wind");
            speed=wind.getString("speed");
            degWind=wind.getString("deg");

            JSONObject clouds=padre.getJSONObject("clouds");
            all=clouds.getString("all");

            JSONObject rain=padre.getJSONObject("rain");
            tresHRain=rain.getString("3h");

            JSONObject sys=padre.getJSONObject("sys");
            country=sys.getString("country");
            sunrise=sys.getString("sunrise");
            sunset=sys.getString("sunset");

            id=padre.getString("id");
            name=padre.getString("name");
        }
        catch (Exception e){

        }





    }
}
