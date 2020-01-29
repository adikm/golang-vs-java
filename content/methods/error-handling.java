try {
      int i = Integer.parseInt("96");
    } catch (NumberFormatException e) {
      System.out.err("couldn't convert: " + e.getMessage());
      return;
    }
}