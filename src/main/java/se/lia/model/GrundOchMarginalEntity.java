package se.lia.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta;

@Entity
public class GrundOchMarginalEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private FastighetsTaxeringsAr fta;
	private NivaFaktor[] nf;
	private StandardPoang[] sp;
	private VardeYta[] vy;
	private Varde v;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public FastighetsTaxeringsAr getFta() {
		return fta;
	}
	public void setFta(FastighetsTaxeringsAr fta) {
		this.fta = fta;
	}
	public NivaFaktor[] getNf() {
		return nf;
	}
	public void setNf(NivaFaktor[] nf) {
		this.nf = nf;
	}
	public StandardPoang[] getSp() {
		return sp;
	}
	public void setSp(StandardPoang[] sp) {
		this.sp = sp;
	}
	public VardeYta[] getVy() {
		return vy;
	}
	public void setVy(VardeYta[] vy) {
		this.vy = vy;
	}
	public Varde getV() {
		return v;
	}
	public void setV(Varde v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "GrundOchMarginalEntity [id=" + id + ", fta=" + fta + ", nf=" + Arrays.toString(nf) + ", sp="
				+ Arrays.toString(sp) + ", vy=" + Arrays.toString(vy) + ", v=" + v + "]";
	}
	
	
}
