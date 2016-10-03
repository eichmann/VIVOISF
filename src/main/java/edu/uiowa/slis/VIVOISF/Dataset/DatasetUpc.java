package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetUpcIterator theDataset = (DatasetUpcIterator)findAncestorWithClass(this, DatasetUpcIterator.class);
			pageContext.getOut().print(theDataset.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for upc tag ");
		}
		return SKIP_BODY;
	}
}

