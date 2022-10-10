console.log("Teste");

type Rect = {
    width?: number,
    height?: number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "scalene" | "obtuse"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;


let rect: Rect = {
    width: 20,
    height: 30
};

let t: GeometricFigure = {
    angle: 45,
    type: "isosceles"
}

t={
    radius: 9
}

console.log(rect.height);

// let numeros: number | string;
// numeros = "";

// let numeros: (string | number)[];
// numeros = ["", 2];

// let f = (x: number, y: number) : number => {
//     return x + y;
// }

// let numeros: number;
// numeros = f(2,6);