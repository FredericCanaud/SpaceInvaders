package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.model.Constante;
import fr.unilim.iut.spaceinvaders.model.Envahisseur;
import fr.unilim.iut.spaceinvaders.model.Missile;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;
import fr.unilim.iut.spaceinvaders.model.Vaisseau;
import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;
import javafx.geometry.Pos;

public class DessinSpaceInvaders implements DessinJeu {
	private SpaceInvaders jeu;

	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		this.jeu = spaceInvaders;
	}

	public void dessiner(BufferedImage image) {
		if (this.jeu.aUnVaisseau()) {
			Vaisseau vaisseau = this.jeu.recupererVaisseau();
			this.dessinerVaisseau(vaisseau, image);
		}
		if (this.jeu.aUnMissile()) {
			Missile missile = this.jeu.recupererMissile();
			this.dessinerMissile(missile, image);
		}
		if (this.jeu.aUnEnvahisseur()) {
			Envahisseur envahisseur = this.jeu.recupererEnvahisseur();
			this.dessinerEnvahisseur(envahisseur, image);
		}
		if (this.jeu.etreFini()) {
			this.dessinerMessageDeFin(image);
		}
	}

	private void dessinerVaisseau(Vaisseau vaisseau, BufferedImage image) {
		Graphics2D crayon = (Graphics2D) image.getGraphics();
		crayon.setColor(Color.blue);
		crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(),
				vaisseau.hauteur());
	}

	private void dessinerMissile(Missile missile, BufferedImage image) {
		Graphics2D crayon = (Graphics2D) image.getGraphics();
		crayon.setColor(Color.red);
		crayon.fillRect(missile.abscisseLaPlusAGauche(), missile.ordonneeLaPlusBasse(), missile.longueur(),
				missile.hauteur());
	}
	private void dessinerEnvahisseur(Envahisseur envahisseur, BufferedImage image) {
		Graphics2D crayon = (Graphics2D) image.getGraphics();
		crayon.setColor(Color.pink);
		crayon.fillRect(envahisseur.abscisseLaPlusAGauche(), envahisseur.ordonneeLaPlusBasse(), envahisseur.longueur(),
				envahisseur.hauteur());
	}
	private void dessinerMessageDeFin( BufferedImage image) {
		Graphics2D crayon = (Graphics2D) image.getGraphics();
		crayon.setColor(Color.ORANGE);
		crayon.setFont(new Font("TimesRoman", Font.PLAIN, Constante.MESSAGE_FIN_TAILLE));
		crayon.drawString("YOU WIN !!!", Constante.MESSAGE_FIN_POSITIONX, Constante.MESSAGE_FIN_POSITIONY);
		
	}
}