package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeFAOSTATIterator theRelationship = (RelationshipCodeFAOSTATIterator)findAncestorWithClass(this, RelationshipCodeFAOSTATIterator.class);
			pageContext.getOut().print(theRelationship.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

