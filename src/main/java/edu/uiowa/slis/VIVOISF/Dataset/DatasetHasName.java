package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasNameIterator theDatasetHasNameIterator = (DatasetHasNameIterator)findAncestorWithClass(this, DatasetHasNameIterator.class);
			pageContext.getOut().print(theDatasetHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasName tag ");
		}
		return SKIP_BODY;
	}
}

