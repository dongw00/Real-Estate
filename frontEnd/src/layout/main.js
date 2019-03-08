import React, { Fragment } from 'react';
import Nav from '../components/Nav';
import MainWallpaper from '../components/mainWallpaper';
import Footer from '../components/footer';

import '../assets/css/app/all.css';
import '../assets/css/app/index.css';

export default class main extends React.Component {
  render() {
    return (
      <Fragment>
        <Nav />
        <MainWallpaper />
        <Footer />
      </Fragment>
    );
  }
}
