/*
   ������ 10.
   1.������� ��������, ���� �������� ������� �䒺���� �������� ������.
*/
lessThanZero(Numb):- Numb < 0.
koll([],0):-!.
koll([H|Tail], K):- lessThanZero(H),!,koll(Tail,K1), K is K1 + 1.
koll([_|Tail], K):- koll(Tail,K).
/*
   ������ 10.
   2.������� ��������, ���� ��������, �� � ����� ������ ������������� �� ���������.
*/
isSortedDecrease([X,Y|T]) :-
    !,
    X - Y >= 0,
    isSortedDecrease([Y|T]).
isSortedDecrease(_).