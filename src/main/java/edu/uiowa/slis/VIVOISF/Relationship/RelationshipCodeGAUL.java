package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeGAULIterator theRelationship = (RelationshipCodeGAULIterator)findAncestorWithClass(this, RelationshipCodeGAULIterator.class);
			pageContext.getOut().print(theRelationship.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

