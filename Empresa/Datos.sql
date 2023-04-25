use Empresa
 insert into secciones values(1,'Administracion',300);
 insert into secciones values(2,'Contaduría',400);
 insert into secciones values(3,'Sistemas',500);

 insert into empleados values(1,'f','Lopez','Ana','Colon 123',1,2,'casado','1990-10-10',600);
 insert into empleados values(2,'m','Lopez','Luis','Sucre 235',1,0,'soltero','1990-02-10',650);
 insert into empleados values(3,'m','Gomez','Pablo','Bulnes 321',3,2,'casado','1998-10-09',900);
 insert into empleados values(4,'m','Garcia','Marcos','Sarmiento 1234',2,3,'divorciado','1998-07-12',800);
 insert into empleados values(5,'f','Perez','Laura','Peru 1254',3,3,'casado','2000-05-09',700); select * from empleados use Empresa DELETE FROM empleados WHERE IDEmpleado = 1; use Empresa SELECT * FROM empleados WHERE IDEmpleado = 2 
 
 use Empresa UPDATE empleados SET 
 IDEmpleado = 1, sexo='m', apellido='Lopez', nombre='Luis', 
 domicilio='Sucre 235', seccion=1, cantidadhijos=0, 
 estadocivil='soltero',fechaingreso='1990-02-10', sueldo=650 WHERE IDEmpleado= 2