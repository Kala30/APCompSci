
/**
 * Fun With Chemistry
 * 
 * @author Iain Ro, Caleb Yun
 * @version 2/23/2018
 */
public class FunWithChemistry
{
    private AtomicMassTable table = new AtomicMassTable();
    private double moleculeWeight;
    
    /**
     * Constructor that initializes moleculeWeight.
     * 
     * @param molecule  String containing molecule formula.
     */
    public FunWithChemistry(String molecule)
    {
        parseMolecule(molecule);
    }
    
    /**
     * Converts a string with single element and number of atoms to mass.
     * 
     * @param element   String with element symbol and number of atoms.
     * @return mass     Mass of elements times amount.
     */
    public double elementWeight(String element)
    {
        String number = "";
        int amount = 1;
        int numberPlace = element.length();
        for(int i = 0; i < element.length()-1; i++)
        {
            if(element.indexOf("1") >=0 || element.indexOf("2") >=0 || element.indexOf("3") >=0 || element.indexOf("4") >=0 || element.indexOf("5") >=0 || element.indexOf("6") >=0 || element.indexOf("7") >=0 || element.indexOf("8") >=0 || element.indexOf("9") >=0)
            {
                number += element.substring(i+1, i+2);
            }
        }
        if(number.length()>0)numberPlace = element.indexOf(number);
        String elementSym = element.substring(0, numberPlace);
        if(number.length()>0)amount = Integer.parseInt(number);
        double AMass = table.get(elementSym) * amount;
        return AMass;
    }

    /**
     * Parses molecule in string and adds massses to moleculeWeight.
     * 
     * @param molecule String containing chemical formula.
     */
    public void parseMolecule(String molecule)
    {
        moleculeWeight = 0;
        molecule = molecule + ".";
        String atom = "";
        int startIndex = 0;
        
        for(int i = 1; i < molecule.length(); i++)
        {
            if(Character.isUpperCase(molecule.charAt(i)) || Character.toString(molecule.charAt(i)).equals("."))
            { 
                atom = molecule.substring(startIndex, i);
                startIndex = i;
                moleculeWeight += elementWeight(atom);
            }
        }
    }
    
    /**
     * Getter for moleculeWeight.
     * 
     * @return moleculeWeight
     */
    public double getMoleculeWeight()
    {
        return moleculeWeight;
    }
    
    /**
     * Converts moleculeWeight to grams.
     * 
     * @param moles
     * @return grams
     */
    public double molesToGrams(double moles)
    {
        return moleculeWeight * moles;
    }
    
    /**
     * Converts moleculeWeight to moles.
     * 
     * @param grams
     * @return moles
     */
    public double gramsToMoles(double grams)
    {
        return moleculeWeight/grams;
    }
}
