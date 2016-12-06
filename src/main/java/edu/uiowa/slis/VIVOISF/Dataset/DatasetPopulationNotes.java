package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPopulationNotesIterator theDataset = (DatasetPopulationNotesIterator)findAncestorWithClass(this, DatasetPopulationNotesIterator.class);
			pageContext.getOut().print(theDataset.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

