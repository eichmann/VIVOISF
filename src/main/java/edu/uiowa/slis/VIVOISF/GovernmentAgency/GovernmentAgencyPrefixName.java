package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPrefixNameIterator theGovernmentAgency = (GovernmentAgencyPrefixNameIterator)findAncestorWithClass(this, GovernmentAgencyPrefixNameIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

