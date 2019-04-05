# Drools Housing Benefit
In this project I am trying to apply different features of Drools to calculate parts of Finnish "General Housing Benefit".

The rules for the level of benefit, and the availability of the benefit, are pretty straightforward, see
[Housing Allowance Law (in Finnish and Swedish)](http://finlex.fi/fi/laki/ajantasa/2014/20140938?search%5Btype%5D=pika&search%5Bpika%5D=asumistuki).

## Features
The idea of this project was to understand how Drools works in real life, and get to know the following Drools features
* Rules
* Decision tables (which are actually translated into rules)
* Rule flows (that is, ordering of rule execution with BMPN2 process)

It would have been nice to try a Domain Specific Language (DSL) too, but we did not have the time. They are also translated into rules in the end.

## Usage
This is just a set of rules and test cases related to the rules. There is no ReST service or other runtime stuff at the moment.

For Drools test, the test class is TestMaxAsumismenotDrools

## Comparison to Java version
Class YlatEtuusAsia and test class TestMaxAsumisMenotJava implement the corresponding Java version (Drools rules are translated into Java in the end
as well. It just a different way to do the same stuff. Some comparison between the two solutions:
* JUnit tests are way faster for the Java version. This is no big surprise, since we don't have to load Drools, jBPM, read Excel files and translate rules 
into Java.
* In my opinion, the Drools based way is more "communicative" (at least compared to this this not-so-polished Java version)
* The logic of Java solution is more robust. Sometimes Drools surprises you by activating rules you did not expect to activate (and sometimes by not
activating rules you think should have activated). With Java, things happen just the way you like.
* I don't think Drools rules could be written by business users. Maybe they could be more readily understood than the Java version.
* I decided to use BigDecimal numbers - they really don't help very much in making the code easier to understand - for example, compare the following

~~~ 
max = for4Persons.add((new BigDecimal(householdSize).subtract(new BigDecimal(4)).multiply(over4PerPerson))));
max = for4Persons + ((householdSize - 4) * over4PerPerson)
~~~