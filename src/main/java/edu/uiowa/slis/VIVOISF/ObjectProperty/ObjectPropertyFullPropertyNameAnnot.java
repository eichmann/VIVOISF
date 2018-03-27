package edu.uiowa.slis.VIVOISF.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyFullPropertyNameAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ObjectPropertyFullPropertyNameAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyFullPropertyNameAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyFullPropertyNameAnnotIterator theObjectProperty = (ObjectPropertyFullPropertyNameAnnotIterator)findAncestorWithClass(this, ObjectPropertyFullPropertyNameAnnotIterator.class);
			pageContext.getOut().print(theObjectProperty.getFullPropertyNameAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for fullPropertyNameAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for fullPropertyNameAnnot tag ");
		}
		return SKIP_BODY;
	}
}

