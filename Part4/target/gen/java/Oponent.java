/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Oponent extends ASTRAClass {
	public Oponent() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Oponent", new int[] {5,9,5,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Oponent", new int[] {5,26,7,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {6,8,7,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(7)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {8,9,8,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Oponent", new int[] {8,26,10,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {9,8,10,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(9)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {11,9,11,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Oponent", new int[] {11,26,13,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {12,8,13,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(3)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {14,9,14,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Oponent", new int[] {14,26,16,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {15,8,16,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(8)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {17,9,17,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Oponent", new int[] {17,26,19,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {18,8,19,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(1)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {20,9,20,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Oponent", new int[] {20,26,22,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {21,8,22,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(2)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {24,9,24,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Oponent", new int[] {24,26,26,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {25,8,26,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(4)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {27,9,27,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Oponent", new int[] {27,26,29,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {28,8,29,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(5)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {30,9,30,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Oponent", new int[] {30,26,32,5},
				new Statement[] {
					new Subgoal(
						"Oponent", new int[] {31,8,32,5},
						new Goal(
							new Predicate("move", new Term[] {
								Primitive.newPrimitive(6)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Oponent", new int[] {34,10,34,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Oponent", new int[] {34,18,38,5},
				new Statement[] {
					new ModuleCall("console",
						"Oponent", new int[] {35,7,35,38},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game is Over")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Oponent","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("debug",
						"Oponent", new int[] {36,7,36,26},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Oponent","debug")).dumpBeliefs(
								);
							}
						}
					),
					new ModuleCall("system",
						"Oponent", new int[] {37,7,37,20},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Oponent","system")).exit(
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Oponent().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
