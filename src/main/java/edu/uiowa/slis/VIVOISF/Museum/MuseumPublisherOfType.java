package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumPublisherOfIterator theMuseumPublisherOfIterator = (MuseumPublisherOfIterator)findAncestorWithClass(this, MuseumPublisherOfIterator.class);
			pageContext.getOut().print(theMuseumPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

