<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
<script type='Text/JavaScript'>
	$(document).ready(function() {
		setTimeout(render, 300);
	});
	function render() {
		$.get("http://localhost:8080/ImpalaService/impala/circles",
				function(d) {
					console.log(d.dummy);
					var i = 1;
					var svg = d3.select("svg");
					svg.selectAll("circle").data(d.dummy).enter().append(
							"circle").attr("r", function(d) {
						return d.i * Math.random() * 5;
					}).attr("cx", function(d) {
						return d.i * Math.random() * 30;
					}).attr("cy", function(d) {
						return 100;
					}).style("fill", "steelblue");
					svg.selectAll("circle").data(d.dummy).exit().remove();
				});
		setTimeout(render, 300);
	}
</script>
</head>
<body>
	<svg width="100%" height="100%">
	
  </svg>
</body>
</html>