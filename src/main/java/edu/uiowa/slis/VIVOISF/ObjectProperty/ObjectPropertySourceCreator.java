package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertySourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertySourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertySourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertySourceCreatorIterator theObjectProperty = (ObjectPropertySourceCreatorIterator)findAncestorWithClass(this, ObjectPropertySourceCreatorIterator.class);
			pageContext.getOut().print(theObjectProperty.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

