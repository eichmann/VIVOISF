package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			if (!theMedicalResidency.commitNeeded) {
				pageContext.getOut().print(theMedicalResidency.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			return theMedicalResidency.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MedicalResidency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			theMedicalResidency.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for label tag ");
		}
	}
}

