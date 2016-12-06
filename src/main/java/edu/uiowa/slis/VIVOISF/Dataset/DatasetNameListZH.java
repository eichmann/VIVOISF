package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListZHIterator theDataset = (DatasetNameListZHIterator)findAncestorWithClass(this, DatasetNameListZHIterator.class);
			pageContext.getOut().print(theDataset.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

