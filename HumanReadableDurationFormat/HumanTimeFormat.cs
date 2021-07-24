using System;
using System.Collections.Generic;
using System.Linq;

namespace HumanReadableDurationFormat
{
    public static class HumanTimeFormat
    {
        public static string formatDuration(int seconds)
        {
            if (seconds == 0)
            {
                return "now";
            }

            if (seconds < 0)
            {
                throw new ArgumentException("Seconds value must be non-negative", nameof(seconds));
            }

            var time = TimeSpan.FromSeconds(seconds);
            var timeComponents = new Dictionary<string, int>
            {
                {"year", time.Days / 365},
                {"day", time.Days % 365},
                {"hour", time.Hours},
                {"minute", time.Minutes},
                {"second", time.Seconds}
            };

            var stringTimeComponents = new List<string>();

            foreach (var (unit, value) in timeComponents)
            {
                if (value == 0) continue;
                stringTimeComponents.Add($"{value} {unit + (value == 1 ? "" : "s")}");
            }

            var resultLeftPart = string.Join(", ", stringTimeComponents.Take(stringTimeComponents.Count - 1));
            
            var result = resultLeftPart + 
                         (string.IsNullOrEmpty(resultLeftPart) ? "" : " and ") +
                         stringTimeComponents.Last();

            return result;
        }
    }
}