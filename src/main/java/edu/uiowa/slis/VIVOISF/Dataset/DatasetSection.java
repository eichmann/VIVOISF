package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetSection currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetSectionIterator theDataset = (DatasetSectionIterator)findAncestorWithClass(this, DatasetSectionIterator.class);
			pageContext.getOut().print(theDataset.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for section tag ");
		}
		return SKIP_BODY;
	}
}

