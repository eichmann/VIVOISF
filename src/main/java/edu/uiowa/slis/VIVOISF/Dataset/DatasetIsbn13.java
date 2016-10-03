package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetIsbn13Iterator theDataset = (DatasetIsbn13Iterator)findAncestorWithClass(this, DatasetIsbn13Iterator.class);
			pageContext.getOut().print(theDataset.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

