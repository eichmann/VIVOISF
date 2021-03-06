package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRank currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipRankIterator theRelationship = (RelationshipRankIterator)findAncestorWithClass(this, RelationshipRankIterator.class);
			pageContext.getOut().print(theRelationship.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for rank tag ");
		}
		return SKIP_BODY;
	}
}

