package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListENIterator theDataset = (DatasetNameListENIterator)findAncestorWithClass(this, DatasetNameListENIterator.class);
			pageContext.getOut().print(theDataset.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

