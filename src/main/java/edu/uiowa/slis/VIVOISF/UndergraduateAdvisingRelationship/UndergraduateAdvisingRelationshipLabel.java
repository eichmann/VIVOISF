package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			if (!theUndergraduateAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theUndergraduateAdvisingRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			return theUndergraduateAdvisingRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			theUndergraduateAdvisingRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for label tag ");
		}
	}
}

