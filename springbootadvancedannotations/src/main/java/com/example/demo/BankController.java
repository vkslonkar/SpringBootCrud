package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

	@GetMapping("/getbank")
	// @RequestMapping(value="/getbank",method = RequestMethod.GET)
	public Bank getBankDetails() {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		return b1;

	}

	@GetMapping("/allbank")
	public List<Bank> getListBank() {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		Bank b2 = new Bank("102", "HDFC", "Pune");
		Bank b3 = new Bank("103", "AXIS", "Pune");
		Bank b4 = new Bank("104", "YES", "Pune");
		Bank b5 = new Bank("105", "KOTAK", "Pune");
		List<Bank> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		return list;
	}

	@GetMapping("/bankbyid/{id}")
	public Bank getBankById(@PathVariable String id) {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		Bank b2 = new Bank("102", "HDFC", "Pune");
		Bank b3 = new Bank("103", "AXIS", "Pune");
		Bank b4 = new Bank("104", "YES", "Pune");
		Bank b5 = new Bank("105", "KOTAK", "Pune");
		List<Bank> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Bank res = null;

		for (Bank b : list) {
			if (b.getId().equals(id)) {
				res = b;
			}
		}

		return res;
	}

	@GetMapping("/bankbyidname/{id}/{name}")
	public List<Bank> getBankByIdName(@PathVariable String id, @PathVariable String name) {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		Bank b2 = new Bank("102", "HDFC", "Pune");
		Bank b3 = new Bank("103", "AXIS", "Pune");
		Bank b4 = new Bank("104", "YES", "Pune");
		Bank b5 = new Bank("105", "KOTAK", "Pune");
		List<Bank> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		List<Bank> resultList = new ArrayList<Bank>();

		for (Bank b : list) {
			if (b.getId().equals(id) || b.getName().equals(name)) {
				resultList.add(b);
			}
		}

		return resultList;
	}

	@PostMapping("/creatbank")
	public Bank createBank(@RequestBody Bank bank) {
		System.out.println(bank);
		Bank ba = new Bank();
		ba.setId(bank.getId());
		ba.setName(bank.getName());
		ba.setLoc(bank.getLoc());
		return ba;
	}

	@PutMapping("/updatebank/{id}")
	public List<Bank> updateBank(@PathVariable String id, @RequestBody Bank bank) {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		Bank b2 = new Bank("102", "HDFC", "Pune");
		Bank b3 = new Bank("103", "AXIS", "Pune");
		Bank b4 = new Bank("104", "YES", "Pune");
		Bank b5 = new Bank("105", "KOTAK", "Pune");
		List<Bank> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		for (Bank bnk : list) {
			if (bnk.getId().equals(id)) {
				bnk.setId(bank.getId());
				bnk.setName(bank.getName());
				bnk.setLoc(bank.getLoc());
			}
		}

		return list;
	}

	@DeleteMapping("/deletebank/{id}")
	public List<Bank> deleteBank(@PathVariable String id) {
		Bank b1 = new Bank("101", "ICICI", "Pune");
		Bank b2 = new Bank("102", "HDFC", "Pune");
		Bank b3 = new Bank("103", "AXIS", "Pune");
		Bank b4 = new Bank("104", "YES", "Pune");
		Bank b5 = new Bank("105", "KOTAK", "Pune");
		List<Bank> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		List<Bank> list1 = new ArrayList();

		for (Bank bnk : list) {
			if (bnk.getId().equals(id)) {

			} else {
				list1.add(bnk);
			}
		}

		return list1;
	}

}
