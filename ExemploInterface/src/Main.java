public class Main {
        public static void main (String[]args){
            Funcionario f = new Funcionario();
            f.setCPF("123");
            f.setNome("AABB");
            f.setComissao(100);
            f.setSalario(400);
            System.out.println(f.getPagamento());
        }
    }
