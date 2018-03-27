package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassTheTypeIterator theClass = (ClassTheTypeIterator)findAncestorWithClass(this, ClassTheTypeIterator.class);
			pageContext.getOut().print(theClass.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for theType tag ");
		}
		return SKIP_BODY;
	}
}

