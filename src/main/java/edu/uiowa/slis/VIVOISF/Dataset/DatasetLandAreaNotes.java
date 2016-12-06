package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLandAreaNotesIterator theDataset = (DatasetLandAreaNotesIterator)findAncestorWithClass(this, DatasetLandAreaNotesIterator.class);
			pageContext.getOut().print(theDataset.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

