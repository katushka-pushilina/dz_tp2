[![Build Status](https://github.com/katushka-pushilina/dz_tp2/actions/workflows/java-ci.yml/badge.svg)](https://github.com/katushka-pushilina/dz_tp2/actions)

![Java CI](https://github.com/katushka-pushilina/dz_tp2/actions/workflows/java-ci.yml/badge.svg)

# Анализатор чисел из файла

Программа на Java, которая читает числа из файла и анализирует их для определения минимального и максимального значения, а также вычисляет их сумму и произведение.

## Функциональность

Программа может выполнять следующие функции:
- **_min**: Находит минимальное число в файле.
- **_max**: Находит максимальное число в файле.
- **_sum**: Вычисляет сумму всех чисел в файле.
- **_mult**: Вычисляет произведение всех чисел в файле.

## Как использовать

Для использования программы выполните следующие шаги:
1. Скомпилируйте файл `NumberAnalyzer.java` с помощью команды:
   ```
   javac NumberAnalyzer.java
   ```
2. Запустите скомпилированный файл командой:
   ```
   java NumberAnalyzer
   ```
Убедитесь, что файл `numbers.txt` находится в той же директории, что и исполняемый файл.

## Тестирование

Тесты для этой программы находятся в файле `NumberAnalyzerTest.java`. Для выполнения тестов используйте JUnit. Компиляция и запуск тестов выполняется следующим образом:
```
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar NumberAnalyzerTest.java
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore NumberAnalyzerTest
```
## Лицензия

[MIT](https://choosealicense.com/licenses/mit/)
