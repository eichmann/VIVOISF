package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityESIterator theDocument = (DocumentNationalityESIterator)findAncestorWithClass(this, DocumentNationalityESIterator.class);
			pageContext.getOut().print(theDocument.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

