package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyIAO_0000117 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyIAO_0000117 currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyIAO_0000117.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyIAO_0000117Iterator theObjectProperty = (ObjectPropertyIAO_0000117Iterator)findAncestorWithClass(this, ObjectPropertyIAO_0000117Iterator.class);
			pageContext.getOut().print(theObjectProperty.getIAO_0000117());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for IAO_0000117 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for IAO_0000117 tag ");
		}
		return SKIP_BODY;
	}
}

