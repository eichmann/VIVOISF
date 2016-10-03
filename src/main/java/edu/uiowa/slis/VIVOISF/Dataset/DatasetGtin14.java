package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGtin14Iterator theDataset = (DatasetGtin14Iterator)findAncestorWithClass(this, DatasetGtin14Iterator.class);
			pageContext.getOut().print(theDataset.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

