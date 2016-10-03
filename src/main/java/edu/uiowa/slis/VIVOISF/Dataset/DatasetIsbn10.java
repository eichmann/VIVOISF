package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetIsbn10Iterator theDataset = (DatasetIsbn10Iterator)findAncestorWithClass(this, DatasetIsbn10Iterator.class);
			pageContext.getOut().print(theDataset.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

