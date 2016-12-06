package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNationalityZHIterator theDocument = (DocumentNationalityZHIterator)findAncestorWithClass(this, DocumentNationalityZHIterator.class);
			pageContext.getOut().print(theDocument.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

