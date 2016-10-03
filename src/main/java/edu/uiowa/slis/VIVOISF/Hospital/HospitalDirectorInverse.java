package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalDirectorInverseIterator theHospitalDirectorInverseIterator = (HospitalDirectorInverseIterator)findAncestorWithClass(this, HospitalDirectorInverseIterator.class);
			pageContext.getOut().print(theHospitalDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for director tag ");
		}
		return SKIP_BODY;
	}
}

