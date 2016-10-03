package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLocatorIterator theDataset = (DatasetLocatorIterator)findAncestorWithClass(this, DatasetLocatorIterator.class);
			pageContext.getOut().print(theDataset.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for locator tag ");
		}
		return SKIP_BODY;
	}
}

