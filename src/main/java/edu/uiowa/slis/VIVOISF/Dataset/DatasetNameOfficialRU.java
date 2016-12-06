package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialRUIterator theDataset = (DatasetNameOfficialRUIterator)findAncestorWithClass(this, DatasetNameOfficialRUIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

