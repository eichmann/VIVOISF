package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractDocumentationForIterator theAbstractDocumentationForIterator = (AbstractDocumentationForIterator)findAncestorWithClass(this, AbstractDocumentationForIterator.class);
			pageContext.getOut().print(theAbstractDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

