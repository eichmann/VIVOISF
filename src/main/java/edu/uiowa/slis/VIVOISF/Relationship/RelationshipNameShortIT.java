package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortITIterator theRelationship = (RelationshipNameShortITIterator)findAncestorWithClass(this, RelationshipNameShortITIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

