package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherSubcontractsGrantIterator thePublisherSubcontractsGrantIterator = (PublisherSubcontractsGrantIterator)findAncestorWithClass(this, PublisherSubcontractsGrantIterator.class);
			pageContext.getOut().print(thePublisherSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

