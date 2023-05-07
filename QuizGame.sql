create database QuizGame
use QuizGame

create table AccountPlayer (AccPlayerID int identity(1, 1) primary key,
							Phone int not null,
							[Password] varchar(30) not null,
							Email varchar(30) not null,
							Fullname varchar(50) not null,
							Gender char(10) check (Gender in ('Male', 'Female')) not null,
							[Status] int check ([Status] in (0, 1)) not null)
							
create table Questions (QuesID int identity(1, 1) primary key,
						Question varchar(500) not null,
						Answer1 varchar(100) not null,
						Answer2 varchar(100) not null,
						Answer3 varchar(100) not null,
						Answer4 varchar(100) not null,
						RightAnswer char(5) check (RightAnswer in ('A', 'B', 'C', 'D')) not null,
						[Level] int check ([Level] in (1, 2, 3)) not null)

create table PointConvention ([No] int identity(1, 1) primary key,
							RightAnswer int not null,
							WrongAnswer int not null)
							
create table ResultPlayer (ResultID int identity(1, 1) primary key,
							AccPlayerID int references AccountPlayer(AccPlayerID) not null,
							Marks int not null,
							[Time] float not null)
							
create table AccountAdmin (AccAdminID int identity(1, 1) primary key,
							Username varchar(30) not null,
							[Password] varchar(30) not null,
							Fullname varchar(50) not null,
							Email varchar(30) not null)
							
create table Feedback (FeedID int identity(1, 1) primary key,
						AccPlayerID int references AccountPlayer(AccPlayerID) not null,
						Feedback varchar(50) not null)
						
insert into AccountPlayer values (0702547289, 'annhi123', 'lacannhi2909@gmail.com', 'Lac An Nhi', 'Male', 0),
								(0376285372, 'hanvu456', 'lachanvu0610@gmail.com', 'Lac Han Vu', 'Female', 1),
								(0937382175, 'giatue789', 'lacgiatue1610@gmail.com', 'Lac Gia Tue', 'Male', 0)
								
insert into Questions values ('How many colors does a rainbow have?', 'A. 5', 'B. 6', 'C. 7', 'D. 8', 'C', 1),
							('Which feudal dynasty in Vietnam defeated the Mongol invaders three times?', 'A. Tran Dynasty', 'B. Ly Dynasty', 'C. Tien Le Dynasty', 'D. Hau Le Dynasty', 'A', 2),
							('Which is the hottest planet in the solar system?', 'A. Mars', 'B. Venus', 'C. Mercury', 'D. Jupiter', 'B', 3),
							('Which is not a programming language?', 'A. C++', 'B. JavaScript', 'C. Pascal', 'D. Hyperlink', 'D', 2),
							('Which of the following species belongs to the group of "warm-blooded animals"?', 'A. Chameleon', 'B. Frog', 'C. Crocodile', 'D. Mouse', 'D', 2),
							('The worlds first telephone call was between inventor Alexander Graham Bell and...?', 'A. His wife', 'B. City mayor', 'C. Assistant', 'D. Patent registration office', 'C', 3),
							('The "light year" is the unit used to measure what quantity in the universe?', 'A. Time', 'B. Distance', 'C. Speed', 'D. Acceleration', 'B', 2),
							('Which of the following scientists invented the rabies vaccine?', 'A. Louis Pasteur', 'B. Hippocrates', 'C. Albert Einstein', 'D. Edward Jenner', 'A', 3),
							('Which of the following is a gymnosperm?', 'A. Cashew', 'B. Almond', 'C. Walnut', 'D. Ginkgo', 'D', 1),
							('When we eat carrots, what part are we actually eating?', 'A. Roots', 'B. Fruit', 'C. Trunk', 'D. Leaf', 'A', 1),
							('Which country has the largest area in the world?', 'A. America', 'B. India', 'C. Canada', 'D. China', 'C', 1),
							('Which country has the largest population in the world?', 'A. America', 'B. India', 'C. Canada', 'D. China', 'D', 1),
							('According to astronomers, what are the main components of comets?', 'A. Metal', 'B. Soil and rock', 'C. Melting lava', 'D. Ice', 'D', 3),
							('Myopia is an eye that when not adjusted, where is the focus located?', 'A. Focus is in front of the retina', 'B. Focus is behind the retina', 'C. Focus is in the middle of the retina', 'D. Other answers', 'A', 2),
							('Augustin Louis Cauchy was a mathematician from which country?', 'A. Germany', 'B. France', 'C. England', 'D. Spain', 'B', 3),
							('How many pairs of chromosomes are there in humans?', 'A. 13', 'B. 23', 'C. 14', 'D. 21', 'B', 2),
							('Who discovered the three laws of heredity?', 'A. Albert Einstein', 'B. Isaac Newton', 'C. Gregor Mendel', 'D. Galileo Galilei', 'C', 3),
							('Which player won the 2006 World Ballon dOr?', 'A. Fabio Canavaro', 'B. Ronaldinho', 'C. Roberto Carlos', 'D. Cafu', 'A', 3),
							('Which country is known as the land of the rising sun?', 'A. Japan', 'B. Korean', 'C. Australia', 'D. Philippines', 'A', 1),
							('What genus do humans belong to?', 'A. Panina', 'B. Homo', 'C. Gorilla', 'D. Pongo', 'B', 1),
							('What class do crocodiles belong to?', 'A. Reptilia', 'B. Amphibia', 'C. Osteichthyes', 'D. Mammalia', 'A', 1)

insert into PointConvention values (50, 0),
									(100, 50),
									(200, 100),
									(400, 100),
									(800, 300),
									(1600, 700),
									(3200, 1500),
									(6400, 3200),
									(12500, 3200),
									(25000, 9300),
									(50000, 21800),
									(100000, 46800),
									(500000, 96800)

insert into AccountAdmin values ('GiaBao', 'giabao111', 'Ngo Gia Bao', 'ngbaoa18050@cusc.ctu.edu.vn'),
								('DienThanh', 'dienthanh222', 'Nguyen Thi Dien Thanh', 'ntdthanha20127@cusc.ctu.edu.vn')

insert into Feedback values (1, 'Good app'),
							(2, 'Very well'),
							(1, 'Interesting'),
							(3, 'Useful knowledge'),
							(2, 'Less attractive')

insert into ResultPlayer values (1, 3200, 29.426)

create view FeedbackAccountPlayer as 
	select AccountPlayer.Fullname as Fullname, 
		AccountPlayer.Phone as Phone, 
		Feedback.Feedback as Feedback
		from AccountPlayer inner join Feedback
		on AccountPlayer.AccPlayerID = Feedback.AccPlayerID

create view Rankings as 
	select AccountPlayer.AccPlayerID as AccPlayerID,
		AccountPlayer.Fullname as Fullname,
		ResultPlayer.Marks as Marks,
		ResultPlayer.[Time] as [Time]
		from AccountPlayer inner join ResultPlayer
		on AccountPlayer.AccPlayerID = ResultPlayer.AccPlayerID
