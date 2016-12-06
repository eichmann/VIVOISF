package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipDateTimeValueIterator theRelationshipDateTimeValueIterator = (RelationshipDateTimeValueIterator)findAncestorWithClass(this, RelationshipDateTimeValueIterator.class);
			pageContext.getOut().print(theRelationshipDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
