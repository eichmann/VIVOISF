package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDocumentationForIterator theDatasetDocumentationForIterator = (DatasetDocumentationForIterator)findAncestorWithClass(this, DatasetDocumentationForIterator.class);
			pageContext.getOut().print(theDatasetDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

