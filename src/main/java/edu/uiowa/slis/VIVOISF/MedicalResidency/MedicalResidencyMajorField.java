package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencyMajorField extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyMajorField currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyMajorField.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MedicalResidencyMajorFieldIterator theMedicalResidency = (MedicalResidencyMajorFieldIterator)findAncestorWithClass(this, MedicalResidencyMajorFieldIterator.class);
			pageContext.getOut().print(theMedicalResidency.getMajorField());
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for majorField tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for majorField tag ");
		}
		return SKIP_BODY;
	}
}

