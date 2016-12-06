package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindPublicationVenueForIterator theKindPublicationVenueForIterator = (KindPublicationVenueForIterator)findAncestorWithClass(this, KindPublicationVenueForIterator.class);
			pageContext.getOut().print(theKindPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

