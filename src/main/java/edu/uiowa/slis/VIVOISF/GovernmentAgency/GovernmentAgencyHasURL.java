package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasURLIterator theGovernmentAgencyHasURLIterator = (GovernmentAgencyHasURLIterator)findAncestorWithClass(this, GovernmentAgencyHasURLIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

