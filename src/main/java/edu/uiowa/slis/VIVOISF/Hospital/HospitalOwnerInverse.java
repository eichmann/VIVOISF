package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalOwnerInverseIterator theHospitalOwnerInverseIterator = (HospitalOwnerInverseIterator)findAncestorWithClass(this, HospitalOwnerInverseIterator.class);
			pageContext.getOut().print(theHospitalOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for owner tag ");
		}
		return SKIP_BODY;
	}
}

