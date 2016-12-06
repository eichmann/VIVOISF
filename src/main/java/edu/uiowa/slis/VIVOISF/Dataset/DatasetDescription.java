package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetDescriptionIterator theDataset = (DatasetDescriptionIterator)findAncestorWithClass(this, DatasetDescriptionIterator.class);
			pageContext.getOut().print(theDataset.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for description tag ");
		}
		return SKIP_BODY;
	}
}

