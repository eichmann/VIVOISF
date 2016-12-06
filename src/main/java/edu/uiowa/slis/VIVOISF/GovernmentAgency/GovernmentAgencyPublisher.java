package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPublisherIterator theGovernmentAgencyPublisherIterator = (GovernmentAgencyPublisherIterator)findAncestorWithClass(this, GovernmentAgencyPublisherIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for publisher tag ");
		}
		return SKIP_BODY;
	}
}

