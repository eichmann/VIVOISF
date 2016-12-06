package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeUNIterator theDataset = (DatasetCodeUNIterator)findAncestorWithClass(this, DatasetCodeUNIterator.class);
			pageContext.getOut().print(theDataset.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

