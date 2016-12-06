package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortESIterator theDataset = (DatasetNameShortESIterator)findAncestorWithClass(this, DatasetNameShortESIterator.class);
			pageContext.getOut().print(theDataset.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

