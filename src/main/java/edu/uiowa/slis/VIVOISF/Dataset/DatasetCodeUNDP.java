package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeUNDPIterator theDataset = (DatasetCodeUNDPIterator)findAncestorWithClass(this, DatasetCodeUNDPIterator.class);
			pageContext.getOut().print(theDataset.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

