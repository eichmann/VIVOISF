package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentPublicationVenueForIterator theContinentPublicationVenueForIterator = (ContinentPublicationVenueForIterator)findAncestorWithClass(this, ContinentPublicationVenueForIterator.class);
			pageContext.getOut().print(theContinentPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

