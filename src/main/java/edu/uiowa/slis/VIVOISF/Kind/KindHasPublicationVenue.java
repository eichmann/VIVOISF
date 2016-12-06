package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasPublicationVenueIterator theKindHasPublicationVenueIterator = (KindHasPublicationVenueIterator)findAncestorWithClass(this, KindHasPublicationVenueIterator.class);
			pageContext.getOut().print(theKindHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}
