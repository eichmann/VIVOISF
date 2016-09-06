package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseRelated.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseRelatedIterator theLicenseRelatedIterator = (LicenseRelatedIterator)findAncestorWithClass(this, LicenseRelatedIterator.class);
			pageContext.getOut().print(theLicenseRelatedIterator.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing License for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for related tag ");
		}
		return SKIP_BODY;
	}
}

