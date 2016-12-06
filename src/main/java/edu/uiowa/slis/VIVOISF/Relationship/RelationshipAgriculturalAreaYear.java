package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipAgriculturalAreaYearIterator theRelationship = (RelationshipAgriculturalAreaYearIterator)findAncestorWithClass(this, RelationshipAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theRelationship.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

