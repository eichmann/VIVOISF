package edu.uiowa.slis.VIVOISF.PostdocOrFellowAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrFellowAdvisingRelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrFellowAdvisingRelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrFellowAdvisingRelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			if (!thePostdocOrFellowAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(thePostdocOrFellowAdvisingRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			return thePostdocOrFellowAdvisingRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			thePostdocOrFellowAdvisingRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for label tag ");
		}
	}
}

