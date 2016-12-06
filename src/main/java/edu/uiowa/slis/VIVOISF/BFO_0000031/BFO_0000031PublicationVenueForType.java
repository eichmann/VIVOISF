package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031PublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031PublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031PublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031PublicationVenueForIterator theBFO_0000031PublicationVenueForIterator = (BFO_0000031PublicationVenueForIterator)findAncestorWithClass(this, BFO_0000031PublicationVenueForIterator.class);
			pageContext.getOut().print(theBFO_0000031PublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

