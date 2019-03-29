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