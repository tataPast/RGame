

у каждого хозяина есть пул боевых роботов. Ну к примеру реализованный через ArrayList (пример).
Число роботов у каждого хозяина случайно но колеблиться от 10 до 50ти.

роботы имеют:
- уникальный идентификатор
- булевое состояние рабочий/сломан
- число побед

роботы умеют:
- атаковать.
- убегать.
- ломаться.

И арена.
правила арены:
каждый из хозяев выставляет по роботу.
для каждого робота производится рандом число от 1 до 6ти.
1-3: робот струсил.
4-6: робот атакует.

В боях учавствуют только исправные роботы.

- Если один атакует а второй трусит: выигрывает тот кто атаковал. В этом случае победившему роботу начисляется
одна победа, а статус второго робота меняется на "сломан".

- Если оба атакуют: производится рандом число от 1 до 6ти. Выигрывает тот чье число больше.
    -- Если числа равные, производится повторный бросок. Если и при повторном броске результат равный, обоим присуждается победа и оба становятся сломанными.
- Если оба струсили: победа обоим не начисляется.

Соревнование продолжается до тех пор, пока у обоих хозяев есть исправные роботы. Если роботы закончились: соревнования завершаются.
По результатам соревнований выводится статистика:
- самый победоносный робот, даже если он сломан, и его хозяин.
- имя победившего хозяина.
- число роботов которое было в начале у каждого из хозяев.
- число оставшихся роботов.

еще в отчет: число раундов




