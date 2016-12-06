package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListENIterator theDocument = (DocumentNameListENIterator)findAncestorWithClass(this, DocumentNameListENIterator.class);
			pageContext.getOut().print(theDocument.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

