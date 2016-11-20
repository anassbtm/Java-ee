<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
</head>

<body>


<form method="POST" action="" id="form1">
    <header><h1><I>Ajouter un compteurs de temps</I></h1></header>
	<fieldset>

		<div class="row">
		<br>
			<section class="col col-5">
				<label class="select">
						<select name="country"  id="country">
							<option value="0" selected disabled>Langue</option>												
							<option value="fr">Français</option>
							<option value="en">Anglais</option>
							<option value="ar">Arabe</option>			
						</select>
						<label style="padding:5px;font-size:10px;position:absolute;top:-25px;right:0px;" id="Labelcountry"></label>	
					
				</label>
			</section>
			<br>
			<section>
				<label class="input">		
					<label>Donner un titre </label>										
					<input type="text" name="titre" id="titre" placeholder="titre"  autocomplete="off">
					<label style="padding:5px;font-size:10px;position:absolute;top:-25px;right:0px;" id="LabelSiret"></label>
				</label>
			</section>	
			
			<p>Date: <input type="text" id="datepicker"></p>
			<fieldset>
			<label>Mon compteur </label>	
			
			</fieldset>
		</div>								
	</fieldset>
	<a href="index.jsp">Accueil</a>
</form>			
</body>
</html>
