package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencyRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MedicalResidencyRO_0000057Iterator theMedicalResidencyRO_0000057Iterator = (MedicalResidencyRO_0000057Iterator)findAncestorWithClass(this, MedicalResidencyRO_0000057Iterator.class);
			pageContext.getOut().print(theMedicalResidencyRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

