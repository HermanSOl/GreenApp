import LoginCard from "./LoginCard"
import BackgroundStars from "./BackgroundStars"
import NavBar from "./NavBar"
import CreateAccCard from "./CreateAccCard"
import { Link } from "react-router-dom";

function StartingPage() {
    return(
        <div className="StartScreen">
            <NavBar/>
            <BackgroundStars count={300} color={"#9FD8A3"}/>
            <BackgroundStars count={200} color={"#356859"}/>
            <LoginCard title={"Login"}/>
        </div>
        
    )
}

export default StartingPage
