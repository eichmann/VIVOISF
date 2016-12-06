package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasURLIterator theDatasetHasURLIterator = (DatasetHasURLIterator)findAncestorWithClass(this, DatasetHasURLIterator.class);
			pageContext.getOut().print(theDatasetHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

