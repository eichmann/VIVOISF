package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPresentedAtIterator theDatasetPresentedAtIterator = (DatasetPresentedAtIterator)findAncestorWithClass(this, DatasetPresentedAtIterator.class);
			pageContext.getOut().print(theDatasetPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

