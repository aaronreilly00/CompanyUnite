<!DOCTYPE html>
<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8"/>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>

</head>
<%@ include file="leastPrivilegeHeader.jsp"%>
<body>
<h2 class="text-center text-success">Who we are</h2>
<p class="text-center mb-5">We're CompaniesUnite a platform to help businesses and entrepreneurs to work together, adapting to the restrictions introduced by the pandemic.</p>

<h2 class="text-center text-success">What matters to us</h2>
<p class="text-center">What matters to us is that businesses and people looking to venture new areas or looking to adapt under these circumstances are kept in business.</p> 
<p class="text-center mb-5">We want to help you adapt and create relationships outside of your organisation providing better chances of survival.</p>

<h2 class="text-center text-success">What we do</h2>
<p class="text-center">We provide a platform that allows anyone interested on the internet to browse the list of businesses interested or looking to help others.</p>
<p class="text-center">We display the details YOU send to us, as we have administrators working around the clock to get your information out there.</p>
<p class="text-center">We update customers data if they wish to make enhancements to the initial data they provided.</p>
<p class="text-center mb-5">We also remove the data immediately once requested by that business.</p>

<h2 class="text-center text-success">How we do it</h2>
<p class="text-center">Once the form below is recieved, one of our administrators will pick up the task and write the corresponding information to the system.</p>
<p class="text-center mb-5">Business information will be displayed immediately on the system once the administrators enters it into the database.</p>

<form class="row g-3 needs-validation" novalidate>
  <div class="col-md-4">
    <label for="companyName" class="form-label">Company name</label>
    <input type="text" class="form-control" id="companyName" value="Company Name" required>
    </div>
  </div>
  <div class="col-md-4">
    <label for="address" class="form-label">Address</label>
    <input type="text" class="form-control" id="address" value="Address" required>
    </div>
  </div>
  <div class="col-md-4">
    <label for="postcode" class="form-label">Postcode</label>
    <div class="input-group has-validation">
      <input type="text" class="form-control" id="postcode" value="Postcode" aria-describedby="inputGroupPrepend" required>
      </div>
    </div>
  </div>
  <div class="col-md-6">
    <label for="details" class="form-label">Additional Information</label>
    <input type="text" class="form-control" id="details" value="Additional Information" required>
    </div>
  </div>
  <div class="col-md-3">
    <label for="Sector" class="form-label">Sector</label>
    <input type="text" class="form-control" id="Sector" value="Sector" required>
    </div>
  </div>
  <div class="col-12 mb-5 text-center">
    <button class="btn btn-info" type="submit">Submit form</button>
  </div>
</form>
</body>
<%@ include file="footer.jsp"%>
</html>