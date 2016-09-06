package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPublisherOfIterator theGovernmentAgencyPublisherOfIterator = (GovernmentAgencyPublisherOfIterator)findAncestorWithClass(this, GovernmentAgencyPublisherOfIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

