package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyIsDefinedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyIsDefinedByIterator theObjectProperty = (ObjectPropertyIsDefinedByIterator)findAncestorWithClass(this, ObjectPropertyIsDefinedByIterator.class);
			pageContext.getOut().print(theObjectProperty.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

