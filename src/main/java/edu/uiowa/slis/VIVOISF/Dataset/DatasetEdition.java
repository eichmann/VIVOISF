package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetEditionIterator theDataset = (DatasetEditionIterator)findAncestorWithClass(this, DatasetEditionIterator.class);
			pageContext.getOut().print(theDataset.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for edition tag ");
		}
		return SKIP_BODY;
	}
}

