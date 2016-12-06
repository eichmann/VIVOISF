package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPublicationVenueForIterator theConferencePaperPublicationVenueForIterator = (ConferencePaperPublicationVenueForIterator)findAncestorWithClass(this, ConferencePaperPublicationVenueForIterator.class);
			pageContext.getOut().print(theConferencePaperPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

