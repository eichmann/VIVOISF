package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyDeprecated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyDeprecated currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyDeprecated.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyDeprecatedIterator theObjectProperty = (ObjectPropertyDeprecatedIterator)findAncestorWithClass(this, ObjectPropertyDeprecatedIterator.class);
			pageContext.getOut().print(theObjectProperty.getDeprecated());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for deprecated tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for deprecated tag ");
		}
		return SKIP_BODY;
	}
}

