class Solution:
    def reverseBits(self, n: int) -> int:
        bits=[0]*32
        while(n>0):
            power = math.floor(math.log2(n))
            #print(power)
            n=n-pow(2,power)
            bits[power]=1

        power=31
        sum=0
        for bit in bits:
            #print(bit)
            sum=sum+bit*pow(2,power)
            power=power-1

        return sum