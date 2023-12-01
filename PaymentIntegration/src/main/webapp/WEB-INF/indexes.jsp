<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

  <!DOCTYPE html>
  <html>

  <head>
    <title>PYTM</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <base href="${pageContext.request.contextPath}" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
      .form-group {
        width: '25%'
      }
    </style>
    <script type="text/javascript">
      $(document).ready(function () {
        getCamaraStatus();

        var intervalID = setInterval(function () {
          inc++;
          displaylogo1(inc);
        }, 3000);
      });

      function getCamaraStatus() {
        $.ajax({
          url: "/api/getAll",
          type: "POST", // http method
          contentType: "application/json",
          success: function (data) {
            console.log(data);
            $("#container").children().remove();
            if (data.status == 0) {
              $("#container").append(
                "<button type='button' onclick='startScannerThread()' class='btn btn-success btn-lg'>Start</button>"
              );
            } else {
              $("#container").append(
                "<button type='button' onclick='stopScannerThread()' class='btn btn-danger btn-lg'>Stop</button>"
              );
            }
          },
        });
      }

      function validate(event)
      {
        let id=document.getElementById("amt");
        console.log(event.target.value);
      }



    </script>
    <style type="text/css">
      #container {
        text-align: center;
        width: 500px;
        height: 500px;
        padding-top: 200px;
      }

      .btn {
        font-size: 25px;
      }
    </style>
  </head>

  <body class="bg-body">
    <!-- Navbar Starts -->
    <nav class="navbar navbar-expand-lg navbar-light bg-green">
      <img src="../images/main.png" />
    </nav>
    <br />
    <div style="width: 20%;border-color:springgreen;align-items:center;justify-items: center ;" class="bg-info pt-2 justify-content-center ml-5">
      <form>
        <div class="pl-5 pr-5">
          <label for="exampleInputEmail1">Amount</label>
          <input type="text" class="form-control" id="amt" aria-describedby="emailHelp" onchange="">
        
          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="pl-5 pr-5">
          <label for="Mail">Mail ID</label>
          <input type="email" class="form-control" id="mail">
        </div>
        <div class="pl-5 pr-5">
          <label for="Mobile Number">Mobile Number</label>
          <input type="tel" class="form-control" id="mob">
        </div>
        <div class="form-group form-check pl-5 pr-5">
          <input type="checkbox" class="form-check-input" id="chk">
          <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <div class="pl-5 pr-5">
          <output id="amt" ></output> <button type="submit" class="btn btn-primary pl-5" onclick="validate();">Pay</button>
        </div>
      </form>
    </div>
    <!--  footer start here  -->
    <!-- <div class="sticky-footer">
      <div class="container-fluid">
        <div class="d-sm-flex justify-content-center justify-content-sm-between">
          <span class="footer-left text-center text-sm-left d-block d-sm-inline-block copy-right"><i>Copyright ©
              2013-2022 Telangana Prohibition & Excise Department |
              All rights reserved.</i></span>
          <span
            class="footer-right float-none float-sm-right d-block mt-2 pb-3 pb-sm-0 mt-sm-0 text-center social-links">
            <i>Powered by
              <a href="http://ctel.in/" class="text-white" target="_blank">C-Tel Infosystems Pvt LTd.</a></i>
          </span>
        </div>
      </div>
    </div> -->
    <!-- footer Ends here  -->
  </body>

  </html>