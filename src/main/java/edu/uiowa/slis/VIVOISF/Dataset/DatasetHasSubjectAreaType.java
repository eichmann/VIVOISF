package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasSubjectAreaIterator theDatasetHasSubjectAreaIterator = (DatasetHasSubjectAreaIterator)findAncestorWithClass(this, DatasetHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDatasetHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

