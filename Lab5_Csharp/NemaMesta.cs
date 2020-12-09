using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class NemaMesta :  Exception
    {
        public NemaMesta()
        { }

        public NemaMesta(String poruka)
            : base(poruka)
        { }
    }
}
