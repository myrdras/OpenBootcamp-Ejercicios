package sesion21.builders;

import sesion21.builders.classes.SmartPhone;

public class SmartPhoneBuilder extends SmartDeviceBuilder<SmartPhoneBuilder> {

   public int camera;
   public String chipset;
   public int battery;

   public SmartPhoneBuilder(String brand, String name) {
      super(brand, name);
   }

   @Override
   public SmartPhoneBuilder getThis() {
      return this;
   }

   public SmartPhoneBuilder withCamera(int camera) {
      this.camera = camera;
      return this;
   }

   public SmartPhoneBuilder withChipset(String chipset) {
      this.chipset = chipset;
      return this;
   }

   public SmartPhoneBuilder withBattery(int battery) {
      this.battery = battery;
      return this;
   }

   public SmartPhone build() {
      return new SmartPhone(this);
   }

}
