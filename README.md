# PIEZOPORT – Portable Piezoelectric Energy Harvester

## 📌 Overview

Piezoport is a portable energy harvesting device that converts mechanical vibrations and pressure into electrical energy using piezoelectric discs. The system is designed to provide a sustainable and decentralized energy solution for low-power applications such as sensors and LEDs.

---

## ⚙️ Current Implementation

The prototype consists of:

* Multiple stacked piezoelectric discs (6 discs arranged in 3 sets)
* Bridge rectifier using diodes (AC to DC conversion)
* Insulated wiring connections

When mechanical force (such as tapping or vibration) is applied, the system generates a small voltage in the range of **100–200 mV**.

---

## 🔍 Working Principle

1. Mechanical stress is applied to piezoelectric discs
2. Discs generate AC voltage
3. Diode bridge converts AC → DC
4. Output voltage is observed across terminals

---

## 💻 Software (Java Simulation)

To enhance system intelligence, basic Java programs are implemented for:

### 1. Voltage Monitoring

* Converts analog signal into voltage value

### 2. Threshold Detection

* Identifies when sufficient energy is generated

### 3. Peak Voltage Detection

* Tracks maximum voltage output

---

## 🚧 Limitations

* Very low voltage output (100–200 mV)
* Cannot directly power microcontrollers like Arduino
* Requires voltage boosting and storage for practical use

---

## 🚀 Future Enhancements

* Integration of capacitor for energy storage
* Use of boost converter to increase voltage
* Arduino-based monitoring system
* Optimization of piezo stacking and layout

---

## 🌍 Applications

* Smart flooring (energy from footsteps)
* Road and bridge vibration harvesting
* Wearable devices (shoes, backpacks)
* Industrial vibration monitoring
* Rural/off-grid energy solutions

---

## 🎯 Conclusion

Piezoport demonstrates the feasibility of converting mechanical energy into electrical energy using piezoelectric materials. While current output is low, future improvements in storage and amplification can transform it into a practical, sustainable energy solution.

---
