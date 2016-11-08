package se.lia.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	private int fastighetsTaxeringsAr;
	private long[] nivaFaktorUndreGrans;
	private long[] nivaFaktorOvreGrans;
	private int[] standardPoangUndreGrans;
	private int[] standardPoangOvreGrans;
	private int[] vardeYtaUndreGrans;
	private int[] vardeYtaOvreGrans;
	private int grundVarde;
	private int marginalVarde;
	
	/*
	private double[][] nivaFaktor;
	private int[][] standardPoang;
	private int[][] vardeYta;
	*/
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getFastighetsTaxeringsAr() {
		return fastighetsTaxeringsAr;
	}
	public void setFastighetsTaxeringsAr(int fastighetsTaxeringsAr) {
		this.fastighetsTaxeringsAr = fastighetsTaxeringsAr;
	}
	public long[] getNivaFaktorUndreGrans() {
		return nivaFaktorUndreGrans;
	}
	public void setNivaFaktorUndreGrans(long[] nivaFaktorUndreGrans) {
		this.nivaFaktorUndreGrans = nivaFaktorUndreGrans;
	}
	public long[] getNivaFaktorOvreGrans() {
		return nivaFaktorOvreGrans;
	}
	public void setNivaFaktorOvreGrans(long[] nivaFaktorOvreGrans) {
		this.nivaFaktorOvreGrans = nivaFaktorOvreGrans;
	}
	public int[] getStandardPoangUndreGrans() {
		return standardPoangUndreGrans;
	}
	public void setStandardPoangUndreGrans(int[] standardPoangUndreGrans) {
		this.standardPoangUndreGrans = standardPoangUndreGrans;
	}
	public int[] getStandardPoangOvreGrans() {
		return standardPoangOvreGrans;
	}
	public void setStandardPoangOvreGrans(int[] standardPoangOvreGrans) {
		this.standardPoangOvreGrans = standardPoangOvreGrans;
	}
	public int[] getVardeYtaUndreGrans() {
		return vardeYtaUndreGrans;
	}
	public void setVardeYtaUndreGrans(int[] vardeYtaUndreGrans) {
		this.vardeYtaUndreGrans = vardeYtaUndreGrans;
	}
	public int[] getVardeYtaOvreGrans() {
		return vardeYtaOvreGrans;
	}
	public void setVardeYtaOvreGrans(int[] vardeYtaOvreGrans) {
		this.vardeYtaOvreGrans = vardeYtaOvreGrans;
	}
	public int getGrundVarde() {
		return grundVarde;
	}
	public void setGrundVarde(int grundVarde) {
		this.grundVarde = grundVarde;
	}
	public int getMarginalVarde() {
		return marginalVarde;
	}
	public void setMarginalVarde(int marginalVarde) {
		this.marginalVarde = marginalVarde;
	}
	@Override
	public String toString() {
		return "PrimitiveGrundOchMarginalEntity [id=" + id + ", fastighetsTaxeringsAr=" + fastighetsTaxeringsAr
				+ ", nivaFaktorUndreGrans=" + Arrays.toString(nivaFaktorUndreGrans) + ", nivaFaktorOvreGrans="
				+ Arrays.toString(nivaFaktorOvreGrans) + ", standardPoangUndreGrans="
				+ Arrays.toString(standardPoangUndreGrans) + ", standardPoangOvreGrans="
				+ Arrays.toString(standardPoangOvreGrans) + ", vardeYtaUndreGrans="
				+ Arrays.toString(vardeYtaUndreGrans) + ", vardeYtaOvreGrans=" + Arrays.toString(vardeYtaOvreGrans)
				+ ", grundVarde=" + grundVarde + ", marginalVarde=" + marginalVarde + "]";
	}
	
	
}
