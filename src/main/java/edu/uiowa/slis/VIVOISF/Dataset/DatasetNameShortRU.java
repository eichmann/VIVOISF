package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortRUIterator theDataset = (DatasetNameShortRUIterator)findAncestorWithClass(this, DatasetNameShortRUIterator.class);
			pageContext.getOut().print(theDataset.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

