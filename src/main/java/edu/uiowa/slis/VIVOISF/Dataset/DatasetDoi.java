package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetDoiIterator theDataset = (DatasetDoiIterator)findAncestorWithClass(this, DatasetDoiIterator.class);
			pageContext.getOut().print(theDataset.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for doi tag ");
		}
		return SKIP_BODY;
	}
}

