package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingPublicationVenueForIterator thenon_self_governingPublicationVenueForIterator = (non_self_governingPublicationVenueForIterator)findAncestorWithClass(this, non_self_governingPublicationVenueForIterator.class);
			pageContext.getOut().print(thenon_self_governingPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

