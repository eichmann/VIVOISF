package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141PublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141PublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141PublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141PublicationVenueForIterator theBFO_0000141PublicationVenueForIterator = (BFO_0000141PublicationVenueForIterator)findAncestorWithClass(this, BFO_0000141PublicationVenueForIterator.class);
			pageContext.getOut().print(theBFO_0000141PublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

