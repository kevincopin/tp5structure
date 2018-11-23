public interface IntList
{
    /** @return   vrai si la liste est vide et faux sinon
     */
    boolean isEmpty();
    /** @param  n     l’entier à ajouter dans la liste
     *  @return       la liste à laquelle n est ajoutée
     */
    IntList cons(int n);
    /** @return      la longueur de la liste
     */
    int length();
    /** @return    un String représentant la liste
     */
    String toString();
}