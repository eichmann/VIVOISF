package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasEmailIterator theGovernmentAgencyHasEmailIterator = (GovernmentAgencyHasEmailIterator)findAncestorWithClass(this, GovernmentAgencyHasEmailIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

