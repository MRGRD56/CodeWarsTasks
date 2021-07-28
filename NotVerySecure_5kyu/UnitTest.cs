using System.Collections.Generic;
using NUnit.Framework;

namespace NotVerySecure_5kyu
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return new TestCaseData("Mazinkaiser").Returns(true);
                yield return new TestCaseData("hello world_").Returns(false);
                yield return new TestCaseData("PassW0rd").Returns(true);
                yield return new TestCaseData("     ").Returns(false);
            }
        }
    
        [Test, TestCaseSource(nameof(TestCases))]
        public bool Test(string str) => Kata.Alphanumeric(str);
    }
}