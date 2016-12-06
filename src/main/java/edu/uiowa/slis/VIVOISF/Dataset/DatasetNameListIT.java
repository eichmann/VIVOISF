package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListITIterator theDataset = (DatasetNameListITIterator)findAncestorWithClass(this, DatasetNameListITIterator.class);
			pageContext.getOut().print(theDataset.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

