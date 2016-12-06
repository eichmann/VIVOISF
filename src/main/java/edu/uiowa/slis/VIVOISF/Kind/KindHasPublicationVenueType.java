package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasPublicationVenueIterator theKindHasPublicationVenueIterator = (KindHasPublicationVenueIterator)findAncestorWithClass(this, KindHasPublicationVenueIterator.class);
			pageContext.getOut().print(theKindHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

