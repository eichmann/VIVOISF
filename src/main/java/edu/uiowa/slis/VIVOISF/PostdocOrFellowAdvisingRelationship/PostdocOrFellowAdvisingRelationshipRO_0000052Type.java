package edu.uiowa.slis.VIVOISF.PostdocOrFellowAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrFellowAdvisingRelationshipRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrFellowAdvisingRelationshipRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrFellowAdvisingRelationshipRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOrFellowAdvisingRelationshipRO_0000052Iterator thePostdocOrFellowAdvisingRelationshipRO_0000052Iterator = (PostdocOrFellowAdvisingRelationshipRO_0000052Iterator)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationshipRO_0000052Iterator.class);
			pageContext.getOut().print(thePostdocOrFellowAdvisingRelationshipRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

