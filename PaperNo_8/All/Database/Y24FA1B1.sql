USE [master]
GO
Create database Y24FA1B1
GO
USE Y24FA1B1
GO

CREATE TABLE [dbo].[Types](
	[TypeID] [int] NOT NULL PRIMARY KEY,
	[TypeName] [varchar](max) NOT NULL
)
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
insert into [Types] values(1,'Length of string')
insert into [Types] values(2,'Vowel characters')
insert into [Types] values(3,'Cosonant characters')
GO

CREATE TABLE [dbo].[Executions](
	[ExecutionID] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
	[InputString] [varchar](max) NOT NULL,
	[Result] [int] NOT NULL,
	[TypeID] int references [Types]([TypeID])
)
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
insert into [Executions]([InputString],[Result],[TypeID]) values('FPT University',14,1)
insert into [Executions]([InputString],[Result],[TypeID]) values('Java web',3,2)
insert into [Executions]([InputString],[Result],[TypeID]) values('Computing Fundamental',21,1)
insert into [Executions]([InputString],[Result],[TypeID]) values('Practical Exam',5,2)
insert into [Executions]([InputString],[Result],[TypeID]) values('Welcome to FPTU',8,3)
GO