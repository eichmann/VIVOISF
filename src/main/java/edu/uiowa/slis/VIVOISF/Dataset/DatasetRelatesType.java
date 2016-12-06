package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRelatesIterator theDatasetRelatesIterator = (DatasetRelatesIterator)findAncestorWithClass(this, DatasetRelatesIterator.class);
			pageContext.getOut().print(theDatasetRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for relates tag ");
		}
		return SKIP_BODY;
	}
}

