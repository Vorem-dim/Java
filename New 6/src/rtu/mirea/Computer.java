package rtu.mirea;

public class Computer {
    private Memory memory;
    private Monitor monitor;
    private Processor processor;
    private Mark mark;
    private class Monitor {
        private int length, width;

        public Monitor(int length, int width) {
            this.length = length;
            this.width = width;
        }
    }
    private class Memory {
        private int memory;

        public Memory(int memory) {
            this.memory = memory;
        }
    }
    private class Processor {
        private int processor;

        public Processor(int processor) {
            this.processor = processor;
        }
    }

    public Computer(String mark) {
        memory = new Memory((int)(Math.random() * 10));
        processor = new Processor((int)(Math.random() * 10));
        monitor = new Monitor((int)(Math.random() * 40), (int)(Math.random() * 20));
        if (mark.equals("ASUS"))
            this.mark = Mark.ASUS;
        else if (mark.equals("ACER"))
            this.mark = Mark.ACER;
        else
            this.mark = Mark.SAMSUNG;
    }

    @Override
    public String toString() {
        return mark + " " + memory.memory + " " + monitor.length + "x" + monitor.width + " " + processor.processor;
    }
}
