package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetContent currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetContentIterator theDataset = (DatasetContentIterator)findAncestorWithClass(this, DatasetContentIterator.class);
			pageContext.getOut().print(theDataset.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for content tag ");
		}
		return SKIP_BODY;
	}
}

