package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortFRIterator theDataset = (DatasetNameShortFRIterator)findAncestorWithClass(this, DatasetNameShortFRIterator.class);
			pageContext.getOut().print(theDataset.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

