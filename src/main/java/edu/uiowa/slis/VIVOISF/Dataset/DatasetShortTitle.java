package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetShortTitleIterator theDataset = (DatasetShortTitleIterator)findAncestorWithClass(this, DatasetShortTitleIterator.class);
			pageContext.getOut().print(theDataset.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

