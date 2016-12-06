package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListARIterator theDataset = (DatasetNameListARIterator)findAncestorWithClass(this, DatasetNameListARIterator.class);
			pageContext.getOut().print(theDataset.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

