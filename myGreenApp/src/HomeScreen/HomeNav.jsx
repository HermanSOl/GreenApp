import {FaUserCircle} from "react-icons/fa";

function NavBar(){
    return(
        <nav className="navbar">
            <div className="nav-logo"></div>
            <FaUserCircle className= "account-icon"/>
        </nav>
    );
}

export default NavBar;