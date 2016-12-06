package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasTitleIterator theDocumentHasTitleIterator = (DocumentHasTitleIterator)findAncestorWithClass(this, DocumentHasTitleIterator.class);
			pageContext.getOut().print(theDocumentHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

