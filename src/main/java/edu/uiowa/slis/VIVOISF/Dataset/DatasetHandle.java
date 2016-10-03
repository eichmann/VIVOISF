package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHandleIterator theDataset = (DatasetHandleIterator)findAncestorWithClass(this, DatasetHandleIterator.class);
			pageContext.getOut().print(theDataset.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for handle tag ");
		}
		return SKIP_BODY;
	}
}

