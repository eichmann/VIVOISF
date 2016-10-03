package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPageStartIterator theDataset = (DatasetPageStartIterator)findAncestorWithClass(this, DatasetPageStartIterator.class);
			pageContext.getOut().print(theDataset.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

