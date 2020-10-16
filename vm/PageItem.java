package nachos.vm;

import nachos.machine.*;
import nachos.threads.*;
import nachos.userprog.*;
import nachos.vm.*;

public class PageItem{
	int vpn, pid;

	PageItem(int pid, int vpn){
		this.pid = pid;
		this.vpn = vpn;
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof PageItem) return ((PageItem) o).pid == pid && ((PageItem) o).vpn == vpn;
		return false;
	}

	@Override
	public int hashCode(){
		return pid ^ vpn;
	}
}