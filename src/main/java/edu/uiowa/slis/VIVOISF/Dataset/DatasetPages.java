package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPagesIterator theDataset = (DatasetPagesIterator)findAncestorWithClass(this, DatasetPagesIterator.class);
			pageContext.getOut().print(theDataset.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for pages tag ");
		}
		return SKIP_BODY;
	}
}

