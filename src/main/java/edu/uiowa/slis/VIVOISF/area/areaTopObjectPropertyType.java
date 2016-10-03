package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaTopObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaTopObjectPropertyIterator theareaTopObjectPropertyIterator = (areaTopObjectPropertyIterator)findAncestorWithClass(this, areaTopObjectPropertyIterator.class);
			pageContext.getOut().print(theareaTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

