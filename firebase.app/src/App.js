import React from "react";
import logo from "./logo.svg";
import "./App.css";
import * as firebase from "firebase";
import Button from "react-bootstrap/Button";


//configures the data of firebase into the application.
var config = {
  apiKey: "AIzaSyD86kKZI6C1BK0rT_3LuKbaj28vV2b5Mgs",
  authDomain: "secondexample-309a6.firebaseapp.com",
  databaseURL: "https://secondexample-309a6.firebaseio.com",
  projectId: "secondexample-309a6",
  storageBucket: "secondexample-309a6.appspot.com",
  messagingSenderId: "640908964043"
};

firebase.initializeApp(config); 

const database = firebase.database(); //calls on the variable "database" to retrieve the info from firebase.database
 //Use the shorthand notation to access the default project's Firebase services

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      image: logo,
      speed: 2000
    };
  }
  componentDidMount() {
    const imageRef = database.ref("image/");
    const speedRef = database.ref("speed/");
    imageRef.on("value", snapshot => {
      snapshot.val() == null
        ? this.setState({ image: logo })
        : this.setState({ image: snapshot.val() });
    });
    speedRef.on("value", snapshot => {
      this.setState({
        speed: snapshot.val()
      });
    });
  }

  writeData = e => {
    e.preventDefault();
    const image = e.target.elements.imageForm.value;
    const speed = e.target.elements.speed.value;

    database.ref("image/").set(image, function(error) {
      if (error) {
        alert("That didn't work, please try again.");
      } else {
        console.log("Successful submit!");
      }
    });
    database.ref("speed/").set(speed, function(error) {
      if (error) {
        alert("That didn't work, please try again.");
      } else {
        console.log("Successful submit!");
      }
    });
  };

  resetImage = e => {
    e.preventDefault();
    database.ref("image/").set(null, function(error) {
      if (error) {
        alert("That didn't work, please try again.");
      } else {
        console.log("Successful submit!");
      }
    });
  };
  changeSpeed = e => {
    const speed = e.target.value;
    e.preventDefault();
    database.ref("speed/").set(speed, function(error) {
      if (error) {
        alert("That didn't work, please try again.");
      } else {
        console.log("Successful submit!");
      }
    });
  };



//Change Bootstrap code. Make more customzize.

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img
            src={this.state.image}
            alt="logo"
            style={{
              animation: `App-logo-spin infinite ${this.state.speed}ms linear`,
              height: "40vmin",
              pointerEvents: "none"
            }}
          />
          <br />
          <br />
          <br />
          <div className="col-lg-4">
            Paste an image here to change the spinning image:
            <form
              id="form"
              className="my-2 my-lg-0"
              onSubmit={this.writeData.bind(this)}
            >
              <input
                className="form-control mr-sm-4"
                type="text"
                name="imageForm"
              />
              <br />
              <Button
                className="btn btn-lg"
                variant="primary"
                type="submit"
                form="form"
              >
                Get Weird
              </Button>
              <Button
                className="btn btn-lg"
                variant="primary"
                form="form"
                onClick={this.resetImage.bind(this)}
              >
                Reset Image
              </Button>
              <br />
              <br />
              Set Speed:
              <input
                type="range"
                min="0"
                max="5000"
                defaultValue="2000"
                className="slider"
                name="speed"
                onChange={this.changeSpeed.bind(this)}
              />
            </form>
          </div>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export default App;