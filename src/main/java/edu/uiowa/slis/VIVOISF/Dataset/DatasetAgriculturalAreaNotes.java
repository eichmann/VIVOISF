package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetAgriculturalAreaNotesIterator theDataset = (DatasetAgriculturalAreaNotesIterator)findAncestorWithClass(this, DatasetAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theDataset.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

