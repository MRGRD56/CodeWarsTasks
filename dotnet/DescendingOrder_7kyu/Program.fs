open System

let descendingOrder (n: int) =
    n.ToString()
    |> Seq.sortDescending
    |> Seq.toArray
    |> String
    |> Int32.Parse


// TESTING
[<EntryPoint>]
let main _ =
    seq {18379; 9102; 1387; 1234; 4329}
    |> Seq.map descendingOrder
    |> Seq.iter (printfn "%d")
    0