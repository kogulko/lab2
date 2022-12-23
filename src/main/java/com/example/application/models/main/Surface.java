package com.example.application.models.main;

public class Surface {
  private Equation equation;

  public Surface(Equation equation) {
    this.equation = equation;
  }

  public String name() {
    return "Поверхня загального вигляду";
  }

  public String toString() {
    return  equation.toString();
  }
}

class Elipsoid extends Surface {
  public Elipsoid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліпсоїд";
  }
}

class ImaginaryElipsoid extends Surface {
  public ImaginaryElipsoid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний еліпсоїд";
  }
}

class ImaginaryCone extends Surface {
  public ImaginaryCone(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний конус";
  }
}

class SingleCavityHyperboloid extends Surface {
  public SingleCavityHyperboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Однопорожнинний гіперболоїд";
  }
}

class DoubleCavityHyperboloid extends Surface {
  public DoubleCavityHyperboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Двопорожнинний гіперболоїд";
  }
}

class Cone extends Surface {
  public Cone(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Конус";
  }
}

class EllipticParaboloid extends Surface {
  public EllipticParaboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліптичний параболоїд";
  }
}

class HyperbolicParaboloid extends Surface {
  public HyperbolicParaboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Гіперболічний параболоїд";
  }
}

class EllipticCylinder extends Surface {
  public EllipticCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліптичний циліндр";
  }
}

class ImaginaryEllipticCylinder extends Surface {
  public ImaginaryEllipticCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний еліптичний циліндр";
  }
}

class PairOfImaginaryIntersectedPlanes extends Surface {
  public PairOfImaginaryIntersectedPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара уявних площин, що перетинаються";
  }
}

class HyperbolicCylinder extends Surface {
  public HyperbolicCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Гіперболічний циліндр";
  }
}

class PairOfIntersectedPlanes extends Surface {
  public PairOfIntersectedPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара площин, що перетинаються";
  }
}

class ParabolicCylinder extends Surface {
  public ParabolicCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Параболічний циліндр";
  }
}

class PairOfParallelPlanes extends Surface {
  public PairOfParallelPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара паралельних площин";
  }
}

class PairOfImaginaryParallelPlanes extends Surface {
  public PairOfImaginaryParallelPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара уявних паралельних площин";
  }
}

class PairOfMatchingPlanes extends Surface {
  public PairOfMatchingPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара співпадаючих площин";
  }
}
