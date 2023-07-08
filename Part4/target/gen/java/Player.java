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


public class Player extends ASTRAClass {
	public Player() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("drawn", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new NOT(
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L",false)
						})
					),
					new NOT(
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "T2",false)
						})
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("winner", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("line", new Term[] {
					new Variable(Type.INTEGER, "L1",false),
					new Variable(Type.INTEGER, "L2",false),
					new Variable(Type.INTEGER, "L3",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "T"),
						new Variable(Type.INTEGER, "L1")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L2")
						}),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L3")
						})
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("loser", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("winner", new Term[] {
					new Variable(Type.STRING, "T2",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "T")
					}),
					new Comparison("~=",
						new Variable(Type.STRING, "T"),
						new Variable(Type.STRING, "T2")
					)
				)
			)
		));
		addRule(new Rule(
			"Player", new int[] {50,9,50,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {50,28,56,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {51,8,51,79},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Player "),
								Operator.newOperator('+',
									new AtIndex(
										new Variable(Type.LIST, "args"),
										Primitive.newPrimitive(0),
										Type.STRING
									),
									Primitive.newPrimitive(" ready to go.")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Player", new int[] {52,8,56,5},
						new Predicate("player", new Term[] {
							new AtIndex(
								new Variable(Type.LIST, "args"),
								Primitive.newPrimitive(0),
								Type.STRING
							)
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {53,8,56,5},
						new Predicate("openent", new Term[] {
							new AtIndex(
								new Variable(Type.LIST, "args"),
								Primitive.newPrimitive(1),
								Type.STRING
							)
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {54,8,56,5},
						new Predicate("turn", new Term[] {
							new AtIndex(
								new Variable(Type.LIST, "args"),
								Primitive.newPrimitive(2),
								Type.STRING
							)
						})
					),
					new ModuleCall("system",
						"Player", new int[] {55,8,55,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {58,9,58,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("check", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "Player")
				}),
				new Predicate("drawn", new Term[] {
					new Variable(Type.STRING, "Player")
				})
			),
			new Block(
				"Player", new int[] {58,63,61,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {59,8,59,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game is Drawn")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Player", new int[] {60,8,61,5},
						new Predicate("drawn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {63,9,63,65},
			new GoalEvent('+',
				new Goal(
					new Predicate("check", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "Player")
				}),
				new Predicate("winner", new Term[] {
					new Variable(Type.STRING, "Player")
				})
			),
			new Block(
				"Player", new int[] {63,64,66,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {64,8,64,55},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Player", new int[] {65,8,66,5},
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {69,9,69,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("check", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "Player")
				}),
				new Predicate("loser", new Term[] {
					new Variable(Type.STRING, "Player")
				})
			),
			new Block(
				"Player", new int[] {69,63,72,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {70,8,70,56},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game lost by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Player", new int[] {71,8,72,5},
						new Predicate("loser", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {74,9,74,49},
			new GoalEvent('+',
				new Goal(
					new Predicate("check", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new Predicate("player", new Term[] {
				new Variable(Type.STRING, "Player")
			}),
			new Block(
				"Player", new int[] {74,48,77,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {75,8,75,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("In Game")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {79,9,79,77},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "Player",false)
				})
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "Player")
				}),
				new Predicate("openent", new Term[] {
					new Variable(Type.STRING, "OtherPlayer",false)
				})
			),
			new Block(
				"Player", new int[] {79,76,84,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {80,8,80,45},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("I'm playing now...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Player", new int[] {81,8,84,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					),
					new Subgoal(
						"Player", new int[] {82,8,84,5},
						new Goal(
							new Predicate("move", new Term[] {})
						)
					),
					new BeliefUpdate('+',
						"Player", new int[] {83,8,84,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "OtherPlayer")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {86,9,86,106},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "OtherPlayer",false),
					new Variable(Type.INTEGER, "Position",false)
				})
			),
			new Predicate("player", new Term[] {
				new Variable(Type.STRING, "Player",false)
			}),
			new Block(
				"Player", new int[] {86,105,93,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {87,4,87,37},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Recive player ")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Player", new int[] {88,7,93,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "Position")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {89,8,93,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "OtherPlayer"),
							new Variable(Type.INTEGER, "Position")
						})
					),
					new Subgoal(
						"Player", new int[] {90,8,93,5},
						new Goal(
							new Predicate("check", new Term[] {
								new Variable(Type.STRING, "Player")
							})
						)
					),
					new BeliefUpdate('-',
						"Player", new int[] {91,8,93,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "OtherPlayer")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {92,8,93,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {95,9,95,47},
			new GoalEvent('+',
				new Goal(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player",false),
						new Variable(Type.INTEGER, "Position",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {95,46,98,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {96,8,98,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "Position")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {97,8,98,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "Player"),
							new Variable(Type.INTEGER, "Position")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {100,9,100,85},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "Position",false)
					})
				)
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "Player",false)
				}),
				new Predicate("openent", new Term[] {
					new Variable(Type.STRING, "OtherPlayer",false)
				})
			),
			new Block(
				"Player", new int[] {100,84,107,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {101,8,101,71},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Player_"),
								Operator.newOperator('+',
									new Variable(Type.STRING, "Player"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" Making move on "),
										new Variable(Type.INTEGER, "Position")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Player", new int[] {102,8,107,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "Player"),
								new Variable(Type.INTEGER, "Position")
							})
						)
					),
					new Subgoal(
						"Player", new int[] {103,8,107,5},
						new Goal(
							new Predicate("check", new Term[] {
								new Variable(Type.STRING, "Player")
							})
						)
					),
					new BeliefUpdate('-',
						"Player", new int[] {104,8,107,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {105,8,107,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "OtherPlayer")
						})
					),
					new Send("Player", new int[] {106,8,106,58},
						new Performative("inform"),
						new Variable(Type.STRING, "OtherPlayer"),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "Player"),
							new Variable(Type.INTEGER, "Position")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("token", new Term[] {
				Primitive.newPrimitive("X")
			})
		);
		agent.initialize(
			new Predicate("token", new Term[] {
				Primitive.newPrimitive("O")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("debug",astra.lang.Debug.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new Player().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
