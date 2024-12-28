# Groovy List Modification During Iteration Bug

This repository demonstrates a common error in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The `remove()` method inside the loop causes unexpected skipping of elements.

The `bug.groovy` file shows the problematic code and its output.  The `bugSolution.groovy` file provides a corrected version.

This issue arises because the index used in the loop is not correctly updated after the removal of an element, leading to the skipping of the next element.