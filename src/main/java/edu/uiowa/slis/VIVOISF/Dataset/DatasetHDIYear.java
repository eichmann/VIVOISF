package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHDIYearIterator theDataset = (DatasetHDIYearIterator)findAncestorWithClass(this, DatasetHDIYearIterator.class);
			pageContext.getOut().print(theDataset.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

