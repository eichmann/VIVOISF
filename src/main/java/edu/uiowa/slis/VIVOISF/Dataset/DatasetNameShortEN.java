package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortENIterator theDataset = (DatasetNameShortENIterator)findAncestorWithClass(this, DatasetNameShortENIterator.class);
			pageContext.getOut().print(theDataset.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

