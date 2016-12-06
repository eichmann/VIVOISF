package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCountryAreaNotesIterator theDataset = (DatasetCountryAreaNotesIterator)findAncestorWithClass(this, DatasetCountryAreaNotesIterator.class);
			pageContext.getOut().print(theDataset.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

