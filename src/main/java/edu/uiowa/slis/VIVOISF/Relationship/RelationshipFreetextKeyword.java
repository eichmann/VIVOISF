package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipFreetextKeywordIterator theRelationship = (RelationshipFreetextKeywordIterator)findAncestorWithClass(this, RelationshipFreetextKeywordIterator.class);
			pageContext.getOut().print(theRelationship.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

