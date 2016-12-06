package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListRUIterator theDataset = (DatasetNameListRUIterator)findAncestorWithClass(this, DatasetNameListRUIterator.class);
			pageContext.getOut().print(theDataset.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

