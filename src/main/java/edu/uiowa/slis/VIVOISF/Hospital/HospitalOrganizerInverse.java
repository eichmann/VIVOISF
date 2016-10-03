package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalOrganizerInverseIterator theHospitalOrganizerInverseIterator = (HospitalOrganizerInverseIterator)findAncestorWithClass(this, HospitalOrganizerInverseIterator.class);
			pageContext.getOut().print(theHospitalOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for organizer tag ");
		}
		return SKIP_BODY;
	}
}

