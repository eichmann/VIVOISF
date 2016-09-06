package edu.uiowa.slis.VIVOISF.AdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingRelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingRelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingRelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			if (!theAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theAdvisingRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			return theAdvisingRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AdvisingRelationship theAdvisingRelationship = (AdvisingRelationship)findAncestorWithClass(this, AdvisingRelationship.class);
			theAdvisingRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for label tag ");
		}
	}
}

