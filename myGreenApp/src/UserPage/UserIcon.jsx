import {FaUserCircle} from "react-icons/fa";

function UserIcon({username}){
    <div className="user-container">
        <FaUserCircle className="user-icon"/>
        <p>{username}</p>
    </div>
}

export default UserIcon;