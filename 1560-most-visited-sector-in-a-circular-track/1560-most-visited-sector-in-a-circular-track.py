class Solution(object):
  def mostVisited(self, n, rounds):
    sectors = {}
    for i in range(1,len(rounds)):
      start = rounds[i-1]
      end = rounds[i]

      while start!=end:
        if start not in sectors:
            sectors[start]=1
        else:
            sectors[start]+=1
        start+=1
        if start > n:
          start =1
    
    if rounds[-1] not in sectors:
        sectors[rounds[-1]]=1
    else:
        sectors[rounds[-1]]+=1

    values = []
    for key in sectors:
      values.append(sectors[key])
    maximum = max(values)
    results= []
    for key in sectors:
      if sectors[key]==maximum:
        results.append(key)
    
    return results