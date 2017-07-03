/*
¬ар≥ант 10.
Ќапиш≥ть правила, що визначають наступн≥ в≥дносини:
Х	дочка, син;
Х	муж, дружина (виход€чи з на€вност≥ сп≥льних д≥тей);
Х	внучка, д≥д.
*/
man(roma).
man(jenya).
man(sasha).
man(igor).
man(riki).


women(tina).
women(diana).
women(lina).
women(alina).
women(dasha).
women(nina).

parent(igor,lina).
parent(roma,alina).
parent(lina,alina).
parent(jenya,sasha).
parent(jenya,dasha).
parent(diana,sasha).
parent(diana,dasha).
parent(nina,lina).
parent(riki,diana).
parent(tina,diana).

father(X,Y):-parent(X, Y),man(X).
mother(X,Y):-parent(X, Y),women(X).

child(Father, Mother, Child):-father(Father, Child),mother(Mother, Child).
husband(Father):-child(Father,Mother,Child),man(Father).
wife(Mother):-child(Father,Mother,Child),women(Mother).

son(Son):-child(X,Y,Son),man(Son).
dauther(Dauther):-child(X,Y,Dauther),women(Dauther).

granddauther(Granddauther,Grandfather):-parent(Grandfather,Z),parent(Z,Granddauther),women(Granddauther).
grandfather(Grand,Grandchild):-parent(Grandfather,Z),parent(Z,Grandchild),man(Grandfather).
