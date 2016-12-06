package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipGDPYearIterator theRelationship = (RelationshipGDPYearIterator)findAncestorWithClass(this, RelationshipGDPYearIterator.class);
			pageContext.getOut().print(theRelationship.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

