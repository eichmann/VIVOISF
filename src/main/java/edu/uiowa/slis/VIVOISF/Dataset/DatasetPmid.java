package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPmidIterator theDataset = (DatasetPmidIterator)findAncestorWithClass(this, DatasetPmidIterator.class);
			pageContext.getOut().print(theDataset.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for pmid tag ");
		}
		return SKIP_BODY;
	}
}

