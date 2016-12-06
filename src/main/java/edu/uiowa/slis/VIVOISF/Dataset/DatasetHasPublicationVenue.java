package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasPublicationVenueIterator theDatasetHasPublicationVenueIterator = (DatasetHasPublicationVenueIterator)findAncestorWithClass(this, DatasetHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDatasetHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

