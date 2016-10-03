package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetUri currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetUriIterator theDataset = (DatasetUriIterator)findAncestorWithClass(this, DatasetUriIterator.class);
			pageContext.getOut().print(theDataset.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for uri tag ");
		}
		return SKIP_BODY;
	}
}

