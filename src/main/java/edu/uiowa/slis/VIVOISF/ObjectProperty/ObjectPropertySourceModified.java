package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertySourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertySourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertySourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertySourceModifiedIterator theObjectProperty = (ObjectPropertySourceModifiedIterator)findAncestorWithClass(this, ObjectPropertySourceModifiedIterator.class);
			pageContext.getOut().print(theObjectProperty.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

