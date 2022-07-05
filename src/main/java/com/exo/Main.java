package com.exo;

import com.exo.beans.Client;
import com.exo.beans.Voiture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exemple.
 */
public final class Main {
	private static final Logger LOG = LogManager.getLogger();

	/**
	 * Constructeur.
	 */
	private Main() {
		super();
		Main.LOG.error("Ne pas utiliser le constructeur");
	}

	/**
	 * Charge un fichier Spring.
	 *
	 * @param args
	 *            ne sert a rien
	 */
	public static void main(String[] args) {
		Main.LOG.debug("-- Debut -- ");
		ClassPathXmlApplicationContext appContext = null;
		try {
			// Chargement du fichier
			appContext = new ClassPathXmlApplicationContext("spring/mesBeans.xml");


			// Recuperation de notre instance de Voiture
			Voiture v1 = appContext.getBean(Voiture.class);
			Main.LOG.debug(v1.toString());

			// Chargement des clients
			Client c1 = appContext.getBean("client1", Client.class);
			Main.LOG.debug(c1.toString());

			Client c2 = appContext.getBean("client2", Client.class);
			Main.LOG.debug(c2.toString());

			Client c3 = appContext.getBean("client3", Client.class);
			Main.LOG.debug(c3.toString());

		} catch (BeansException e) {
			Main.LOG.fatal("Erreur", e);
			System.exit(-1);
		} finally {
			if (appContext != null) {
				appContext.close();
			}
			// On peut aussi faire :
			// appContext.registerShutdownHook();
			// Juste apres la creation du context, de cette manière il sera
			// detruit automatiquement à la fin du programme
		}

		Main.LOG.debug("-- Fin -- ");
		System.exit(0);
	}
}