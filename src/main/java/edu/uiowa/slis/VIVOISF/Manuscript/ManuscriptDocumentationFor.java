package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptDocumentationForIterator theManuscriptDocumentationForIterator = (ManuscriptDocumentationForIterator)findAncestorWithClass(this, ManuscriptDocumentationForIterator.class);
			pageContext.getOut().print(theManuscriptDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

