package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalCourtInverseIterator theHospitalCourtInverseIterator = (HospitalCourtInverseIterator)findAncestorWithClass(this, HospitalCourtInverseIterator.class);
			pageContext.getOut().print(theHospitalCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for court tag ");
		}
		return SKIP_BODY;
	}
}

