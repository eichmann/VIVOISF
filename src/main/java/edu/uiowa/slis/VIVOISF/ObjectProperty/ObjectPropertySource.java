package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertySource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertySource currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertySource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertySourceIterator theObjectProperty = (ObjectPropertySourceIterator)findAncestorWithClass(this, ObjectPropertySourceIterator.class);
			pageContext.getOut().print(theObjectProperty.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for source tag ");
		}
		return SKIP_BODY;
	}
}

