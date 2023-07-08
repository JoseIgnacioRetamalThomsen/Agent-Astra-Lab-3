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


public class LinearPlayer extends ASTRAClass {
	public LinearPlayer() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"LinearPlayer", new int[] {2,10,2,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"LinearPlayer", new int[] {2,27,4,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {3,8,4,5},
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
			"LinearPlayer", new int[] {5,9,5,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"LinearPlayer", new int[] {5,26,7,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {6,8,7,5},
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
			"LinearPlayer", new int[] {8,9,8,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"LinearPlayer", new int[] {8,26,10,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {9,8,10,5},
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
			"LinearPlayer", new int[] {11,9,11,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"LinearPlayer", new int[] {11,26,13,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {12,8,13,5},
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
			"LinearPlayer", new int[] {14,9,14,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"LinearPlayer", new int[] {14,26,16,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {15,8,16,5},
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
			"LinearPlayer", new int[] {17,9,17,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"LinearPlayer", new int[] {17,26,19,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {18,8,19,5},
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
			"LinearPlayer", new int[] {20,9,20,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"LinearPlayer", new int[] {20,26,22,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {21,8,22,5},
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
			"LinearPlayer", new int[] {23,9,23,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"LinearPlayer", new int[] {23,26,25,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {24,8,25,5},
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
			"LinearPlayer", new int[] {26,9,26,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"LinearPlayer", new int[] {26,26,28,5},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {27,8,28,5},
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
			"LinearPlayer", new int[] {29,10,29,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"LinearPlayer", new int[] {29,18,33,5},
				new Statement[] {
					new ModuleCall("console",
						"LinearPlayer", new int[] {30,7,30,38},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game is Over")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LinearPlayer","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("debug",
						"LinearPlayer", new int[] {31,7,31,26},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("LinearPlayer","debug")).dumpBeliefs(
								);
							}
						}
					),
					new ModuleCall("system",
						"LinearPlayer", new int[] {32,7,32,20},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("LinearPlayer","system")).exit(
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
			astra.core.Agent agent = new LinearPlayer().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
