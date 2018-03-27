package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyIAO_0000112 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyIAO_0000112 currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyIAO_0000112.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyIAO_0000112Iterator theObjectProperty = (ObjectPropertyIAO_0000112Iterator)findAncestorWithClass(this, ObjectPropertyIAO_0000112Iterator.class);
			pageContext.getOut().print(theObjectProperty.getIAO_0000112());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for IAO_0000112 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for IAO_0000112 tag ");
		}
		return SKIP_BODY;
	}
}

