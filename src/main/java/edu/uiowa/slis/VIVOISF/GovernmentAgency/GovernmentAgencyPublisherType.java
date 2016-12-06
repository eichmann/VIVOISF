package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPublisherIterator theGovernmentAgencyPublisherIterator = (GovernmentAgencyPublisherIterator)findAncestorWithClass(this, GovernmentAgencyPublisherIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for publisher tag ");
		}
		return SKIP_BODY;
	}
}

