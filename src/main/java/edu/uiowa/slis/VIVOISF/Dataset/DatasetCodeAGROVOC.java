package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeAGROVOCIterator theDataset = (DatasetCodeAGROVOCIterator)findAncestorWithClass(this, DatasetCodeAGROVOCIterator.class);
			pageContext.getOut().print(theDataset.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

