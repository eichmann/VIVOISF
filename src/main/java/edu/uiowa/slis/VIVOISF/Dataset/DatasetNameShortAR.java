package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortARIterator theDataset = (DatasetNameShortARIterator)findAncestorWithClass(this, DatasetNameShortARIterator.class);
			pageContext.getOut().print(theDataset.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

