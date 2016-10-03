package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetShortDescriptionIterator theDataset = (DatasetShortDescriptionIterator)findAncestorWithClass(this, DatasetShortDescriptionIterator.class);
			pageContext.getOut().print(theDataset.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

