public class PLAYER {


    //public String checkDiscType(CD obiekt, CDR obiekt2, CDRW obiekt3, DVD obiekt4, DVDR obiekt5, DVDRW obiekt6, BLURAY obiekt7  )
    public String checkDiscType(Object obiekt)
    {
        return (obiekt.getClass().getName());
        //return(obiekt.sRodzaj);
        //return (obiekt.sRodzaj+obiekt2.sRodzaj+obiekt3.sRodzaj+obiekt4.sRodzaj+obiekt5.sRodzaj+obiekt6.sRodzaj+obiekt7.sRodzaj);
        /*if (obiekt instanceof CD)
        {
            return "CD";
        }
        else
        {
            return "DVD";
        }*/
    }
}
