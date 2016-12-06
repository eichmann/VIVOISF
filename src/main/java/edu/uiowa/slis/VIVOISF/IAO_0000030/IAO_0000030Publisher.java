package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030Publisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030Publisher currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030Publisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030PublisherIterator theIAO_0000030PublisherIterator = (IAO_0000030PublisherIterator)findAncestorWithClass(this, IAO_0000030PublisherIterator.class);
			pageContext.getOut().print(theIAO_0000030PublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

