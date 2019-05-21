import React from 'react';
import logo from './logo.svg';
import './App.css';
import firebase from "firebase";

const config = {
  apiKey: "AIzaSyDMOF62-Lllci2_WVTiUmFCRpLf9ybIVeM",
  authDomain: "inclassexample-72475.firebaseapp.com",
  databaseURL: "https://inclassexample-72475.firebaseio.com",
  projectId: "inclassexample-72475",
  storageBucket: "inclassexample-72475.appspot.com",
  messagingSenderId: "375276104600"
};
firebase.initializeApp(config);

const database = firebase.database();

class App extends React.Component {
  constructor() {
    super();
    this.state = {
        text: "default value"
    };
  }

  componentDidMount() {
    const textRef = database.ref("text/");

    textRef.on("value", snapshot => {
      this.setState({
        text: snapshot.val()
      })
    })
  }

  writeData = e => {
    e.preventDefault();

    const textValue = e.target.elements.inputText.value;

    database.ref("text/").set(textValue, function(error){
      error ? alert("error") : console.log("it works")})
  }

  render() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />  
        <h1>{this.state.text}</h1>   
        <form onSubmit = {this.writeData.bind(this)}>
          <input type="text" name="inputText" />
          <input type="submit" name="submitButton" />
        </form>
      </header>
    </div>
    );
  }
}

export default App;
