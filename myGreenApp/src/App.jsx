import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import StartingPage from "./StartingScreen/StartingPage"
import LoginCard from "./StartingScreen/LoginCard";

import CreateAccountPage from "./StartingScreen/CreateAccountPage";
import HomeScreen from "./HomeScreen/HomePage";


function App() {
    return(
        <Router>
            <Routes>
                <Route path="/" element={<HomeScreen/>}/>
                <Route path="/login-account" element={<LoginCard title={"Login"}/>}/>
                <Route path="/create-account" element={<CreateAccountPage/>}/>
                <Route path="/home-page" element = {<HomeScreen/>}/>
            </Routes>
        </Router>
        
        
    )
}

export default App
