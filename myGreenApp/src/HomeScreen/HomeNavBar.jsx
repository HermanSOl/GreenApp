import {FaUserCircle} from "react-icons/fa";
import { Link } from "react-router-dom";

function HomeNavBar(){
    return(
        <nav className="navbar">
            <div className="nav-logo">GreenApp</div>
            <Link to="/user-account" className="account-link">
            <FaUserCircle className= "account-icon"/>
            </Link>
            
        </nav>
    );
}

export default HomeNavBar;