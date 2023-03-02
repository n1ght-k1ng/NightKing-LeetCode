class Solution:
    def compress(self, chars: List[str]) -> int:
        # d = {}
        # for c in chars:
        #     if c not in d:
        #         d[c] = 1
        #     else:
        #         d[c] +=1
        # print(d)
        # x = 0 
        # st= ""
        # for i in d.keys():
        #     st =st + i
        #     if d[i] > 1 :
        #         st = st+ str(d[i])
        # trim = len(st)
        # del chars[trim::]
        # print(chars)
        # for i in range(len(chars)):
        #     chars[i] = st[i]
        # return len(chars)
        j = 1
        st = ""
        frq = 1 
        i = 0
        while j < len(chars):
            if chars[i] == chars[j]:
                frq += 1
                j += 1
            else:
                if frq == 1:
                    st += chars[i]
                else:
                    st += chars[i] + str(frq)
                i = j
                j += 1
                frq = 1
        if frq == 1:
            st += chars[i]
        else:
            st += chars[i] + str(frq)

        trim = len(st)
        del chars[trim::]
        print(chars)
        for i in range(len(chars)):
            chars[i] = st[i]
        return len(chars)
                                    
            
            

                
                
                
            