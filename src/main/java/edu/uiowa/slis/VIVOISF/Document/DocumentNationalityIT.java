package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityITIterator theDocument = (DocumentNationalityITIterator)findAncestorWithClass(this, DocumentNationalityITIterator.class);
			pageContext.getOut().print(theDocument.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

