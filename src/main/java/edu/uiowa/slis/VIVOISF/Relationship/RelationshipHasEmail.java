package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasEmailIterator theRelationshipHasEmailIterator = (RelationshipHasEmailIterator)findAncestorWithClass(this, RelationshipHasEmailIterator.class);
			pageContext.getOut().print(theRelationshipHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

