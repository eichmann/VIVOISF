package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassInClassGroup extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassInClassGroup currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassInClassGroup.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassInClassGroupIterator theClass = (ClassInClassGroupIterator)findAncestorWithClass(this, ClassInClassGroupIterator.class);
			pageContext.getOut().print(theClass.getInClassGroup());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for inClassGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for inClassGroup tag ");
		}
		return SKIP_BODY;
	}
}

