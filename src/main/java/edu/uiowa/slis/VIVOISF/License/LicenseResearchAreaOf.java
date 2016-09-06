package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseResearchAreaOfIterator theLicenseResearchAreaOfIterator = (LicenseResearchAreaOfIterator)findAncestorWithClass(this, LicenseResearchAreaOfIterator.class);
			pageContext.getOut().print(theLicenseResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing License for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

