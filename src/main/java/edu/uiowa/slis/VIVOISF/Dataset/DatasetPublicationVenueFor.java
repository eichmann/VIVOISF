package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPublicationVenueForIterator theDatasetPublicationVenueForIterator = (DatasetPublicationVenueForIterator)findAncestorWithClass(this, DatasetPublicationVenueForIterator.class);
			pageContext.getOut().print(theDatasetPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

