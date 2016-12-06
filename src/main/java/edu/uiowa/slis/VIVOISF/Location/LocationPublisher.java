package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationPublisherIterator theLocationPublisherIterator = (LocationPublisherIterator)findAncestorWithClass(this, LocationPublisherIterator.class);
			pageContext.getOut().print(theLocationPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for publisher tag ");
		}
		return SKIP_BODY;
	}
}

