package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionSemanticRelationIterator theDateTimeValuePrecisionSemanticRelationIterator = (DateTimeValuePrecisionSemanticRelationIterator)findAncestorWithClass(this, DateTimeValuePrecisionSemanticRelationIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

