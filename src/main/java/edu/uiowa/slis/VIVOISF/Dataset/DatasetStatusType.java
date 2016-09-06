package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetStatusIterator theDatasetStatusIterator = (DatasetStatusIterator)findAncestorWithClass(this, DatasetStatusIterator.class);
			pageContext.getOut().print(theDatasetStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for status tag ");
		}
		return SKIP_BODY;
	}
}

