package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetTheAbstractIterator theDataset = (DatasetTheAbstractIterator)findAncestorWithClass(this, DatasetTheAbstractIterator.class);
			pageContext.getOut().print(theDataset.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

