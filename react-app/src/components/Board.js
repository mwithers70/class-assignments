import React, { Component } from 'react';
import '../css/Board.css';
import Note from './Note';


class Board extends Component {
    constructor() {
        super();
    }

    render() {
        return (
            <div>
                <div className="div-board">
                <div className="row" >
                <Note title = "Class Notes" body="Use constructors when extending another class"/>
                <Note title="My address" body="Nunya" />
                <Note title="React Notes" body="Everything in React is component" />
                </div>
                </div>
                <div>
                    <button className = "btn btn-success add-button">Add</button>
                </div>
            </div>
        )
    }
}
export default Board;