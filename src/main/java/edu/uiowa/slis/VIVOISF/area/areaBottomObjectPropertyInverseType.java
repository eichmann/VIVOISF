package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBottomObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBottomObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBottomObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaBottomObjectPropertyInverseIterator theareaBottomObjectPropertyInverseIterator = (areaBottomObjectPropertyInverseIterator)findAncestorWithClass(this, areaBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theareaBottomObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

