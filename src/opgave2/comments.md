I getNumberOfCorrectAnswersForEachQuestion metoden har I en outerIndex variabel. Denne bruger I kun til 

    this.students.get(outerIndex).getAnswers()

Så der vil jeg nok bruge en foreach løkke

    for (Student student : students) {
        char[] studentAnswers = student.getAnswers();
        ...
    }

Men der er nok en personlig preference. Jeres løsning fungerer fint.

---

Super løsning.