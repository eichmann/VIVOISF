package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeISO3Iterator theRelationship = (RelationshipCodeISO3Iterator)findAncestorWithClass(this, RelationshipCodeISO3Iterator.class);
			pageContext.getOut().print(theRelationship.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

