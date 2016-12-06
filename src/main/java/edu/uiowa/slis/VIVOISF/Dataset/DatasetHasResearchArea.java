package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasResearchAreaIterator theDatasetHasResearchAreaIterator = (DatasetHasResearchAreaIterator)findAncestorWithClass(this, DatasetHasResearchAreaIterator.class);
			pageContext.getOut().print(theDatasetHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

