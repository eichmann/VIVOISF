package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPublicationVenueForIterator theJournalPublicationVenueForIterator = (JournalPublicationVenueForIterator)findAncestorWithClass(this, JournalPublicationVenueForIterator.class);
			pageContext.getOut().print(theJournalPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

