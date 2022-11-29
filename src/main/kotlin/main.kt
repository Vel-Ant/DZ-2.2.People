package ru.netology

fun main() {
    var likes = 10101L

    val people = if (likes === 1L || likes in 21L.. 1_000_000_000 step 10) "человеку" else "человекам"
    println("Понравилось $likes $people")
}

/** Что касается употребления слова "людей", то наткнулся на такое пояснение на сайте http://new.gramota.ru/
 *
 * Ответ справочной службы русского языка
 * Цитируем "Русскую грамматику" (М., 1980):
 *
 * В сочетании с числ. пять, шесть (и далее) слово человек во всех падежах выступает в формах мн. ч., образованных
 * от основы человек-, а не от супплетивной основы форм мн. ч. лю|д'|-: человек, человекам, человеками, о человеках
 * (пять человек, с семью человеками). В сочетании с числ. два, оба, три, четыре перечисленные словоформы мн. ч.
 * выступают во всех падежных формах, кроме формы им. п. (не было и двух человек, речь идет о трех человеках).
 * При сочетании с формой им. п. этих числительных выступает словоформа род. п. ед. ч. (два человека, три человека,
 * оба человека).
 *
 * При наличии определения в сочетаниях с числ. пять, шесть (и далее) во всех падежах и с числ. два, три, четыре
 * в косв. пад. может употребляться слово люди: пять незнакомых человек и пять незнакомых людей, не было и трех взрослых
 * человек и не было и трех взрослых людей.
 *
 *
 * Поэтому вместо слова "людям" решил употребить слово "человекам". Доверюсь более грамотным людям чем я в этом вопросе.
 * Если потребуется изменить, сообщите.
 */
