using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class Kolekcija <T> where T : Traka
    {
        private T[] Niz;
        private int TrenutnoTraka;
        private int MaxTraka;

        public Kolekcija()
            : this(10)
        { }
        public Kolekcija(int k)
        {
            this.MaxTraka = k;
            this.TrenutnoTraka = 0;
            Niz = new T[MaxTraka];
        }
        public void Dodaj(T t)
        {
            if (TrenutnoTraka < MaxTraka)
            {
                Niz[TrenutnoTraka] = t;
                TrenutnoTraka++;
            }
            else
            {
                throw new NemaMesta("Ne moze se dodati vise traka!");
            }
        }
        public void Pokreni(int i, int kol)
        {
            Niz[i].PocniSRadom(kol);
        }
        public void Kraj()
        {
            for (int i = 0; i < TrenutnoTraka; i++)
                Niz[i].StaniSRadom();
        }
        public void Kraj(int i)
        {
            Niz[i - 1].StaniSRadom();
        }
        public void Ucitaj(BinaryReader br)
        {
            for (int i = 0; i < TrenutnoTraka; i++)
                Niz[i].Ucitaj(br);
        }
        public void Pokreni(BinaryReader br)
        {
            for(int i=0; i<TrenutnoTraka; i++)
            {
                Niz[i].PocniSRadom(br.ReadInt32());
            }
        }
    }
}
