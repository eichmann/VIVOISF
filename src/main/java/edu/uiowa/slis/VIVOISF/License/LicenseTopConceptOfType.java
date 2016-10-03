package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseTopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseTopConceptOfIterator theLicenseTopConceptOfIterator = (LicenseTopConceptOfIterator)findAncestorWithClass(this, LicenseTopConceptOfIterator.class);
			pageContext.getOut().print(theLicenseTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing License for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

