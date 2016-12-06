package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaPublisherIterator theareaPublisherIterator = (areaPublisherIterator)findAncestorWithClass(this, areaPublisherIterator.class);
			pageContext.getOut().print(theareaPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing area for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for publisher tag ");
		}
		return SKIP_BODY;
	}
}

