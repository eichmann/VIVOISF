package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassDescriptionAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassDescriptionAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassDescriptionAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassDescriptionAnnotIterator theClass = (ClassDescriptionAnnotIterator)findAncestorWithClass(this, ClassDescriptionAnnotIterator.class);
			pageContext.getOut().print(theClass.getDescriptionAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for descriptionAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for descriptionAnnot tag ");
		}
		return SKIP_BODY;
	}
}

