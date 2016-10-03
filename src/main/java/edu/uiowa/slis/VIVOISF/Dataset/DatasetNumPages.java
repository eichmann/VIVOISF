package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNumPagesIterator theDataset = (DatasetNumPagesIterator)findAncestorWithClass(this, DatasetNumPagesIterator.class);
			pageContext.getOut().print(theDataset.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for numPages tag ");
		}
		return SKIP_BODY;
	}
}

