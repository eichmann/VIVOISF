package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupPublisherIterator thegroupPublisherIterator = (groupPublisherIterator)findAncestorWithClass(this, groupPublisherIterator.class);
			pageContext.getOut().print(thegroupPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing group for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for publisher tag ");
		}
		return SKIP_BODY;
	}
}

