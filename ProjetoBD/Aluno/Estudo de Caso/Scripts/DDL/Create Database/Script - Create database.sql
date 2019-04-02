if exists (select name from master.dbo.sysdatabases where name = N'Curso')
	drop database [Curso]
go

create database [Curso]	
	on (name = N'Curso_Data'
		, filename = N'D:\CursoSQL\DB\MDF\Curso_Data.MDF' 
		, size = 10
		, filegrowth = 10%) 
	log	
		on (name = N'Curso_Log'	
		, filename = N'D:\CursoSQL\DB\LOG\Curso_Log.LDF'  
		, size = 01
		, filegrowth = 10%)
 --collate SQL_Latin1_General_CP1_CI_AS
