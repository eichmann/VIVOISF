package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassDisplayLimitAnnotIterator theClass = (ClassDisplayLimitAnnotIterator)findAncestorWithClass(this, ClassDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theClass.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

