using System;

namespace HumanReadableDurationFormat_4kyu
{
    internal static class Program
    {
        private static void Main(string[] args)
        {
            Console.WriteLine(HumanTimeFormat.formatDuration(132030240));
        }
    }
}