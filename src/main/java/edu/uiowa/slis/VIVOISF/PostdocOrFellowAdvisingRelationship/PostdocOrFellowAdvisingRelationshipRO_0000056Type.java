package edu.uiowa.slis.VIVOISF.PostdocOrFellowAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrFellowAdvisingRelationshipRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrFellowAdvisingRelationshipRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrFellowAdvisingRelationshipRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOrFellowAdvisingRelationshipRO_0000056Iterator thePostdocOrFellowAdvisingRelationshipRO_0000056Iterator = (PostdocOrFellowAdvisingRelationshipRO_0000056Iterator)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationshipRO_0000056Iterator.class);
			pageContext.getOut().print(thePostdocOrFellowAdvisingRelationshipRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

