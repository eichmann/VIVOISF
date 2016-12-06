package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasPublicationVenueIterator theDatasetHasPublicationVenueIterator = (DatasetHasPublicationVenueIterator)findAncestorWithClass(this, DatasetHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDatasetHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

