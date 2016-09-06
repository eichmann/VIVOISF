package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumDocumentationForIterator theErratumDocumentationForIterator = (ErratumDocumentationForIterator)findAncestorWithClass(this, ErratumDocumentationForIterator.class);
			pageContext.getOut().print(theErratumDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

