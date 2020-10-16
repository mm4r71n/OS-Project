package nachos.vm;

public abstract class MemoryManager{
	public MemoryManager() {	}
	protected abstract void removePage(int ppn);
	public abstract TranslationEntry swapIn(PageItem item);	
	public abstract void swapOut(int ppn);

    }
