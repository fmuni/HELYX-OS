/*******************************************************************************
 *  |       o                                                                   |
 *  |    o     o       | HELYX-OS: The Open Source GUI for OpenFOAM             |
 *  |   o   O   o      | Copyright (C) 2012-2016 ENGYS                          |
 *  |    o     o       | http://www.engys.com                                   |
 *  |       o          |                                                        |
 *  |---------------------------------------------------------------------------|
 *  |   License                                                                 |
 *  |   This file is part of HELYX-OS.                                          |
 *  |                                                                           |
 *  |   HELYX-OS is free software; you can redistribute it and/or modify it     |
 *  |   under the terms of the GNU General Public License as published by the   |
 *  |   Free Software Foundation; either version 2 of the License, or (at your  |
 *  |   option) any later version.                                              |
 *  |                                                                           |
 *  |   HELYX-OS is distributed in the hope that it will be useful, but WITHOUT |
 *  |   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or   |
 *  |   FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License   |
 *  |   for more details.                                                       |
 *  |                                                                           |
 *  |   You should have received a copy of the GNU General Public License       |
 *  |   along with HELYX-OS; if not, write to the Free Software Foundation,     |
 *  |   Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA            |
 *******************************************************************************/
package eu.engys.core.project.materials.compressible;

import eu.engys.util.bean.AbstractBean;

public class AdiabaticPerfectFluid extends AbstractBean implements EquationOfState {
    public static final String RHO0_KEY = "rho0";
    public static final String B_KEY = "b";
    public static final String P0_KEY = "p0";
    public static final String GAMMA_KEY = "gamma";
    
    private double rho0 = 0;
    private double b = 0;
    private double p0 = 0;
    private double gamma = 0;
    
    public double getRho0() {
        return rho0;
    }
    public void setRho0(double rho0) {
        firePropertyChange(RHO0_KEY, this.rho0, this.rho0 = rho0);
        this.rho0 = rho0;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        firePropertyChange(B_KEY, this.b, this.b = b);
        this.b = b;
    }
    public double getP0() {
        return p0;
    }
    public void setP0(double p0) {
        firePropertyChange(P0_KEY, this.p0, this.p0 = p0);
    }
    public double getGamma() {
        return gamma;
    }
    public void setGamma(double gamma) {
        firePropertyChange(GAMMA_KEY, this.gamma, this.gamma = gamma);
    }
    
    
    
}
