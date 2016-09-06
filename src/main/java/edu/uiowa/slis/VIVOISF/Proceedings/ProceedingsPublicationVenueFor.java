package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPublicationVenueForIterator theProceedingsPublicationVenueForIterator = (ProceedingsPublicationVenueForIterator)findAncestorWithClass(this, ProceedingsPublicationVenueForIterator.class);
			pageContext.getOut().print(theProceedingsPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

