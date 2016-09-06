package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDateTimeValueIterator theDatasetDateTimeValueIterator = (DatasetDateTimeValueIterator)findAncestorWithClass(this, DatasetDateTimeValueIterator.class);
			pageContext.getOut().print(theDatasetDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

