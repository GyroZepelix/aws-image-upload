import React, {useState, useEffect} from 'react';
import './App.css';
import axios from 'axios';
import { Dropzone } from './components/Dropzone';


const UserProfiles = () => {

  const [UserProfiles, setUserProfiles] = useState([]);

  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/v1/user-profile").then(res => {
      console.log(res);
      setUserProfiles(res.data);
    });
  }

  useEffect(() => {
    fetchUserProfiles();
  }, []);


  return UserProfiles.map((UserProfile, index) => {
    return (<div key={index}>
      {UserProfile.userProfileId ? <img src={`http://localhost:8080/api/v1/user-profile/${UserProfile.userProfileId}/image/download`}></img> : null}
      <br/>
      <br/>
      <h1>{UserProfile.username}</h1>
      <p>{UserProfile.userProfileId}</p>
      <Dropzone user={UserProfile} />
      <br/>
    </div>)
    ;
  })
}

function App() {
  return <div className='App'>
    <UserProfiles/>
  </div>
}

export default App
