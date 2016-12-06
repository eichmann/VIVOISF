package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasNameIterator theGovernmentAgencyHasNameIterator = (GovernmentAgencyHasNameIterator)findAncestorWithClass(this, GovernmentAgencyHasNameIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasName tag ");
		}
		return SKIP_BODY;
	}
}

