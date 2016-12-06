package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameShortITIterator theDataset = (DatasetNameShortITIterator)findAncestorWithClass(this, DatasetNameShortITIterator.class);
			pageContext.getOut().print(theDataset.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

