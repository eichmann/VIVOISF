package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyEditorialNoteType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyEditorialNoteType currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyEditorialNoteType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyEditorialNoteIterator theObjectPropertyEditorialNoteIterator = (ObjectPropertyEditorialNoteIterator)findAncestorWithClass(this, ObjectPropertyEditorialNoteIterator.class);
			pageContext.getOut().print(theObjectPropertyEditorialNoteIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

