package edu.uiowa.slis.VIVOISF.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AnnotationPropertyDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyDisplayLimitAnnotIterator theAnnotationProperty = (AnnotationPropertyDisplayLimitAnnotIterator)findAncestorWithClass(this, AnnotationPropertyDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

