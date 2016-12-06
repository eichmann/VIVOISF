package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDateTimeIntervalIterator theDatasetDateTimeIntervalIterator = (DatasetDateTimeIntervalIterator)findAncestorWithClass(this, DatasetDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDatasetDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

