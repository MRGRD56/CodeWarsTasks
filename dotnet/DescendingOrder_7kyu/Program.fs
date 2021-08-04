open System

let descendingOrder n =
    n.ToString()
    |> Seq.sortDescending
    |> Seq.toArray
    |> String
    |> Int32.Parse


// TESTING
[<EntryPoint>]
let main _ =
    printfn "%d" <| descendingOrder 18379
    0