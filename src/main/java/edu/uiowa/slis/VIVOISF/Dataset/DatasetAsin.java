package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetAsinIterator theDataset = (DatasetAsinIterator)findAncestorWithClass(this, DatasetAsinIterator.class);
			pageContext.getOut().print(theDataset.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for asin tag ");
		}
		return SKIP_BODY;
	}
}

