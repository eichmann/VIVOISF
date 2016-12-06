package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasEmailIterator theDatasetHasEmailIterator = (DatasetHasEmailIterator)findAncestorWithClass(this, DatasetHasEmailIterator.class);
			pageContext.getOut().print(theDatasetHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

