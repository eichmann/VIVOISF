package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeISO2Iterator theRelationship = (RelationshipCodeISO2Iterator)findAncestorWithClass(this, RelationshipCodeISO2Iterator.class);
			pageContext.getOut().print(theRelationship.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

