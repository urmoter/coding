use std::io;

fn main() {
    println!("Input: ");
    let mut input = String::new();
    let stdin = io::stdin();
    stdin.read_line(&mut input).expect("Error!");
    if input.len() == 1 {
        println!("No Input!");
    } else {println!("Input: {}", input);
};
}
