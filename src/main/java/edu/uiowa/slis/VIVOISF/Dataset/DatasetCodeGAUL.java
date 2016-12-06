package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeGAULIterator theDataset = (DatasetCodeGAULIterator)findAncestorWithClass(this, DatasetCodeGAULIterator.class);
			pageContext.getOut().print(theDataset.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

