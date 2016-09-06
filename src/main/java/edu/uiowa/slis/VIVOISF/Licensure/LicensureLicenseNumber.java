package edu.uiowa.slis.VIVOISF.Licensure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicensureLicenseNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicensureLicenseNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LicensureLicenseNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LicensureLicenseNumberIterator theLicensure = (LicensureLicenseNumberIterator)findAncestorWithClass(this, LicensureLicenseNumberIterator.class);
			pageContext.getOut().print(theLicensure.getLicenseNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for licenseNumber tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for licenseNumber tag ");
		}
		return SKIP_BODY;
	}
}

