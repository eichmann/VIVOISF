package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBottomObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaBottomObjectPropertyIterator theareaBottomObjectPropertyIterator = (areaBottomObjectPropertyIterator)findAncestorWithClass(this, areaBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theareaBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

