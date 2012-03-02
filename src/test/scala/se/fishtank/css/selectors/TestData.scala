package se.fishtank.css.selectors

object TestData {
  val SelectorExpected: Seq[(String, Int)] = List(
    ("head", 1),
    ("div#pagecontent", 1),
    ("div:has(table tr td)", 2),
    ("body:has(html)", 0),
    ("div#nonexistent", 0)
  )

  val Html =
    <html>
      <head>
        <title>
          Test Page
        </title>
      </head>
      <body>
        <div id="pagecontent">
          <div class="article title-overview">
            <table>
              <tr>
                <td id="img_primary">
                  <img src="http://dvd-cover"/>
                  <div>subtitle of cover</div>
                </td>
                <td id="overview-top">
                  <h1 class="header">The Shining <span>(<a href="/year/1980/">1980</a>)</span></h1>
                </td>
              </tr>
            </table>
          </div>
        </div>
      </body>
    </html>

}
