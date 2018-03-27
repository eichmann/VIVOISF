package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyDescriptionAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyDescriptionAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyDescriptionAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyDescriptionAnnotIterator theObjectProperty = (ObjectPropertyDescriptionAnnotIterator)findAncestorWithClass(this, ObjectPropertyDescriptionAnnotIterator.class);
			pageContext.getOut().print(theObjectProperty.getDescriptionAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for descriptionAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for descriptionAnnot tag ");
		}
		return SKIP_BODY;
	}
}

