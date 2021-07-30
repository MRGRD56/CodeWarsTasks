using System.Text.RegularExpressions;

namespace NotVerySecure_5kyu
{
    public class Kata
    {
        public static bool Alphanumeric(string str) => Regex.IsMatch(str, "^[a-zA-Z0-9]+$");
    }
}