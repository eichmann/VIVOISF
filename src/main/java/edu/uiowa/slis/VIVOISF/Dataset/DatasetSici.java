package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetSici currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetSiciIterator theDataset = (DatasetSiciIterator)findAncestorWithClass(this, DatasetSiciIterator.class);
			pageContext.getOut().print(theDataset.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for sici tag ");
		}
		return SKIP_BODY;
	}
}

