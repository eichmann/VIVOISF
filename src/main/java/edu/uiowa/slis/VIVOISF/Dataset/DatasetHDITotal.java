package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHDITotalIterator theDataset = (DatasetHDITotalIterator)findAncestorWithClass(this, DatasetHDITotalIterator.class);
			pageContext.getOut().print(theDataset.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

