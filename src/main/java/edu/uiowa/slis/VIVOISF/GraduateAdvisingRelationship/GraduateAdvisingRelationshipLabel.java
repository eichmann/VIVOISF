package edu.uiowa.slis.VIVOISF.GraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateAdvisingRelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateAdvisingRelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateAdvisingRelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			if (!theGraduateAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theGraduateAdvisingRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			return theGraduateAdvisingRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			theGraduateAdvisingRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for label tag ");
		}
	}
}

