max(X, Y, X) :- X>=Y, !.
max(_, Y, Y).

/*
������(X, Y):-������(X, Y).
������(X, Y) :- ������(X, Z) ������(Z, Y) %-��� ��������
*/

fact(0,1):-!.
fact(N,F):-
            N1 is N-1,
            fact(N1,F1),
            F is F1*N.

fibo(0,0):-!.
fibo(1,1):-!.
fibo(N,F):-
            N1 is N-1, N2 is N-2,
            fibo(N1,F1), fibo(N2,F2),
            F is F1+F2.