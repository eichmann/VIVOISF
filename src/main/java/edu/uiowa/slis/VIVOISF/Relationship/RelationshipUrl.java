package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipUrlIterator theRelationship = (RelationshipUrlIterator)findAncestorWithClass(this, RelationshipUrlIterator.class);
			pageContext.getOut().print(theRelationship.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for url tag ");
		}
		return SKIP_BODY;
	}
}

