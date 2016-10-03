package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLccnIterator theDataset = (DatasetLccnIterator)findAncestorWithClass(this, DatasetLccnIterator.class);
			pageContext.getOut().print(theDataset.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for lccn tag ");
		}
		return SKIP_BODY;
	}
}

