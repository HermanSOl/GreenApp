import FavoritesSection from "./FavoritesSection";
import UserIcon from "./UserIcon";
import { Link } from "react-router-dom";

function UserPage(){
    return(
        <div className="user-page">
            <UserIcon username={"randomname"}/>
            <FavoritesSection></FavoritesSection>
        </div>
        

    );
} 

export default UserPage;