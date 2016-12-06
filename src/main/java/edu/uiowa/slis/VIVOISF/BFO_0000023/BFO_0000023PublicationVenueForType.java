package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023PublicationVenueForIterator theBFO_0000023PublicationVenueForIterator = (BFO_0000023PublicationVenueForIterator)findAncestorWithClass(this, BFO_0000023PublicationVenueForIterator.class);
			pageContext.getOut().print(theBFO_0000023PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

