package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasTitleIterator theRelationshipHasTitleIterator = (RelationshipHasTitleIterator)findAncestorWithClass(this, RelationshipHasTitleIterator.class);
			pageContext.getOut().print(theRelationshipHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

