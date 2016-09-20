package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseRelatedInverseIterator theLicenseRelatedInverseIterator = (LicenseRelatedInverseIterator)findAncestorWithClass(this, LicenseRelatedInverseIterator.class);
			pageContext.getOut().print(theLicenseRelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing License for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for related tag ");
		}
		return SKIP_BODY;
	}
}

