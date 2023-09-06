--       [Задача 1]
-- Вывести фамилию работника со вторым максимальным опытом работы

-- для наглядности, вывожу работников по убыванию стажа работы
select
	*
from
	test_task_db.employees  
order by Experience desc
;

-- вывод фамилии работника со вторым максимальным опытом работы 
select
	Surname
from (
	select
		*
	from
		test_task_db.employees  
	order by Experience desc 
) as temp limit 1,1;
	
 