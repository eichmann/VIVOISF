package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionSemanticRelationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionSemanticRelationInverseIterator theDateTimeValuePrecisionSemanticRelationInverseIterator = (DateTimeValuePrecisionSemanticRelationInverseIterator)findAncestorWithClass(this, DateTimeValuePrecisionSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}
