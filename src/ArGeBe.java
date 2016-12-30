public class ArGeBe
{
    byte r;//range -128 to 127. will have to (r + 128) to get within bounds for Color(r, g, b)
    byte g;
    byte b;
    
    public ArGeBe(byte R, byte G, byte B)
    {
        r = R;
        g = G;
        b = B;
    }
    
    public void setR(byte R)
    {
        r = R;
    }
    
    public void setG(byte G)
    {
        g = G;
    }
    
    public void setB(byte B)
    {
        b = B;
    }
}
