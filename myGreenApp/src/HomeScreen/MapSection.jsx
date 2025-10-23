
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import "leaflet/dist/leaflet.css";
import L from "leaflet";

var greenIcon = new L.Icon({
    iconUrl: 'https://raw.githubusercontent.com/pointhi/leaflet-color-markers/master/img/marker-icon-2x-green.png',
    shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
    iconSize: [25, 41],
    iconAnchor: [12, 41],
    popupAnchor: [1, -34],
    shadowSize: [41, 41]
  });

function MapSection() {
    return (
        <div className="map-container">
            <MapContainer center={[49.2827, -123.1207]} zoom={12} className="map">
                <TileLayer
                    url="https://{s}.basemaps.cartocdn.com/light_all/{z}/{x}/{y}{r}.png"/>
                <Marker position={[49.2827, -123.1207]} icon={greenIcon}>
                    <Popup>Eco Store Example</Popup>
                </Marker>
            </MapContainer>
        </div>
    )
}

export default MapSection;