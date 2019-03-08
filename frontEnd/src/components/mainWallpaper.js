import React from 'react';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import Col from 'react-bootstrap/Col';

import { library } from '@fortawesome/fontawesome-svg-core';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';

import Typed from 'react-typed';

library.add(faSearch);

export default class mainWallpaper extends React.Component {
  typed = null;

  render() {
    return (
      <div className="main_background">
        <div className="main_background-black">
          <Container>
            <Form>
              <Form.Row className="scrollable-dropdown-menu">
                <Col className="main-search" sm={10} md={4}>
                  <div className="typed">
                    <Typed
                      typedRef={ref => {
                        this.typed = ref;
                      }}
                      className="main_typed"
                      strings={[
                        '강남구',
                        '서대문구',
                        '송파구',
                        '서초구',
                        '동대문구',
                      ]}
                      typeSpeed={130}
                      backSpeed={90}
                      showCursor
                      cursorChar="|"
                      attr="placeholder"
                      loop>
                      <input type="text" />
                    </Typed>
                  </div>
                </Col>
                <Col className="searchIcon_Container" sm={2} md={1}>
                  <FontAwesomeIcon className="searchIcon" icon="search" />
                </Col>
                <Col
                  className="search_text"
                  md={{ span: 7, offset: 2 }}
                  sm={12}>
                  <span>지역 검색 후 검색결과 클릭</span>
                </Col>
              </Form.Row>
            </Form>
          </Container>
        </div>
      </div>
    );
  }
}
