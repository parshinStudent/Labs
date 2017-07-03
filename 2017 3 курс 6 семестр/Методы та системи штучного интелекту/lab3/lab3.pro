/*
   Варіант 10.
   1.Створіть предикат, який обчислює кількість від’ємних елементів списку.
*/
lessThanZero(Numb):- Numb < 0.
koll([],0):-!.
koll([H|Tail], K):- lessThanZero(H),!,koll(Tail,K1), K is K1 + 1.
koll([_|Tail], K):- koll(Tail,K).
/*
   Варіант 10.
   2.Створіть предикат, який перевіряє, чи є даний список впорядкованим за убуванням.
*/
isSortedDecrease([X,Y|T]) :-
    !,
    X - Y >= 0,
    isSortedDecrease([Y|T]).
isSortedDecrease(_).