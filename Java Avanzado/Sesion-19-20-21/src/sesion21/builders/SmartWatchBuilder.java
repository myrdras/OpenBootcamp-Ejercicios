package sesion21.builders;

import sesion21.builders.classes.SmartWatch;

public class SmartWatchBuilder extends SmartDeviceBuilder<SmartWatchBuilder> {
   public String build;

   public SmartWatchBuilder(String brand, String name) {
      super(brand, name);
   }

   public SmartWatchBuilder withBuild(String build) {
      this.build = build;
      return this;
   }

   @Override
   public SmartWatchBuilder getThis() {
      return this;
   }

   public SmartWatch build() {
      return new SmartWatch(this);
   }
}
