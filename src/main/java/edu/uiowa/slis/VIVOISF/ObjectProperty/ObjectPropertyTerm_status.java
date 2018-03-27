package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyTerm_status extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyTerm_statusIterator theObjectProperty = (ObjectPropertyTerm_statusIterator)findAncestorWithClass(this, ObjectPropertyTerm_statusIterator.class);
			pageContext.getOut().print(theObjectProperty.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for term_status tag ");
		}
		return SKIP_BODY;
	}
}

