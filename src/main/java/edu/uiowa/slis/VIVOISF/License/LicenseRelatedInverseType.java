package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseRelatedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseRelatedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseRelatedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseRelatedInverseIterator theLicenseRelatedInverseIterator = (LicenseRelatedInverseIterator)findAncestorWithClass(this, LicenseRelatedInverseIterator.class);
			pageContext.getOut().print(theLicenseRelatedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing License for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for related tag ");
		}
		return SKIP_BODY;
	}
}

