package edu.uiowa.slis.VIVOISF.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AnnotationPropertyDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyDisplayRankAnnotIterator theAnnotationProperty = (AnnotationPropertyDisplayRankAnnotIterator)findAncestorWithClass(this, AnnotationPropertyDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

