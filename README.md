# SoftEng_AdapterPattern_LabAss3
Plugging Devices into Power Outlets

## Problem Statement
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

<h2><strong>Adaptee Objects:</strong></h2>
<ul>
  <li><strong>Laptop</strong> – Represents a laptop device that needs to be plugged into a power source. It has the <code>charge()</code> method.</li>
  <li><strong>Refrigerator</strong> – Represents a refrigerator device that requires a power source. It has the <code>startCooling()</code> method.</li>
  <li><strong>SmartphoneCharger</strong> – Represents a smartphone charger that needs to be plugged in for charging. It has the <code>chargePhone()</code> method.</li>
</ul>

<h2><strong>Target Object:</strong></h2>
<ul>
  <li><strong>PowerOutlet</strong> – Represents a standard power outlet with a common interface for plugging in devices. It defines the <code>plugIn()</code> method as the target method.</li>
</ul>

<h2><strong>Adapter Objects:</strong></h2>
<ul>
  <li><strong>LaptopAdapter</strong> – An adapter for plugging a laptop into a standard power outlet. It adapts the <code>Laptop</code> to the <code>PowerOutlet</code> interface, translating <code>plugIn()</code> to <code>charge()</code>.</li>
  <li><strong>RefrigeratorAdapter</strong> – An adapter for plugging a refrigerator into a standard power outlet. It adapts the <code>Refrigerator</code> to the <code>PowerOutlet</code> interface, translating <code>plugIn()</code> to <code>startCooling()</code>.</li>
  <li><strong>SmartphoneAdapter</strong> – An adapter for plugging a smartphone charger into a standard power outlet. It adapts the <code>SmartphoneCharger</code> to the <code>PowerOutlet</code> interface, translating <code>plugIn()</code> to <code>chargePhone()</code>.</li>
</ul>
