package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetFreetextKeywordIterator theDataset = (DatasetFreetextKeywordIterator)findAncestorWithClass(this, DatasetFreetextKeywordIterator.class);
			pageContext.getOut().print(theDataset.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

