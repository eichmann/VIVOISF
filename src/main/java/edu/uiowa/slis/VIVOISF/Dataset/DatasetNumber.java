package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNumberIterator theDataset = (DatasetNumberIterator)findAncestorWithClass(this, DatasetNumberIterator.class);
			pageContext.getOut().print(theDataset.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for number tag ");
		}
		return SKIP_BODY;
	}
}

