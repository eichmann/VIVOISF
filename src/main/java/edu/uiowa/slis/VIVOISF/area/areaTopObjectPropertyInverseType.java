package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaTopObjectPropertyInverseIterator theareaTopObjectPropertyInverseIterator = (areaTopObjectPropertyInverseIterator)findAncestorWithClass(this, areaTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theareaTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

