package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationPublisherIterator theLocationPublisherIterator = (LocationPublisherIterator)findAncestorWithClass(this, LocationPublisherIterator.class);
			pageContext.getOut().print(theLocationPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for publisher tag ");
		}
		return SKIP_BODY;
	}
}

