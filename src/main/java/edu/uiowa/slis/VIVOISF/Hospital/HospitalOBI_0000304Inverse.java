package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalOBI_0000304InverseIterator theHospitalOBI_0000304InverseIterator = (HospitalOBI_0000304InverseIterator)findAncestorWithClass(this, HospitalOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theHospitalOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

