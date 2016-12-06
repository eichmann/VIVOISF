package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameListFRIterator theDataset = (DatasetNameListFRIterator)findAncestorWithClass(this, DatasetNameListFRIterator.class);
			pageContext.getOut().print(theDataset.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

