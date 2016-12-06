package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListESIterator theDataset = (DatasetNameListESIterator)findAncestorWithClass(this, DatasetNameListESIterator.class);
			pageContext.getOut().print(theDataset.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

