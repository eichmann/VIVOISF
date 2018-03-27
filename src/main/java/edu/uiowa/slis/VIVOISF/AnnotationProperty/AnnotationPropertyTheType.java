package edu.uiowa.slis.VIVOISF.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AnnotationPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyTheTypeIterator theAnnotationProperty = (AnnotationPropertyTheTypeIterator)findAncestorWithClass(this, AnnotationPropertyTheTypeIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

