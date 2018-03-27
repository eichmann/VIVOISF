package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyDisplayLimitAnnotIterator theObjectProperty = (ObjectPropertyDisplayLimitAnnotIterator)findAncestorWithClass(this, ObjectPropertyDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theObjectProperty.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

