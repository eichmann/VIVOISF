package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPublicationVenueForIterator theProceedingsPublicationVenueForIterator = (ProceedingsPublicationVenueForIterator)findAncestorWithClass(this, ProceedingsPublicationVenueForIterator.class);
			pageContext.getOut().print(theProceedingsPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

