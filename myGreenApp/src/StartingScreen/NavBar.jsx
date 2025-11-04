import { Link } from "react-router-dom"

function NavBar(){
    return(
        <div class = "nav-bar">
            <Link to="/home-page" class = "navbar-link gradient-text">Browse</Link>
            <Link to = "/user-account" class = "navbar-link gradient-text">Account</Link>
        </div>
    );
}

export default NavBar