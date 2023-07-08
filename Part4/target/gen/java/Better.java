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


public class Better extends ASTRAClass {
	public Better() {
		setParents(new Class[] {Player.class});
		addInference(new Inference(
			new Predicate("MakeMove", new Term[] {
				new Variable(Type.INTEGER, "Position",false)
			}),
			new AND(
				new Predicate("two", new Term[] {
					new Variable(Type.INTEGER, "One",false),
					new Variable(Type.INTEGER, "Two",false)
				}),
				new AND(
					new Predicate("free", new Term[] {
						new Variable(Type.INTEGER, "Position")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "AnyPLayer",false),
							new Variable(Type.INTEGER, "One")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "AnyPLayer"),
								new Variable(Type.INTEGER, "Two")
							}),
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "One"),
								new Variable(Type.INTEGER, "Two"),
								new Variable(Type.INTEGER, "Position")
							})
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("MakeMove2", new Term[] {
				new Variable(Type.INTEGER, "Position",false)
			}),
			new AND(
				new Predicate("two", new Term[] {
					new Variable(Type.INTEGER, "One",false),
					new Variable(Type.INTEGER, "Two",false)
				}),
				new AND(
					new Predicate("free", new Term[] {
						new Variable(Type.INTEGER, "Position")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "AnyPLayer",false),
							new Variable(Type.INTEGER, "One")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "AnyPLayer"),
								new Variable(Type.INTEGER, "Two")
							}),
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "One"),
								new Variable(Type.INTEGER, "Position"),
								new Variable(Type.INTEGER, "Two")
							})
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("MakeMove3", new Term[] {
				new Variable(Type.INTEGER, "Position",false)
			}),
			new AND(
				new Predicate("two", new Term[] {
					new Variable(Type.INTEGER, "One",false),
					new Variable(Type.INTEGER, "Two",false)
				}),
				new AND(
					new Predicate("free", new Term[] {
						new Variable(Type.INTEGER, "Position")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "AnyPLayer",false),
							new Variable(Type.INTEGER, "One")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "AnyPLayer"),
								new Variable(Type.INTEGER, "Two")
							}),
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "Position"),
								new Variable(Type.INTEGER, "One"),
								new Variable(Type.INTEGER, "Two")
							})
						)
					)
				)
			)
		));
		addRule(new Rule(
			"Better", new int[] {46,9,46,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {46,26,48,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {47,8,48,5},
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
			"Better", new int[] {50,9,50,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Better", new int[] {50,31,52,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {51,8,52,5},
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
			"Better", new int[] {53,10,53,34},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Better", new int[] {53,33,55,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {54,8,55,5},
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
			"Better", new int[] {56,10,56,34},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Better", new int[] {56,33,58,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {57,8,58,5},
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
			"Better", new int[] {60,9,60,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Better", new int[] {60,31,62,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {61,8,62,5},
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
			"Better", new int[] {63,9,63,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Better", new int[] {63,32,65,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {64,8,65,5},
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
			"Better", new int[] {66,9,66,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Better", new int[] {66,32,68,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {67,8,68,5},
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
			"Better", new int[] {69,9,69,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {69,31,71,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {70,8,71,5},
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
			"Better", new int[] {72,9,72,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {72,32,74,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {73,8,74,5},
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
			"Better", new int[] {75,9,75,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {75,32,77,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {76,8,77,5},
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
			"Better", new int[] {78,9,78,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {78,31,80,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {79,8,80,5},
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
			"Better", new int[] {81,9,81,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {81,32,83,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {82,8,83,5},
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
			"Better", new int[] {84,10,84,34},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {84,33,86,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {85,8,86,5},
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
			"Better", new int[] {87,9,87,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {87,31,89,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {88,8,89,5},
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
			"Better", new int[] {90,9,90,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {90,32,92,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {91,8,92,5},
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
			"Better", new int[] {93,9,93,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {93,32,95,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {94,8,95,5},
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
			"Better", new int[] {96,9,96,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {96,31,98,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {97,8,98,5},
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
			"Better", new int[] {99,11,99,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {99,34,101,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {100,8,101,5},
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
			"Better", new int[] {102,11,102,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {102,34,104,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {103,8,104,5},
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
			"Better", new int[] {105,9,105,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {105,31,107,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {106,8,107,5},
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
			"Better", new int[] {108,9,108,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {108,32,110,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {109,8,110,5},
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
			"Better", new int[] {111,11,111,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {111,34,113,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {112,8,113,5},
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
			"Better", new int[] {114,9,114,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Better", new int[] {114,31,116,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {115,8,116,5},
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
			"Better", new int[] {117,9,117,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Better", new int[] {117,32,119,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {118,8,119,5},
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
			"Better", new int[] {120,9,120,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Better", new int[] {120,32,122,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {121,8,122,5},
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
			"Better", new int[] {123,9,123,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Better", new int[] {123,31,125,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {124,8,125,5},
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
			"Better", new int[] {126,9,126,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove2", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Better", new int[] {126,32,128,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {127,8,128,5},
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
			"Better", new int[] {129,9,129,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("MakeMove3", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Better", new int[] {129,32,131,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {130,8,131,5},
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
			"Better", new int[] {135,9,135,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Better", new int[] {135,26,137,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {136,8,137,5},
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
			"Better", new int[] {139,9,139,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {139,26,141,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {140,8,141,5},
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
			"Better", new int[] {142,10,142,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Better", new int[] {142,27,144,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {143,8,144,5},
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
			"Better", new int[] {145,9,145,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {145,26,147,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {146,8,147,5},
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
			"Better", new int[] {148,9,148,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {148,26,150,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {149,8,150,5},
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
			"Better", new int[] {151,9,151,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {151,26,153,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {152,8,153,5},
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
			"Better", new int[] {154,9,154,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Better", new int[] {154,26,156,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {155,8,156,5},
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
			"Better", new int[] {157,9,157,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Better", new int[] {157,26,159,5},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {158,8,159,5},
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
			"Better", new int[] {160,9,160,18},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Better", new int[] {160,17,164,5},
				new Statement[] {
					new ModuleCall("console",
						"Better", new int[] {161,7,161,38},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game is Over")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Better","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("debug",
						"Better", new int[] {162,7,162,26},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Better","debug")).dumpBeliefs(
								);
							}
						}
					),
					new ModuleCall("system",
						"Better", new int[] {163,7,163,20},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Better","system")).exit(
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(2)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("two", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(9)
			})
		);
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
			astra.core.Agent agent = new Better().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
