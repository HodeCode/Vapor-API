/*	Vapor API Terms and Conditions
 *
 *  - You MAY NOT
 *  	- attempt to claim ownership of, or pass off the Vapor source code and materials as your own work unless:
 *
 *  		- used as constituent component in an Android application that you intend to release and/or profit from
 *
 *		- use or redistribute the Vapor source code and materials without explicit attribution to the owning parties
 *
 *  	- advertise Vapor in a misleading, inappropriate or offensive fashion
 *
 * - Indemnity
 * 		You agree to indemnify and hold harmless the authors of the Software and any contributors for any direct, indirect, 
 * 		incidental, or consequential third-party claims, actions or suits, as well as any related expenses, liabilities, damages, 
 * 		settlements or fees arising from your use or misuse of the Software, or a violation of any terms of this license.
 *  
 *  - DISCLAIMER OF WARRANTY
 *  	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, 
 *		WARRANTIES OF QUALITY, PERFORMANCE, NON-INFRINGEMENT, MERCHANTABILITY, OR FITNESS FOR A PARTICULAR PURPOSE.
 *  
 *  - LIMITATIONS OF LIABILITY
 *  	YOU ASSUME ALL RISK ASSOCIATED WITH THE INSTALLATION AND USE OF THE SOFTWARE. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * 		HOLDERS OF THE SOFTWARE BE LIABLE FOR CLAIMS, DAMAGES OR OTHER LIABILITY ARISING FROM, OUT OF, OR IN CONNECTION WITH THE 
 *		SOFTWARE. LICENSE HOLDERS ARE SOLELY RESPONSIBLE FOR DETERMINING THE APPROPRIATENESS OF USE AND ASSUME ALL RISKS ASSOCIATED 
 *		WITH ITS USE, INCLUDING BUT NOT LIMITED TO THE RISKS OF PROGRAM ERRORS, DAMAGE TO EQUIPMENT, LOSS OF DATA OR SOFTWARE PROGRAMS, 
 *		OR UNAVAILABILITY OR INTERRUPTION OF OPERATIONS.
 *  
 *  © Darius Hodaei. License Version 1.1. Last Updated 30/06/2013.
*/

package vapor.widget;

import vapor.view.VaporView;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;

/**
 * Fluent Vapor companion to Chronometer, a class that implements a simple
 * timer. You can give it a start time in the elapsedRealtime() timebase, and it
 * counts up from that, or if you don't give it a base time, it will use the
 * time at which you call tick(true). By default it will display the current
 * timer value in the form "MM:SS" or "H:MM:SS", or you can use format(String)
 * to format the timer value into an arbitrary string.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from Chronometer
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporChronometer<T extends Chronometer, self extends VaporChronometer<T, self>>
		extends VaporView<T, self> {

	public VaporChronometer(int id) {
		super(id);
	}

	public VaporChronometer(T chronometer) {
		super(chronometer);
	}

	/**
	 * Return the base time as set through base(long).
	 * 
	 * @return
	 */
	public long base() {
		return view.getBase();
	}

	/**
	 * Set the time that the count-up timer is in reference to.
	 * 
	 * @param base
	 *            Use the elapsedRealtime() time base.
	 * @return self
	 */
	public self base(long base) {
		view.setBase(base);
		return (self) this;
	}

	/**
	 * Returns the current format string as set through format(String).
	 * 
	 * @return the current format string
	 */
	public String format() {
		return view.getFormat();
	}

	/**
	 * Sets the format string used for display. The Chronometer will display
	 * this string, with the first "%s" replaced by the current timer value in
	 * "MM:SS" or "H:MM:SS" form. If the format string is null, or if you never
	 * call format(), the Chronometer will simply display the timer value in
	 * "MM:SS" or "H:MM:SS" form.
	 * 
	 * @param format
	 *            the format string.
	 * @return self
	 */
	public self format(String format) {
		view.setFormat(format);
		return (self) this;
	}

	/**
	 * 
	 * @return The listener (may be null) that is listening for chronometer
	 *         change events.
	 */
	public OnChronometerTickListener tickListener() {
		return view.getOnChronometerTickListener();
	}

	/**
	 * Sets the listener to be called when the chronometer changes.
	 * 
	 * @param chronometerTickListener
	 *            The listener.
	 * @return self
	 */
	public self tick(
			vapor.listeners.widget.chronometer.$tick chronometerTickListener) {
		view.setOnChronometerTickListener(chronometerTickListener);
		return (self) this;
	}

	/**
	 * Sets whether to start counting up, or stop
	 * 
	 * @param tick
	 *            true to start counting up, false to stop
	 * @return self
	 */
	public self tick(boolean tick) {
		if (tick)
			view.start();
		else
			view.stop();
		return (self) this;
	}
}
