//https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/csharp
using System;

namespace HumanReadableDurationFormat
{
    internal static class Program
    {
        private static void Main(string[] args)
        {
            Console.WriteLine(HumanTimeFormat.formatDuration(132030240));
        }
    }
}