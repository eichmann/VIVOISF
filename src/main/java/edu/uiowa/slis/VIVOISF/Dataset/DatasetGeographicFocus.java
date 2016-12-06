package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetGeographicFocusIterator theDatasetGeographicFocusIterator = (DatasetGeographicFocusIterator)findAncestorWithClass(this, DatasetGeographicFocusIterator.class);
			pageContext.getOut().print(theDatasetGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

