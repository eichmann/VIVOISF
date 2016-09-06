package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRelatesIterator theDatasetRelatesIterator = (DatasetRelatesIterator)findAncestorWithClass(this, DatasetRelatesIterator.class);
			pageContext.getOut().print(theDatasetRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for relates tag ");
		}
		return SKIP_BODY;
	}
}

