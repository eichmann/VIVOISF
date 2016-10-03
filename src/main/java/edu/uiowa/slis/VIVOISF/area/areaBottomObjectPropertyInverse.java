package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaBottomObjectPropertyInverseIterator theareaBottomObjectPropertyInverseIterator = (areaBottomObjectPropertyInverseIterator)findAncestorWithClass(this, areaBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theareaBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing area for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

