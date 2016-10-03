package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodenIterator theDataset = (DatasetCodenIterator)findAncestorWithClass(this, DatasetCodenIterator.class);
			pageContext.getOut().print(theDataset.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for coden tag ");
		}
		return SKIP_BODY;
	}
}

