package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertySourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertySourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertySourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertySourceIdentifierIterator theObjectProperty = (ObjectPropertySourceIdentifierIterator)findAncestorWithClass(this, ObjectPropertySourceIdentifierIterator.class);
			pageContext.getOut().print(theObjectProperty.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

