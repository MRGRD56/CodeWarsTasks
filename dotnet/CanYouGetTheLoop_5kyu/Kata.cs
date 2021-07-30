using System.Collections.Generic;
using System.Linq;

namespace CanYouGetTheLoop_5kyu
{
    public static class Kata
    {
        public static int GetLoopSize(LinkedListNode<string> startNode)
        {
            var previousNodes = new List<LinkedListNode<string>>();
            var currentNode = startNode;
            while (true)
            {
                var nextNode = currentNode?.Next;
                if (nextNode == null) break;

                if (previousNodes.Contains(nextNode))
                {
                    return previousNodes.Count - previousNodes.IndexOf(nextNode);
                }
                
                previousNodes.Add(nextNode);
                currentNode = nextNode;
            }

            return 0;
        }
    }
}