package ma.fs.hospital;

import ma.fs.hospital.entities.*;
import ma.fs.hospital.repositories.ConsultationRepository;
import ma.fs.hospital.repositories.MedecinRepository;
import ma.fs.hospital.repositories.PatientRepository;
import ma.fs.hospital.repositories.RendezVousRepository;
import ma.fs.hospital.service.IHospitatlService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IHospitatlService hospitatlService,
							PatientRepository patientRepository,
							RendezVousRepository rendezVousRepository,
							MedecinRepository medecinRepository){
		return args -> {
			Stream.of("Salim","Imane","Rania")
					.forEach(name->{
						Patient patient=new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitatlService.savePatient(patient);
					});
			Stream.of("Ayoub","Kamal","Jalil")
					.forEach(name->{
						Medecin medecin =new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentist");
						hospitatlService.saveMedecin(medecin);
					});
			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1=patientRepository.findByNom("Rania");

			Medecin medecin=medecinRepository.findByNom("Jalil");
			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			RendezVous savedRDV = hospitatlService.saveRDV(rendezVous);
			System.out.println(savedRDV.getId());


			RendezVous rendezVous1=rendezVousRepository.findAll().get(0);
			Consultation consultation=new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport");
			hospitatlService.saveConsultation(consultation);




		};
	}
}
