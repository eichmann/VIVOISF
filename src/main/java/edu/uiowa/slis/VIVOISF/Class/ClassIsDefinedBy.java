package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassIsDefinedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassIsDefinedByIterator theClass = (ClassIsDefinedByIterator)findAncestorWithClass(this, ClassIsDefinedByIterator.class);
			pageContext.getOut().print(theClass.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

