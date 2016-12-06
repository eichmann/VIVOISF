package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityARIterator theDocument = (DocumentNationalityARIterator)findAncestorWithClass(this, DocumentNationalityARIterator.class);
			pageContext.getOut().print(theDocument.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

