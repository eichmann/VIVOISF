package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencySuffixNameIterator theGovernmentAgency = (GovernmentAgencySuffixNameIterator)findAncestorWithClass(this, GovernmentAgencySuffixNameIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

