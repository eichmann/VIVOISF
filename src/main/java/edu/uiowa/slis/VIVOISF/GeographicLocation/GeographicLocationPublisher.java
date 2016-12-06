package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPublisherIterator theGeographicLocationPublisherIterator = (GeographicLocationPublisherIterator)findAncestorWithClass(this, GeographicLocationPublisherIterator.class);
			pageContext.getOut().print(theGeographicLocationPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for publisher tag ");
		}
		return SKIP_BODY;
	}
}

