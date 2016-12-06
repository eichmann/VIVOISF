package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDateTimeIntervalIterator theDatasetDateTimeIntervalIterator = (DatasetDateTimeIntervalIterator)findAncestorWithClass(this, DatasetDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDatasetDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
