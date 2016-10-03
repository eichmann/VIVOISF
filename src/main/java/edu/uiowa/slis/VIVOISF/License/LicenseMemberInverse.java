package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseMemberInverseIterator theLicenseMemberInverseIterator = (LicenseMemberInverseIterator)findAncestorWithClass(this, LicenseMemberInverseIterator.class);
			pageContext.getOut().print(theLicenseMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing License for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for member tag ");
		}
		return SKIP_BODY;
	}
}

