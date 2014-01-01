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

package vapor.inputmethodservice;

import vapor.widget.VaporEditText;
import android.inputmethodservice.ExtractEditText;

// Checked: 051220121301
// Check onSelectionChanged does not have a vapor equivalent

/**
 * Fluent Vapor companion to ExtractEditText, a specialization of EditText for
 * showing and interacting with the extracted text in a full-screen input
 * method.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from ExtractEditText
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporExtractEditText<T extends ExtractEditText, self extends VaporExtractEditText<T, self>>
		extends VaporEditText<T, self> {

	public VaporExtractEditText(int id) {
		super(id);
	}

	public VaporExtractEditText(T extractEditText) {
		super(extractEditText);
	}

	/**
	 * Finish making changes that will not be reported to the client. That is,
	 * onSelectionChanged(int, int) will not result in sending the new selection
	 * to the client
	 * 
	 * @return self
	 */
	public self finishInternals() {
		view.finishInternalChanges();
		return (self) this;
	}

	/**
	 * Start making changes that will not be reported to the client. That is,
	 * onSelectionChanged(int, int) will not result in sending the new selection
	 * to the client
	 * 
	 * @return self
	 */
	public self startInternals() {
		view.startInternalChanges();
		return (self) this;
	}

	/**
	 * Return true if the edit text is currently showing a scroll bar.
	 * 
	 * @return true if the edit text is currently showing a scroll bar.
	 */
	public boolean yScrolled() {
		return view.hasVerticalScrollBar();
	}

}
