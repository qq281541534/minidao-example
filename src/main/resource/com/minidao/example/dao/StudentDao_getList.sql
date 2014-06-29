SELECT * FROM student WHERE 1=1
<#if student.name ?exists && student.name ?length gt 0>
	and name = :student.name
</#if>
<#if student.age ?exists && student.age ?length gt 0>
	and age = :student.age
</#if>

